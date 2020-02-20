class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++){
            answer[i] = toBinaryString(arr1[i] | arr2[i],n);
            answer[i]=answer[i].replaceAll("0"," ");
            answer[i]=answer[i].replaceAll("1","#");
        }
        return answer;
    }
    public String toBinaryString(int num,int length){
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(num));
        for(int i=sb.length(); i<length; i++){
            sb.insert(0,"0");
        }
        return sb.toString();
    }
}