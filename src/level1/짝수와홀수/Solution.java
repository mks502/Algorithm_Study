package level1.짝수와홀수;

class Solution {
	public String solution(int num) {
		return Math.abs(num % 2) == 1 ? "Odd" : "Even";
	}
}