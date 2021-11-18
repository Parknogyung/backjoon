package 토픽;
import java.io.*;
public class 단어의개수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] st = br.readLine().split(" ");
		int cnt=0;
		
		for(int i = 0 ; i < st.length ; i++) {
			cnt++;
			if( st[i].length() == 0) {
				cnt--;
			}
		}
		System.out.println(cnt);
	}

}
