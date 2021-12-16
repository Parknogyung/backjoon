package 그리디;
import java.io.*;
import java.util.*;
public class 우유축제 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		int [] milk = new int[tc];
		int cnt = 0;
		int next = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0 ; i < tc ; i++) {
			milk[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0 ; i < tc ; i++) {
		if(milk[i]==next && next == 0) {
			cnt++;
			next = 1;
		}
		else if(milk[i]==next && next == 1) {
			cnt++;
			next = 2;
		}
		else if(milk[i]==next && next == 2) {
			cnt++;
			next = 0;
		}
		}
		System.out.println(cnt);
	}

}
