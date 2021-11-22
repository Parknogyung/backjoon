package 토픽;
import java.io.*;
import java.util.StringTokenizer;
public class ACM호텔 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int start = 101;
		int cnt = 0;
		for(int roop = 0 ; roop < T; roop++) {
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[][] hotel = new int[H][W];
		
		for (int i = 0 ; i < H ; i++) {
			for (int j = 0 ; j < W ; j++) {
				hotel[i][j] += start + j;
				
			}
			start = start + 100;
		}
		
		for(int i = 0 ; i <W ; i++) {
			for ( int j = 0 ; j <H ; j++) {
				cnt++;
				if(cnt ==N) {
					bw.write(hotel[j][i] + "\n");
					break;
				}
			}
		}
		start=101;
		cnt=0;
	}
		bw.flush();

}
	}
