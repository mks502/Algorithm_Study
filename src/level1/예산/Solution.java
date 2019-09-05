package level1.예산;

import java.util.*;

class Solution {
	public int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d); // 물건마다 가치가 정해진 것이 아니고 단지 최대한 많은 물품을 사는게 목적
		for (int price : d) { // 오름차순으로 정렬
			if (budget >= price) {
				budget -= price;
				answer++;
			} else
				return answer; // 남은 예산보다 해당 가격이 비싸면 더 이상 구매 불가
		}
		return answer;
	}
}