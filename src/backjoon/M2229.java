package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class M2229 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[N+1];

        for(int i = 1 ; i<=N ; i++){
            for(int j = 1 ; j<i ; j++){
                dp[i] = Math.max(dp[i],dp[j-1] + Score(j,i,arr));
            }
        }
        System.out.println(dp[N]);
    }
    public static int Score(int sidx, int eidx, int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = sidx-1; i<=eidx-1 ; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        return max - min;
    }
}
