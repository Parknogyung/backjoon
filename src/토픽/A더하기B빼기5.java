package 토픽;
import java.io.*;
import java.util.*;
public class A더하기B빼기5 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int c = 0;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a==0 && b==0) {
				break;
			}
				bw.write(a+b+"\n");
			}
		bw.flush();
		}
				
	}

