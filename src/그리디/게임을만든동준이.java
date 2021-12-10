package 그리디;
import java.io.*;
public class 게임을만든동준이 {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc= Integer.parseInt(br.readLine());
		int sub = 0;
		int cnt = 0;
		int[] b = new int[tc];
		
		for(int i = 0 ; i < tc ; i++) {
		b[i]= Integer.parseInt(br.readLine());
	}
		for(int i = tc-2 ; i >= 0 ; i--) {
		while(b[i]>=b[i+1]) {
		b[i]--;
		cnt++;
		}
		}
		bw.write(cnt+"\n");
		bw.flush();
		
	}
}
