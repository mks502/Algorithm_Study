package level1.평균구하기;

class Solution {
	public double solution(int[] arr) {
		double answer = 0;
		for (int num : arr)
			answer += num;
		answer /= arr.length;
		return answer;
	}
}