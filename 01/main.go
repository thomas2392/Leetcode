// source: https://leetcode.com/problems/two-sum/
package main

import "fmt"

func main() {
	nums := []int{2, 7, 11, 15}
	target := 9
	result := twoSum(nums, target)
	fmt.Println(result)
}

func twoSum(nums []int, target int) []int {
	hashMap := make(map[int]int)
	for i, num := range nums {
		complement := target - num
		if index, found := hashMap[complement]; found {
			return []int{index, i}
		}
		hashMap[num] = i
	}
	return nil
}
