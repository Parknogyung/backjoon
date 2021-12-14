package 토픽;
import java.io.*;
import java.util.Arrays;
public class 검문 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		int [] n = new int[tc];
		
		for(int i = 0 ; i < tc ; i++) {
			n[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(n);
		int gcd = n[1] - n[0];
		
		for(int i = 2 ; i < tc ; i++) {
		gcd = getgcd(gcd, n[i]-n[i-1]);
		}
		for(int i = 2; i <= gcd ; i++) {
		if(gcd % i == 0) {
			System.out.print(i+" ");
		}
		}
	}
	static int getgcd(int a, int b) {
		while(b!=0) {
			int r = a%b;
			a= b;
			b=r;
		}
		return a;
	}
}
