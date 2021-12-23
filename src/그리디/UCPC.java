package ±×¸®µð;
import java.io.*;
public class UCPC {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		char [] a = {'U', 'C', 'P', 'C'};
		int idx = 0;
		int cnt = 0;
		
		for(int i = 0 ; i < st.length() ; i ++) {
			if(a[idx] == st.charAt(i)) {
				cnt++;
				idx ++;
			}
			if(idx == 4) {
				break;
			}
			
		}
		if(cnt == 4) {
			System.out.println("I love UCPC");	
			}
		else {
			System.out.println("I hate UCPC");
		}
	}

}
