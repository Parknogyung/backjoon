package ����;
import java.io.*;
import java.util.*;
public class ���װ�� {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		System.out.println(factorial(n) / (factorial(n-k)*factorial(k)) );
		
	}
static int factorial(int n) {
	if(n <= 1) {
		return 1;
	}
	
	
	return n * factorial(n-1);
}
}
