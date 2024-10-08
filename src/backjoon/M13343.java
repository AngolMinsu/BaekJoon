package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class M13343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int dp[] = new int[n+m];

        br.close();
    }
    public static void stackout(int n, int m){
        int min = Math.min(n, m);

    }
}
