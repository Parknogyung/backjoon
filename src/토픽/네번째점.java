package 토픽;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class 네번째점 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int [] x = new int [3];
		int [] y = new int [3];
		int X = 0;
		int Y = 0;
		for(int i = 0 ; i < 3 ; i++) {
		StringTokenizer st = new StringTokenizer (br.readLine(), " ");
		x[i]=Integer.parseInt(st.nextToken());
		y[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(x);
		Arrays.sort(y);
			if(x[0] == x[1]) {
			X=x[2];
		}
		else if(x[0]!=x[1]) {
			X=x[0];
		}
			if(y[0] == y[1]) {
				Y=y[2];
		}
			else if(y[0] != y[1]) {
				Y=y[0];
		}
			System.out.printf("%d %d", X, Y);
	}
}
