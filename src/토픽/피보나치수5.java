package 토픽;
import java.io.*;
public class 피보나치수5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int [] n = new int[21];
		n[0] = 0;
		n[1] = 1;
		
		for(int i = 1 ; i < num ; i++) {
			n[i+1] = n[i-1] + n[i];
		}
		System.out.println(n[num]);
	}

}
