import java.util.*;
class Solution {
    public int solution(String arrangement) {
        int answer = 0;
        Stack<Integer> stack =  new Stack<>();
        for(int i=0; i<arrangement.length(); i++){
            char currentChar = arrangement.charAt(i);
            if(currentChar == '('){
                stack.push(i);
            }
            else{
                //레이저인경우
                if(stack.peek() == i-1){
                    stack.pop();
                    answer+=stack.size();
                }
                else{
                    stack.pop();
                    answer+=1;
                }
            }
        }
        return answer;
    }
}