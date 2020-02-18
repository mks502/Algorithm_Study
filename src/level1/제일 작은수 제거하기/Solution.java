import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        int minIndex = 0;
        for(int i=0; i<arr.length; i++){
            if( arr[minIndex] > arr[i])   minIndex = i;
            answerList.add(arr[i]);
        }
        answerList.remove(minIndex);
        if(answerList.size()==0)
            return new int[] {-1};
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}