package 그리디;
import java.util.*;
import java.io.*;
public class 비트우정지수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < n ; i++) {		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String a = st.nextToken();
		String b = st.nextToken();
		int zero =0;
		int one = 0;
		for(int j = 0 ; j<a.length(); j++) {
			if(a.charAt(j)!=b.charAt(j)) {
				if(b.charAt(j)=='1') {
					one++;
				}
				else {
					zero++;
				}
			}

		}
		bw.write(Math.max(one, zero)+"\n");
		
		}
		bw.flush();
	}

}
