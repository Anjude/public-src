package main

import (
	"encoding/json"
	"fmt"
	"log"
	"net/http"

	"go-tmp/define"
)

//验证接口
func sayhelloName(w http.ResponseWriter, r *http.Request) {
	values := r.URL.Query()
	arg := values.Get("name")

	msg, _ := json.Marshal(define.JsonResult{Code: 0, Msg: fmt.Sprint("hello ", arg)})

	w.Header().Set("content-type", "text/json")
	w.Write(msg)
}

func main() {
	port := ":80"
	log.Print(fmt.Sprintf("app is running at %v", port))

	// 设置访问的路由
	http.HandleFunc("/", sayhelloName)

	// 设置监听的端口
	err := http.ListenAndServe(":80", nil)

	if err != nil {
		log.Fatal("ListenAndServe: ", err)
	}
}
