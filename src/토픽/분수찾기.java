package 토픽;
import java.io.*;
public class 분수찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int cnt = 0;
		int n = 0;
		while (true) {
			n++;
			cnt +=n;
			if(cnt>=a) {
				if(n%2==0) {
					System.out.println(a-cnt+n+"/"+(cnt-a+1));
				}else {
					System.out.println((cnt-a+1)+"/"+(a-cnt+n));
				}
				break;
			}
		}
	}
}
