package level2.프린터;

import java.util.*;
class Solution { 
    public class Document { //어떤 문서인지(index)와 중요도 둘다 필요하여 class로 선언
        private Integer index=0;
        private Integer priority;
        public Document(Integer index,Integer priority) {
            this.index = index;
            this.priority = priority;
        }
        public Integer getIndex(){
            return this.index;
        }
        public Integer getPriority(){
            return this.priority;
        }
    }   
    public int solution(int[] priorities, int location) {
        int answer = 0;  //몇번째로 나오는지
        Queue<Document> printerQueue = new LinkedList<Document>();  // 어떤 문서(index)와 중요도를 담은 큐
        //큰 수가 우선순위인 우선순위큐로 만듬
        //중요도만 담은 우선순위 큐
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        int index=0;
        for (int priority : priorities){
            printerQueue.offer(new Document(index,priority));
            priorityQueue.offer(priority);
            index++;
        }
        while (! printerQueue.isEmpty()){ //비어있지 않을 동안
            Document document = printerQueue.peek();
            if(document.getPriority() >= priorityQueue.peek() ){ //현재 들어온 인쇄요청보다 높은 우선순위가 없다면 출력
                answer++;
                if(document.getIndex() == location) return answer;
                printerQueue.poll();
                priorityQueue.poll();
            }
            else{ //현재 들어온 인쇄요청보다 우선순위가 높은 것이 있으면 맨뒤 순서로 다시 넘김
                Document docu = printerQueue.poll();
                printerQueue.offer(document); 
            }
        }
        return answer;
    }
    
}