package ����;
import java.io.*;
import java.util.*;
public class ��� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int [] n = new int [tc];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0 ; i <tc ; i++) {
			n[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(n);
		System.out.print(n[0] * n[tc-1]);
	}

}
