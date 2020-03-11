import java.util.*;
class Solution {
    HashSet<Integer> hs = new HashSet();
    public int solution(String numbers) {
        int answer = 0;

        String [] nums = numbers.split("");
        perm(nums,0);
        for(int num : hs){
            if(isPrime(num)){
                answer++;
            }
        }

        return answer;
    }
    public boolean isPrime(int n){
        int sqrtNum = (int)Math.sqrt(n);
        if(n<=1)
            return false;
        for(int i=2; i<=sqrtNum; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public void perm(String[] arr, int pivot) {

        if (pivot == arr.length) {
            toInt(arr);
            return;
        }

        for (int i = pivot; i < arr.length; i++) {
            swap(arr, i, pivot);
            perm(arr, pivot + 1);
            swap(arr, i, pivot);
        }

    }

    public void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void toInt(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            hs.add(Integer.parseInt(sb.toString()));
        }
        hs.add(Integer.parseInt(sb.toString()));
    }
}