package 토픽;
import java.io.*;
public class 다이얼 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		String [] num = new String[] {null, null, "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

		int sum =0;
		
		
		for(int i = 0 ; i<st.length();i++) {
			for(int j = 2 ; j<=9 ; j++) {
				for(int k = 0 ; k<num[j].length() ; k++) {
				if(st.charAt(i) == num[j].charAt(k)) {
							sum+=j+1;
							}
				
				}
		}
		}
		System.out.printf("%d ", sum);
	}

}
