package level1.소수_찾기;

class Solution {
  public int solution(int n) {
      //제한 조건이 n은 2이상이고 2는 소수이므로 1개부터 시작한다.
      int answer = 1;
      //2는 이미 소수로 개수를 포함했으니 3부터 소수를 찾는다
      for(int i=3; i<=n; i++){
          boolean flag=false;
          for(int j=2; j<=Math.sqrt(i); j++){
              if(i%j==0) {
                  //이미 나눠지는 수가 있다면 더 이상 소수가 아니므로 break문으로 탈출
                  flag = true;
                  break;
              }
          }
          if(flag==false) answer++;
      }
      return answer;
  }
}