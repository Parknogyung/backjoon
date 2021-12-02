package 토픽;
import java.io.*;
import java.util.Arrays;
public class 수정렬하기2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine());
		int [] num = new int [ tc];
		
		for(int i = 0 ; i < tc ; i++) {
		num[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(num);
		for(int i = 0 ; i < tc ; i++) {
			bw.write(num[i]+"\n");
		}
		bw.flush();
	}

}
