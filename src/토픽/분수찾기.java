package 토픽;
import java.io.*;
public class 분수찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int line = 1;
		int cnt = 1;
		int top = 0;
		int bot = 0;
		
		if(n==1) {
			System.out.printf("%d/%d",1, 1);
		}
		else {
			while(cnt>=n) {
				if(line % 2 ==0) {
				top = line - line;
				top++;
				bot = line+1;
				line--;
				cnt ++;
				}
			}
		}
		
		
		
	}

}
