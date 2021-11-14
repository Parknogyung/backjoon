package 토픽;
import java.io.*;
public class 숫자의합 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String st = br.readLine();
		int sum = 0;
		
		for(int i = 0 ; i < n ; i++) 
		{
			sum += st.charAt(i)-48;
		}
		
		System.out.println(sum);
		
		
	}

}

