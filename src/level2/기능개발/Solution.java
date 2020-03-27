import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int [] temp = new int[100];
        int [] day = caculateDay(progresses,speeds);
        int max = 101;
        int j=0;
        for(int i=0; i<day.length; i++){
            if(i==0){
                max = day[i];
                temp[j]++;
            }
            else{
                if( max < day[i] ){
                    temp[++j]++;
                    max=day[i];
                }
                else{
                    temp[j]++;
                }
            }
        }
        int [] answer = new int[j+1];
        for(int i=0; i<=j; i++)
            answer[i] = temp[i];
        return answer;
    }

    public int[] caculateDay(int[] progresses,int[] speeds){
        int [] day = new int[progresses.length];

        for(int i=0; i<progresses.length; i++){
            day[i] = (100-progresses[i]) / speeds[i];
            if( (100-progresses[i]) % speeds[i] >0 )
                day[i]++;
        }
        return day;
    }
}