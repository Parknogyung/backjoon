package 토픽;
import java.io.*;
public class 아스키코드 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char a = br.readLine().charAt(0);
		System.out.println((int)a);
	}

}
