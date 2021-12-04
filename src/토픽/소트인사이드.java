package 토픽;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
public class 소트인사이드 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int size = (int)(Math.log10(n)+1);
		Integer [] num = new Integer[size];
		int nam = n;
		for(int i = 0 ; i <= size-1 ; i++) {
			int ten = (int) Math.pow(10, num.length-1-i);
			int mok = 0;
			mok = nam/ten;
			num[i] = mok;
			nam = nam%ten;
			
			
		}
		Arrays.sort(num, Collections.reverseOrder());
		for(int i = 0 ; i <num.length ; i++) {
			System.out.printf("%d", num[i]);
		}
		
	}

}
