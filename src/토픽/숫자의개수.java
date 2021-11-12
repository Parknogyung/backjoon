package 토픽;
import java.io.*;
public class 숫자의개수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int mul = a*b*c;
		String st = Integer.toString(mul);
		int[] hol = new int [10];
		int[] hol1 = new int [10];
		for(int i = 0 ; i < st.length() ; i++ ) {
			hol[i] = st.charAt(i)-48;
		}
		for(int i = 0 ; i < st.length() ; i++ ) {
			hol1[hol[i]]++;
		}
		for(int i = 0 ; i < 10 ; i++ ) {
			System.out.println(hol1[i]);
		}
		

	}

}
