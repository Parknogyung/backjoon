package 토픽;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class 그룹단어체커 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String st = new String();
 		int[] al = new int[25];
		int cnt = n;
 		Arrays.fill(al, 0);
 		
		for (int i = 0 ; i <n ; i++) {
			st = br.readLine();
		}
		for(int i = 1 ; i < st.length() ; i++) {
			if(st.charAt(i) != st.charAt(i-1)) {
				cnt --;
				break;
			}
				
		}
			System.out.println(cnt);
	
	}
}
