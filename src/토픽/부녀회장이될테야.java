package 토픽;
import java.io.*;
public class 부녀회장이될테야 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		int [][] apt = new int[15][15];
		
		for(int i = 0 ; i <15 ; i++) {
				apt[0][i] = i;
				apt[i][1] = 1;
		}
		
		for(int i = 0 ; i <t ; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
		
		for(int j = 2; j<=n; j++) {
		for(int x = 1; x <= k ; x++) {
			apt[x][j] = apt[x-1][j]+apt[x][j-1];
		}
		}
		bw.write(apt[k][n]+"\n");
		}br.close();
		bw.flush();
	}

}
