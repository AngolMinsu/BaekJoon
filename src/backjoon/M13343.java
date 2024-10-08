package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class M13343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);


        bw.write(GCD(n,m)?"win" :"lose");
        br.close();
        bw.close();
    }
    public static boolean GCD(int n, int m){
        int min = Math.min(n, m);
        int max = Math.max(n, m);

        // 3,3과 같이 선공이 바로 0으로 만들어 이길 수 있음
        if(max % min == 0) return true;
        
        // 유클리드 호제법, 최소 공배수 구하는 중
        // 큰 수를 작은 수로 계속 뺌
        if(max - min < max){
            return !GCD(min,max-min);
        }
        
        // 나머지 조건은 모두 선공이 이김
        return true;
    }
}
