package 토픽;
import java.io.*;
import java.util.StringTokenizer;
public class 달팽이는올라가고싶다 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] ST = new int[3];
		ST[0] = Integer.parseInt(st.nextToken());
		ST[1] = Integer.parseInt(st.nextToken());
		ST[2] = Integer.parseInt(st.nextToken());
		int day =0;
		int sum = 0;
		
		day = ((ST[2]-ST[1])-1)/(ST[0]-ST[1])+1;
		System.out.println(day);
	}

}
