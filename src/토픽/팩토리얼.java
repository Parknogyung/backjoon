package ����;
import java.io.*;
public class ���丮�� {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	int mul = 1;
	
	for(int i = n ; i >=1 ; i--) {
		mul *= i;
	}
	System.out.println(mul);
}
}
