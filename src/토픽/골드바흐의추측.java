package ≈‰«»;
import java.io.*;
import java.util.Arrays;
public class ∞ÒµÂπŸ»Â¿«√ﬂ√¯ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		boolean [] so = new boolean [10001];
		Arrays.fill(so, true);
		
		
		for(int i = 2 ; i<=Math.sqrt(so.length) ; i++) {
			for(int j=i*i; j<=10000 ; j+=i) {
				so[j] = false;
			}
		}
		
		for(int i = 0 ; i < t ; i++) {
			int n = Integer.parseInt(br.readLine());
			
				for(int k = n/2 ; k>=2 ; k++) {
					if(so[k] && so[n-k]) {
					bw.write(n-k + " " + k + "\n");
					break;
			
				}
				}
				
				}
		bw.flush();
		}
		
	}


