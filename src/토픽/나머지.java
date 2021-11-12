package 토픽;
import java.io.*;
import java.util.Arrays;
public class 나머지 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] n = new int[10];
		int[] nam = new int[10];
		int cnt = 1;
		
		for(int i = 0 ; i<=9;i++) {
			n[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0 ; i<=9;i++) {
			nam[i] = n[i]%42;
		}
		Arrays.sort(nam);
		for(int i = 1 ; i<=9;i++) {
		if(nam[i] != nam[i-1]) {
			cnt++;
		}
	
	}
		System.out.println(cnt);
		}

}
