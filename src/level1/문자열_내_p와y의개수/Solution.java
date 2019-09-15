package level1.문자열_내_p와y의개수;

class Solution {
	boolean solution(String s) {
		s = s.toUpperCase();
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i); // 현재 문자
			if (currentChar == 'P')
				num++;
			else if (currentChar == 'Y')
				num--;
		}
		return num == 0 ? true : false;
	}
}