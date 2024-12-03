package chapter3;

import java.util.*;
import java.io.*;

public class q006_wrong {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());

        int count = 0;
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){}
            int sum = 0;
            sum += i;
            if(sum == N){
                count++;
                break;
            }
        }

        System.out.println(count);
    }
}