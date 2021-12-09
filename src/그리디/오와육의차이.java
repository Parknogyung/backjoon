package 그리디;
import java.io.*;
import java.util.StringTokenizer;
public class 오와육의차이 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String a = st.nextToken();
		String b = st.nextToken();
		String min_a = "";
		String max_a = "";
		String min_b = "";
		String max_b = "";
		
		for(int i = 0 ; i < a.length() ; i ++) {
			if(a.charAt(i) == '5') {
				max_a = max_a+'6';
			}
			else {
				max_a=max_a + a.charAt(i);
			}
			if(a.charAt(i)=='6') {
				min_a = min_a + '5';
			}
			else {
				min_a = min_a+a.charAt(i);
			}
		}
		for(int i = 0 ; i < b.length() ; i ++) {
			if(b.charAt(i) == '5') {
				max_b = max_b+'6';
			}
			else {
				max_b=max_b + b.charAt(i);
			}
			if(b.charAt(i)=='6') {
				min_b = min_b + '5';
			}
			else {
				min_b = min_b+b.charAt(i);
			}
		}
		int max = Integer.valueOf(max_a)+Integer.valueOf(max_b);
		int min = Integer.valueOf(min_a)+Integer.valueOf(min_b);
		System.out.print(min +" "+ max);
		
	}

}
