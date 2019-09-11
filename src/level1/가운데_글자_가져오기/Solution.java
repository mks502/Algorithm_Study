package level1.가운데_글자_가져오기;

class Solution {
	public String solution(String s) {
		String answer = "";
		int mid = s.length() / 2;
		if (s.length() % 2 == 0) { // 짝수 두글자
			answer = s.substring(mid - 1, mid + 1);
		} else {
			answer = s.substring(mid, mid + 1);
		}
		return answer;
	}
}