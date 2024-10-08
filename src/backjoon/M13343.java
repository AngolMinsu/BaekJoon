package backjoon;

import java.io.*;

public class M13343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        long n = Long.parseLong(str[0]);
        long m = Long.parseLong(str[1]);


        bw.write(GCD(n,m)?"win" :"lose");
        br.close();
        bw.close();
    }
    public static boolean GCD(long n, long m) {
        long min = Math.min(n, m);
        long max = Math.max(n, m);

        // 선공이 바로 승리할 수 있는 경우
        if (max % min == 0) return true;

        // 큰 수가 작은 수보다 많이 크면, 선공이 승리할 수 있음
        if (max / min > 1) {
            return true;
        }

        // 그 외의 경우, 후공이 다음 턴에서 승리할지 판단 (재귀)
        return !GCD(min, max % min);
    }
}
