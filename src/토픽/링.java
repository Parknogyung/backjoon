package ≈‰«»;
import java.io.*;
import java.util.*;
public class ∏µ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc= Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int [] n = new int [tc];
		for(int i = 0 ; i < tc ; i++) {
			n[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 1; i<tc ;i++) {
		int value = getring(n[0], n[i]);
		System.out.println((n[0]/value) + "/" + (n[i]/value));
	}
	}
	static int getring(int a, int b) {
		int tmp;
		while(b>0) {
			tmp = a%b;
			a= b;
			b=tmp;
		}
		return a;
	}

}
