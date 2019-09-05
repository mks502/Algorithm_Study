package level1.모의고사;

import java.util.ArrayList;

class Solution {
	public int[] solution(int[] answers) {
		ArrayList<Integer> answerList = new ArrayList<Integer>();
		int[] student1 = { 1, 2, 3, 4, 5 };
		int[] student2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] student3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int[] score = new int[3];
		for (int i = 0; i < answers.length; i++) {
			if (student1[i % 5] == answers[i]) {
				score[0]++;
			}
			if (student2[i % 8] == answers[i]) {
				score[1]++;
			}
			if (student3[i % 10] == answers[i]) {
				score[2]++;
			}
		}
		int max = 0;
		for (int i = 0; i < 3; i++) {
			if (max == score[i])
				answerList.add(i + 1);
			else if (max < score[i]) {
				max = score[i];
				answerList.clear();
				answerList.add(i + 1);
			}
		}
		int[] answer = new int[answerList.size()];
		// for(int i=0; i<answerList.size(); i++) answer[i] = answerList.get(i); //
		// ArrayList<Intger> -> int[]
		answer = answerList.stream().mapToInt(i -> i).toArray();
		return answer;
	}
}