package level1.완주하지못한선수;
import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> hashMap = new HashMap<String,Integer>();
        for(String one : participant){
            Integer num = (Integer)hashMap.get(one);   //이름에 대한 인원
            if(num == null){        //num 이 null 이면 아직 해당 이름에 대한 인원이 아무도 없음
                hashMap.put(one,1);
            }
            else{
                num++;
                hashMap.put(one,num);
            }
        }
        for(String one : completion){
            Integer num = (Integer)hashMap.get(one);   //이름에 대한 인원
            num--;
            hashMap.put(one,num);
        }
        for(Map.Entry<String,Integer> one : hashMap.entrySet() ){
            if( (Integer)one.getValue() > 0){
                answer=one.getKey();
                return answer;
            }
        }
        return answer;
    }
    
    
    
    ///////Iterator 사용
    public String solution2(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> hashMap = new HashMap<String,Integer>();
        for(String one : participant){
            Integer num = (Integer)hashMap.get(one);   //이름에 대한 인원
            if(num == null){
                hashMap.put(one,1);
            }
            else{
                num++;
                hashMap.put(one,num);
            }
        }
        for(String one : completion){
            Integer num = (Integer)hashMap.get(one);   //이름에 대한 인원
            num--;
            hashMap.put(one,num);
        }
        Set keySet = hashMap.keySet();      //keySet을 뽑아서
        Iterator iter = keySet.iterator();  // Iterator 를 사용
        while(iter.hasNext()){
            String nextKey= (String)iter.next();
            if( (Integer)hashMap.get(nextKey) > 0 ){ //hashMap에 인원이 0이상이면 통과하지 못한 인원
                answer = nextKey;
                return answer;
            }
        }
        return answer;
    }
    
}