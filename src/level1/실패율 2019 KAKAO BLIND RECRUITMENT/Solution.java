import java.util.*;
class Solution {
    class Stage implements Comparable<Stage>{
        int idx;
        double failRate;
        public Stage(int idx,double failRate){
            this.idx = idx;
            this.failRate = failRate;
        }

        public int compareTo(Stage stage){
            if(this.failRate < stage.failRate){
                return 1;
            }
            else if(this.failRate==stage.failRate){
                if(this.idx < stage.idx)
                    return -1;
                else
                    return 1;
            }
            else
                return -1;
        }
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        long[] num = new long[N];
        for(int i=0; i<stages.length; i++){
            for(int j=0; j<N; j++){
                if(stages[i]>j){
                    num[j]++;
                }
                if(stages[i] >j+1){
                    answer[j]++;
                }
            }
        }
        Stage[] res = new Stage[answer.length];
        for(int i=0; i<answer.length; i++){
            if(num[i] != 0)
                res[i] = new Stage(i+1,(double)Math.abs(answer[i]-num[i])/num[i]);
            else
                res[i] = new Stage(i+1,(double)0);
        }
        Arrays.sort(res);
        for(int i=0; i<res.length; i++){
            answer[i] = res[i].idx;
        }
        return answer;
    }
}