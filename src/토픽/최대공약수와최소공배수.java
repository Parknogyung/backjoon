package 토픽;
import java.io.*;
import java.util.*;
public class 최대공약수와최소공배수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		
		long gcd = getgcd(Math.max(a, b), Math.min(a, b));
		long lcm = getlcm(a, b, gcd);
		
		System.out.println(gcd);
		System.out.println(lcm);
		
		
	}
	public static long getgcd(long a, long b) {
		while(b>0) {
			long tmp = a;
			a= b;
			b= tmp%b;
		}
		return a;
	}
	public static long getlcm(long a, long b, long c) {
		return (a*b)/c;
	}

}
