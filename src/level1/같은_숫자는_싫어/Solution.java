package level1.같은_숫자는_싫어;

import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int temp=arr[0];      //바로 전에 숫자와 중복 비교하기 위한 임시 변수
        arrayList.add(temp);  //첫 값은 당연히 중복되지 않은 수이므로 넣어주고 시작
        for(int i=1; i < arr.length; i++){
            if( temp != arr[i] )
                arrayList.add(arr[i]);
            temp=arr[i];
        }
        int [] answer = new int[arrayList.size()];
        for(int i=0; i<arrayList.size(); i++) answer[i] = arrayList.get(i);
        return answer;
	}
}
