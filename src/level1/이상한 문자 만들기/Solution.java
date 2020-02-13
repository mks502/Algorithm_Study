class Solution {
    public String solution(String s) {
        String [] words = s.split(" ",-1);
        String [] answer = new String[words.length];
        for(int i=0; i<words.length; i++)
            answer[i] = convert(words[i]);
        return String.join(" ", answer);
    }
    private String convert(String word){
        StringBuilder result= new StringBuilder("");
        for(int i=0; i<word.length(); i++) {
            if(i%2 ==0){
                result.append(Character.toUpperCase(word.charAt(i)));
            }
            else{
                result.append(Character.toLowerCase(word.charAt(i)));
            }
        }
        return result.toString();
    }
}