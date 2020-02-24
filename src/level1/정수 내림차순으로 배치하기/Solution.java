import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> digitList = new ArrayList<Long>();
        int num = 0;
        while(n>0){
            digitList.add(n%10);
            n=n/10;
            num++;
        }
        for(int i=0; i<digitList.size(); i++){
            for(int j=0; j<digitList.size()-i-1; j++){
                if(digitList.get(j) > digitList.get(j+1)){
                    Long temp = digitList.get(j);
                    digitList.set(j,digitList.get(j+1));
                    digitList.set(j+1,temp);
                }
            }
        }
        n=1;
        for(int i=0; i<num; i++){
            answer+=n*digitList.get(i);
            n*=10;
        }
        return answer;
    }
}