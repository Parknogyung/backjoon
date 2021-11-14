package 토픽;
import java.io.*;
public class 문자열반복 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < tc ; i++) {
			String[] c = br.readLine().split(" ");
			
			int start = Integer.parseInt(c[0]);
			String st = c[1];
			
			for(int j = 0 ; j < st.length() ; j++) {
			for(int k = 0 ; k < start ;k++) {
				bw.write(st.charAt(j));
			}
		}bw.write("\n");
			bw.flush();
		
	}
}}
