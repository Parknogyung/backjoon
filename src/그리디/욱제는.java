package �׸���;
import java.io.*;
import java.util.*;
public class ������ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		int [] n = new int [tc];
		StringTokenizer st= new StringTokenizer(br.readLine(), " ");
		int max = 0;
		int sum = 0;

		for(int i = 0 ; i < tc ; i++) {
			n[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, n[i]);
			sum += n[i];
		}
		sum-=max;
		System.out.println(sum);
	}

}
