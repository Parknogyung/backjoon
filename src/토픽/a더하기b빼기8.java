package 토픽;
import java.io.*;
public class a더하기b빼기8 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1 ; i<=n; i++) {
		String num = br.readLine();
		String[] num1 = num.split(" ");
		int a = Integer.parseInt(num1[0]);
		int b = Integer.parseInt(num1[1]);
		bw.write("Case #" + i + ": " + a + " + " + b + " = " +(a+b)+"\n");
	}bw.flush();
		}

}
