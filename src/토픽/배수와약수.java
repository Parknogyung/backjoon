package 토픽;
import java.io.*;
import java.util.*;
public class 배수와약수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int a;
		int b;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			if(a == 0 & b==0) 
				break;
			
			if(b%a == 0) {
				bw.write("factor" + "\n");
			}
			else if(a%b == 0) {
				bw.write("multiple" + "\n");
			}
			else {
				bw.write("neither" + "\n");
			}
			
		}
		bw.flush();
	}

}
