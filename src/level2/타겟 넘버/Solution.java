class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        go(numbers,target,0);
        return answer;
    }
    public void go(int[] numbers,int target,int depth){
        if(numbers.length == depth){
            int sum =0;
            for(int i=0; i<numbers.length; i++){
                sum+=numbers[i];
            }
            if(sum == target)
                answer++;
        }
        else{
            numbers[depth] *= -1;
            go(numbers,target,depth+1);

            numbers[depth] *= -1;
            go(numbers,target,depth+1);
        }
    }
}