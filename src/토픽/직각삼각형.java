package 토픽;
import java.io.*;
import java.util.StringTokenizer;
public class 직각삼각형 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int fir = Integer.parseInt(st.nextToken());
			int sec = Integer.parseInt(st.nextToken());
			int thir = Integer.parseInt(st.nextToken());
			if(fir == 0 && sec ==0 && thir ==0) {
				break;
			}
			if(fir * fir + sec * sec == thir * thir) {
				bw.write("right" + "\n");
			}
			else if(sec * sec + thir * thir == fir * fir) {
				bw.write("right" + "\n");
			}
			else if(sec * sec == thir * thir + fir * fir) {
				bw.write("right" + "\n");
			}
			else {
				bw.write("wrong" + "\n");
			}
			
		}
		bw.flush();
	}

}
