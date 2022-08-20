package main

import (
	"fmt"
	"log"
	"net/http"
)

func sayhelloName(w http.ResponseWriter, _ *http.Request) {
	fmt.Fprintf(w, "Hello 20:36!") // 这个写入到 w 的是输出到客户端的
}

func main() {
	port := ":80"
	log.Print(fmt.Sprintf("app is running at %v", port))

	http.HandleFunc("/", sayhelloName)     // 设置访问的路由
	err := http.ListenAndServe(":80", nil) // 设置监听的端口
	if err != nil {
		log.Fatal("ListenAndServe: ", err)
	}
}
