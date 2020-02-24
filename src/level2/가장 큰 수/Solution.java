import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        Integer[] nums = new Integer[numbers.length];
        for(int i=0; i<numbers.length; i++){
            nums[i] = numbers[i];
        }
        Arrays.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String temp1 = o1.toString();
                String temp2 = o2.toString();
                if( Integer.parseInt(temp1+temp2) > Integer.parseInt(temp2+temp1) ){
                    return -1;
                }
                else if( Integer.parseInt(temp1+temp2) < Integer.parseInt(temp2+temp1) ){
                    return 1;
                }
                else return 0;
            }
        });
        for(int i=0; i<numbers.length; i++){
            sb.append(nums[i].toString());
        }
        if(sb.charAt(0)=='0')
            return "0";

        return sb.toString();
    }
}