import java.util.*;
class Solution {
    boolean solution(String s) {
        int count=0;
        for(int i=0; i<s.length(); i++){
            char currentChar = s.charAt(i);
            if(currentChar == '('){
                count++;
            }
            else{
                if(count<=0){
                    return false;
                }
                count--;
            }
        }
        if(count==0){
            return true;
        }
        return false;
    }
}