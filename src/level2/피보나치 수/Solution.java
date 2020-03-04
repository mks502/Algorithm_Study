class Solution {

    public int[] d = new int[100001];

    public int solution(int n) {
        int answer = 0;
        d[0] = 0;
        d[1] = 1;
        answer= fibonacci(n);
        return answer;
    }
    public int fibonacci(int n){
        if(d[n]>0)
            return d[n];
        if(n>1){
            d[n] = fibonacci(n-1)%1234567 + fibonacci(n-2)%1234567;
        }
        return d[n]%1234567;
    }
}