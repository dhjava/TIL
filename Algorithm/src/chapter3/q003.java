package chapter3;

import java.io.*;
import java.util.*;

public class q003{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int count = Integer.parseInt(st.nextToken());
        int qNo = Integer.parseInt(st.nextToken());

        long[] S = new long[count + 1];

        st = new StringTokenizer(bf.readLine());
        for(int i = 1; i <= count; i++){
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }

        for(int q = 0; q < qNo; q++){
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }
    }
}