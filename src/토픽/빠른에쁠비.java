package 토픽;
import  java.io.*;
import java.util.*;
public class 빠른에쁠비 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < n ; i ++) {
			String num = br.readLine();
			String[] a = num.split(" ");
			int A = Integer.parseInt(a[0]); 
			int B = Integer.parseInt(a[1]);
			bw.write((A+B)+"\n");
		}
		bw.flush();
		
}}
