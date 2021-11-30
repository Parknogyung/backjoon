package ±×¸®µð;
import java.io.*;
import java.util.*;
public class Ä·ÇÎ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = 0;
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int day= 0;
		int mok =0;
		int nam = 0;
		int l = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		
		if(l == 0 && p == 0 && v==0) {
			break;
		}
		mok = v/p;
		nam = Math.min(l,v%p);
		day = (mok*l) + nam;
		cnt++;
		bw.write("Case "+cnt+": "+ day+"\n");
		}
		bw.flush();
		
	}

}
