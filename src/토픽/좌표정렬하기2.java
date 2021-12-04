package 토픽;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
public class 좌표정렬하기2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine());
		int [][] num = new int [tc][2];
		StringTokenizer st;
		for(int i = 0 ; i < tc ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			num[i][0] = Integer.parseInt(st.nextToken());
			num[i][1] = Integer.parseInt(st.nextToken());	
		}
		Arrays.sort(num, (o1, o2) -> {
			if (o1[1] == o2[1]) {
				return o1[0] - o2[0];
			}
			else {
				return o1[1] - o2[1];
			}
		});
		for(int i = 0 ; i < tc ; i++) {
			for(int j = 0 ; j < 2 ; j ++) {
			bw.write(num[i][j] + " ");
		}bw.write("\n");
		}
		bw.flush();
	}

}
