package 그리디;
import java.io.*;
import java.util.*;

public class 슬라임합치기 {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int tc = Integer.parseInt(br.readLine());
	StringTokenizer st = new StringTokenizer (br.readLine(), " ");
	int [] num = new int[tc];
	for(int i = 0 ; i <tc; i++) {
	num[i] = Integer.parseInt(st.nextToken());
	}
	int sum = 0;
	for(int i = 0 ; i <tc; i++) {
		for(int j = i+1 ; j<tc ; j++) {
			sum+=num[i]*num[j];
		}
	
	}
	System.out.println(sum);
	
}
}
