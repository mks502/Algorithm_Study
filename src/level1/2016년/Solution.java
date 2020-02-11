class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU",};
        int[] monthDates = {31,29,31,30,31,30,31,31,30,31,30,31};
        int date=-1;
        for(int i=0; i<a-1; i++){
            date+=monthDates[i];
        }
        date+=b;

        return day[date%7];
    }
}