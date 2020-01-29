package level1.하샤드수;

class Solution {
	public boolean solution(int x) {
		int temp = x;
		int sum = 0;
		while (temp >= 1) {
			sum += temp % 10;
			temp /= 10;
		}
		return x % sum == 0 ? true : false;
	}
}