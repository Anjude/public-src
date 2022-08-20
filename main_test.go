package main

import (
	"fmt"
	"net/http"
	"testing"

	assert "gopkg.in/go-playground/assert.v1"
)

func TestHello(t *testing.T) {
	resp, _ := http.Get("http://localhost")
	fmt.Println(resp)
	assert.Equal(t, 1, 1)
}

func TestArray(t *testing.T) {
	a := []int{111, 222}
	b := a
	a[1] = 333

	fmt.Printf("%+v", a) // 111, 333
	fmt.Printf("%+v", b) // 111, 222
}

func TestPointer(t *testing.T) {
	a, _ := 1, "22"

	fmt.Println(a)
}

func aaa(lzx *int, b int) {
	c := &CCC{1, 2}
	c.x = 3
	c.y = 4

	temp := 10
	lzx = &temp
	b = 20
	fmt.Printf("%+v", c)
}

// 鸭子类型 duck type
type Duck interface {
	Eat() string
	Run() string
}

type BBB struct {
}

func (b BBB) Eat() string {
	return ""
}

func (b BBB) Run() string {
	return ""
}

type CCC struct {
	x int
	y int
}

func (b CCC) Eat() string {
	return ""
}

func (b CCC) Run() string {
	return ""
}
