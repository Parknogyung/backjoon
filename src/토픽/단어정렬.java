package 토픽;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
public class 단어정렬 {

	public static void main(String[] args) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String [] st = new String[n];
		
		for(int i = 0 ; i <n ; i++) {
			st[i] = br.readLine();
		}
		Arrays.sort(st, new Comparator<String>() {
			@Override
			public int compare(String s1 , String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				else {
				return s1.length() - s2.length();
			
				}
			}
		});
		System.out.println(st[0]);
		for(int i = 1 ; i <n; i++) {
			if(st[i].equals(st[i-1])) {
				continue;
			}
			else {
			System.out.println(st[i]);
			}
			}
	}

}
