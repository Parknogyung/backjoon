package 토픽;
import java.io.*;
import java.util.Arrays;

public class 수정렬하기 {
static int tc;
static BufferedReader br;
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		tc= Integer.parseInt(br.readLine());
		arr();
		
	}

	static void arr() throws IOException {
		int[] num = new int[tc];
		for(int i = 0 ; i < tc; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(num);
		for(int i = 0 ; i < tc ; i++) {
			System.out.println(num[i]);
		}
	}
}
