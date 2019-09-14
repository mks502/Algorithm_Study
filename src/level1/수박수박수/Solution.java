package level1.수박수박수;

class Solution {
	public String solution(int n) {
		String waterMelon = "수박";
		StringBuilder answer = new StringBuilder("");
		for (int i = 0; i < n; i++) {
			answer.append(waterMelon.charAt(i % 2));
		}
		return answer.toString();
	}
}