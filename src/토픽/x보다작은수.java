package 토픽;
import java.io.*;
import java.util.*;
public class x보다작은수 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int[] a= new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < n ; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			if(x>a[i]) {
				bw.write(a[i] + " ");
		}
	}bw.flush();
	
		
		
		
		
		/**Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a= new int [n];
		
		for(int i = 0 ; i<n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(x>a[i])
			System.out.printf("%d ",a[i]);
		}**/
	}
}
