class Solution {
    public int solution(String dartResult) {
        int score = 0;
        int dartIndex = -1;
        int record[] = new int[3];
        for(int i=0; i<dartResult.length(); i++) {
            if(dartResult.charAt(i) >= '0' && dartResult.charAt(i)<='9'){
                score = (int) dartResult.charAt(i) -48;
                if(dartResult.charAt(i+1) == '0'){
                    score = 10;
                    i++;
                }
            }

            if(dartResult.charAt(i) =='S'){
                record[++dartIndex] = score;
            }
            else if(dartResult.charAt(i) =='D'){
                score=(int)Math.pow(score,2);
                record[++dartIndex] = score;
            }
            if(dartResult.charAt(i) =='T'){
                score=(int)Math.pow(score,3);
                record[++dartIndex] = score;
            }

            if(dartResult.charAt(i) =='*'){
                if(dartIndex>0){
                    record[dartIndex-1] = record[dartIndex-1] *2;
                }
                record[dartIndex] = record[dartIndex] *2;
            }
            else if(dartResult.charAt(i) =='#'){
                record[dartIndex] = record[dartIndex] * -1;
            }
        }

        return record[0]+record[1]+record[2];
    }
}