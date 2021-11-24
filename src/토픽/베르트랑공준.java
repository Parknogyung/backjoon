package 토픽;
import java.io.*;
public class 베르트랑공준 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		int cnt;
		while(true) {
			n=Integer.parseInt(br.readLine());
			if(n==0) 
				break;
			
			cnt=0;
			for (int i = n+1 ; i <= 2*n ; i++ ) {
				int j;
				for( j = 2 ; j*j <=i ; j++) 
					if(i%j == 0) 
						break;
	
				if((j*j > i) && i != 1) 
					cnt++;
				
			}
			bw.write(cnt + "\n");
		}
		bw.flush();
		
		
	}

}
