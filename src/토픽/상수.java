package 토픽;
import java.io.*;
public class 상수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a = br.readLine().split(" ");
		int[] s =new int[2];
		int sum = 0;
		
		for(int i = 0 ; i<a.length;i++) {
			for(int j = a[i].length()-1 ; j>=0 ; j--) {
				sum+= (int)(a[i].charAt(j)-48) * Math.pow(10, j);
				
			}
			s[i] = sum;
			sum=0;
		}
		System.out.println(Math.max(s[0], s[1]));
		
}}
