package level1.두_정수의_합;

class Solution {
	public long solution(int a, int b) {
		int temp;
		long answer = 0;
		if(a>b) {
			temp=b;
			b=a;
			a=temp;
		}
		for(int i=a; i<=b; i++) answer += i;
		return answer;
	}
}