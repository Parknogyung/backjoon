package 토픽;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class 직사각형에서탈출 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int[] dis = new int [4];
		dis[0] = x;
		dis[1] = y;
		dis[2] = w-x;
		dis[3] = h-y;
		
		Arrays.sort(dis);
		System.out.println(dis[0]);
	}

}
