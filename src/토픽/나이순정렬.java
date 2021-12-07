package 토픽;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
public class 나이순정렬 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine());
		String [][] member = new String[tc][2];
		StringTokenizer st;
		
		for(int i = 0 ; i <tc ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			member[i][0] = st.nextToken();
			member[i][1] = st.nextToken();
		}
		Arrays.sort(member, new Comparator<String[]>() {
			
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
			
		});
		for(int i = 0 ; i <tc ; i++) {
			bw.write(member[i][0] + " " + member[i][1] + "\n");
			
		
		}
		
		bw.flush();
		
	}
		}


