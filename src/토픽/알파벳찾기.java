package 토픽;
import java.io.*;
public class 알파벳찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		int [] al = new int[26];
		int start = 96;
		int index = -1 ;
		
		for(int i = 0 ; i < 26 ; i++) {
			al[i] = -1;
			}
		
		for(int i = 0 ; i < st.length();i++) {
		for(int j = 0 ; j < 26 ; j++) {
		index++;
		start++;
		if(al[j]==-1) {
			if(st.charAt(i) == (char)start) {
			al[j] = i;
			break;
		}}
			
		}
		index=-1;
		start=96;
		
		}
		for(int i = 0 ; i < 26 ; i++) {
			System.out.printf("%d ", al[i]);
		}
	}

}
