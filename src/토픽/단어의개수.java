package ����;
import java.io.*;
public class �ܾ��ǰ��� {

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
