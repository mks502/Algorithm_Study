package level1.자릿수_더하기;
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp; //각 자릿수를 임시 저장할 변수
        while(n>0){
            temp=n%10;
            n=n/10;
            answer+=temp;
        }
        return answer;
    }
}