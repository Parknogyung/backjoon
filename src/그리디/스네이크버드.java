package 그리디;
import java.io.*;
import java.util.*;
public class 스네이크버드 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int [] h = new int[n];
		StringTokenizer ST = new StringTokenizer(br.readLine(), " ");
		for(int i = 0 ; i < n ; i++) {
			h[i] = Integer.parseInt(ST.nextToken());
		}
		Arrays.sort(h);
		for(int i = 0 ; i < n ; i++) {
			if(h[i] <= l) {
				l++;
			}
		}
		System.out.println(l);
	}

}
