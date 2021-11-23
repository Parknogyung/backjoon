package 토픽;
import java.io.*;
import java.util.StringTokenizer;
public class 소수찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		int [] num = new int[tc];
		int cnt=tc;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0 ; i < tc ; i++) {	
			num[i] = Integer.parseInt(st.nextToken());
			if(num[i]==1) {
				cnt--;
			}
		}
		
		for(int i = 0 ; i<tc ;i++) {
			for(int j = 2 ; j<num[i];j++) {
				if(num[i]%j==0) {
					cnt--;
					break;
				}
			}
		}
		System.out.println(cnt);
		
	}

}
