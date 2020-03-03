import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            int numberOfTeam = Integer.parseInt(br.readLine());
            String [] temp = br.readLine().split(" ");
            int russia [] = new int[temp.length];
            String [] temp2 = br.readLine().split(" ");
            int korea [] = new int[temp.length];
            for(int j=0; j<temp.length; j++){
                russia[j] = Integer.parseInt(temp[j]);
                korea[j] = Integer.parseInt(temp2[j]);
            }
            bw.write(Integer.toString(caculateWin(russia,korea))+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static int caculateWin(int[] russia, int[] korea){
        Arrays.sort(russia);
        Arrays.sort(korea);
        int result = 0;
        int korIndex = 0;
        for(int i=0; i<russia.length; i++){
            while(korIndex < russia.length && korea[korIndex] < russia[i]){
                korIndex++;
            }
            if(russia.length <= korIndex) break;
            korIndex++;
            result++;
        }
        return result;
    }

}