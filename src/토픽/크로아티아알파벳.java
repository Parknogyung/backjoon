package 토픽;
import java.io.*;
public class 크로아티아알파벳 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String st = br.readLine();
		int cnt = 0;
		int cnt1 =st.length();
		int cnt2 = 0;

		for(int i = 0 ; i<st.length(); i++) {
			if(st.charAt(i) == 'c') {
			if(i < st.length() - 1) {
				if(st.charAt(i+1)=='=') {	
				i++;
			}
			else if (st.charAt(i+1)=='-') {
				i++;
			}
			}
			}
		
			else if (st.charAt(i)=='d') {
				if(i < st.length() - 1) {
				if (st.charAt(i+1)=='z') {
				if(i < st.length() - 2) {
				if(st.charAt(i+2) =='=') {
				i+=2;
			
			}
			}
			}
			else if(st.charAt(i+1)=='-') {
				i++;
			}
				}
			}
			
			else if (st.charAt(i)=='l') {
				if(i < st.length() - 1) {
				if(st.charAt(i+1)=='j') {
				i++;
			}
				}
			}
			else if (st.charAt(i)=='n') {
				if(i < st.length() - 1) {
				if(st.charAt(i+1)=='j') {
				i++;
			}
			}
			}
			else if(st.charAt(i)=='s') {
				if(i < st.length() - 1) {
				if( st.charAt(i+1)=='=') {
				i++;
			}
				}
			}
			else if(st.charAt(i)=='z') {
				if(i < st.length() - 1) {
				if(st.charAt(i+1)=='=') {
				i++;
			}
			}
			}
			cnt++;	
		}
			
			System.out.println(cnt);
			
	}	
	}	
	
		
	
		
	


