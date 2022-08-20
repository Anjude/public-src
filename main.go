package main

import (
	"encoding/json"
	"fmt"
	"io/ioutil"
	"log"
	"net/http"

	"go-tmp/define"
)

func test() {
	// fmt.Println("111
	// 222")

	fmt.Println(`111
		shfoksdfl
	222`)
}

type JsonResult struct {
	Code int    `json:"code"`
	Msg  string `json:"msg"`
}

//验证接口
func lzx(w http.ResponseWriter, r *http.Request) {
	values := r.URL.Query()
	arg := values.Get("name")

	msg, _ := json.Marshal(JsonResult{Code: 0, Msg: fmt.Sprint("hello ", arg)})

	w.Header().Set("content-type", "text/json")
	w.Write(msg)
}

func xz(w http.ResponseWriter, r *http.Request) {
	data, _ := ioutil.ReadAll(r.Body)
	fmt.Printf("%+v", data)
	// 处理
	// xxx
	msg, _ := json.Marshal(define.JsonResult{Code: 0, Msg: fmt.Sprint("hello ", data)})

	w.Header().Set("content-type", "text/json")
	w.Write(msg)
}

func main() {
	port := ":80"
	log.Print(fmt.Sprintf("app is running at %v", port))

	// 设置访问的路由
	http.HandleFunc("/", lzx)
	http.HandleFunc("/api/xz", xz)

	// 设置监听的端口
	err := http.ListenAndServe(":80", nil)

	if err != nil {
		log.Fatal("ListenAndServe: ", err)
	}
}
