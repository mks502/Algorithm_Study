package level1.시저암호;

class Solution {
	public String solution(String s, int n) {
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char character = s.charAt(i);
			if (character >= 'a' && character <= 'z') {
				character = (char) ((character + n - 'a') % 26 + 'a');
			} else if (character >= 'A' && character <= 'Z') {
				character = (char) ((character + n - 'A') % 26 + 'A');
			}
			answer.append(character);
		}
		return answer.toString();
	}
}
