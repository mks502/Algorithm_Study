class Solution {
    public String solution(String s) {
        int max=0;
        int min=0;
        String [] numString = s.split(" ");
        for(int i=0; i<numString.length; i++){
            int num = Integer.parseInt(numString[i]);
            if(i==0) {
                max = num;
                min = num;
            }
            if(max < num){
                max = num;
            }
            if(min > num){
                min = num;
            }
        }
        return min+" "+max;
    }
}