package main

import "fmt"

func lengthOfLongestSubstring(s string) int {
	charIndexMap := make(map[rune]int)
	maxLength := 0
	start := 0

	for i, char := range s {
		if index, found := charIndexMap[char]; found && index >= start {
			start = index + 1
		}
		charIndexMap[char] = i
		if i-start+1 > maxLength {
			maxLength = i - start + 1
		}
	}

	return maxLength
}

func main() {
	s := "abcabcbb"
	fmt.Println("Length of the longest substring without repeating characters:", lengthOfLongestSubstring(s))
}
