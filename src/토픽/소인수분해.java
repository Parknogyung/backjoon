package 토픽;
import java.io.*;
public class 소인수분해 {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	int nam = n;
	int mok = 2;
	
		for(int i = 2 ; i <= n/2 ; i++) {
			while(nam%i==0) {
				System.out.println(i);
				nam/=i;
			}
		}
		if(nam != 1) {
			System.out.println(nam);
		}
	
}
}
