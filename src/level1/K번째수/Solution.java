package level1.K번째수;

import java.util.*;

class Solution {
	public int[] solution(int[] array, int[][] commands) {
		ArrayList answerList = new ArrayList<Integer>();
		for (int i = 0; i < commands.length; i++) {
			int kthNum = KthNumber(array, commands[i]);
			answerList.add(kthNum);
		}
		int[] answer = new int[answerList.size()];
		for (int i = 0; i < answerList.size(); i++)
			answer[i] = (int) answerList.get(i);
		return answer;
	}

	// k번째 수를 가져오는 함수
	public int KthNumber(int[] arr, int[] command) {
		int[] result = Arrays.copyOfRange(arr, command[0] - 1, command[1]);
		Arrays.sort(result);
		return result[command[2] - 1]; // command[2]는 몇 번째 수인지 담음 배열이므로 -1;
	}
}