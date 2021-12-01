package ÅäÇÈ;
import java.io.*;
import java.util.StringTokenizer;
public class µ¢Ä¡ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc= Integer.parseInt(br.readLine());
		int [] kg = new int[tc]; 
		int [] cm = new int[tc];
		int [] rank = new int[tc];
		
		
		for(int i = 0 ; i < tc ; i++) {
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		kg[i] = Integer.parseInt(st.nextToken());
		cm[i] = Integer.parseInt(st.nextToken());
		
		}
		for(int i = 0 ; i < tc ; i++) {
			int cnt =1;
			for(int j = 0 ; j<tc ; j++)
			if(kg[i] < kg[j] && cm[i] < cm[j]) {
				cnt++;
			}
			System.out.println(cnt);
			}
	}

}
