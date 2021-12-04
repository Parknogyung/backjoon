package 토픽;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class 좌표정렬하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine());
		int [][] xy = new int [tc][2];
		
		for(int i = 0 ; i <tc; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			xy[i][0] = Integer.parseInt(st.nextToken());
			xy[i][1] = Integer.parseInt(st.nextToken());
			
		}
		
		Arrays.sort(xy, (o1, o2) -> {
			if(o1[0] == o2[0]) {
				return o1[1] - o2[1];
			}
			else {
				return o1[0] - o2[0];
			}
		});
		
		for(int i = 0 ; i <tc; i++) {
			for(int j = 0 ; j < 2 ; j++) {
			bw.write(xy[i][j] + " ");
			
			}
			bw.write("\n");
		}bw.flush();
	}

}
