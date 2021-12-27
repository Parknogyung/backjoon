package 그리디;
import java.io.*;
import java.util.*;

public class 행복유치원 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    int n = Integer.parseInt(st.nextToken());
	    int k = Integer.parseInt(st.nextToken());
	    
	    int [] num = new int[n];
	    int [] dif = new int[n-1];
	    
	    st= new StringTokenizer(br.readLine(), " ");
	    for(int i = 0 ; i < n ; i++) {
	    	num[i] = Integer.parseInt(st.nextToken());
	    }
	    int res = 0;
	    
	    for(int i = 0 ; i < n-1 ; i++) {
	    	dif[i] = num[i+1] - num[i];
	    }
	    Arrays.sort(dif);
	    for(int i = 0 ; i < n-k ; i++) {
	    	res += dif[i];
	    }
	    System.out.println(res);
	}

}
