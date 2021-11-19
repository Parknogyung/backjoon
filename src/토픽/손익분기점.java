package 토픽;
import java.io.*;
import java.util.StringTokenizer;
public class 손익분기점 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		long c = Integer.parseInt(st.nextToken());
		
		if(c<=b) {
			System.out.println("-1");
		}
		else {
			System.out.println((a/(c-b))+1);
		}
		
	}
	

}
