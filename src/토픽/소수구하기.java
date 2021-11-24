package 토픽;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class 소수구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		int m = Integer.parseInt(st.nextToken()); 
		int n = Integer.parseInt(st.nextToken()); 
		br.close(); 
		boolean[] primes = new boolean[n+1]; 
		Arrays.fill(primes,true); 
		primes[1] = false;
		
		for(int i=2; i*i<=n; i++){ 
			if(primes[i]){ 
				for(int j= i*i; j<=n; j+=i){ 
					primes[j] = false; 
					} 
				} 
			} 
		for(int i=m; i<=n; i++){ 
			if(primes[i]){
				bw.write(i+"\n"); 
			} 
			}
		bw.flush();
		} 
	}

		


