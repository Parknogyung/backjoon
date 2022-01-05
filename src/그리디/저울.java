package 그리디;
import java.io.*;
import java.util.*;
public class 저울 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int [] we = new int[n];
		for(int i = 0 ; i < n ; i++) {
			we[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(we);
		int sum = 0;
		for(int i = 0 ; i < n ; i++) {
			if(sum+1<we[i]) {
				break;
			}
			sum += we[i];
		}
		System.out.println(sum+1);
	}
	

}
