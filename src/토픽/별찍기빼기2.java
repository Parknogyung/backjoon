package 토픽;
import java.util.*;
import java.io.*;
public class 별찍기빼기2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		for(int i=1 ; i<=n;i++) {
			for(int j=1;j<= n-i ;j++) {
				bw.write(" ");
			}
			for(int k=1;k<=i;k++) {
				bw.write("*");
			}bw.write("\n");
		}
		bw.flush();
		
		/**Scanner sc = new Scanner(System.in); // 일반 풀이
		int n = sc.nextInt();
		
		
		for ( int i = 1 ; i <= n ; i++ ){
			for( int j = 1 ; j <= n-i ; j++ ) {
				System.out.printf(" ");
			}
			for( int k = 0 ; k < i ; k++ ){
				System.out.printf("*");
			}System.out.println();
		}**/
		}
		
	}


