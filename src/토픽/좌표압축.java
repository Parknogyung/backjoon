package 토픽;
import java.io.*;
import java.util.*;
public class 좌표압축 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int tc = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");;
		int [] n = new int [tc];
		int [] count = new int [tc];
		for(int i = 0 ; i < tc ; i ++) 
			n[i] = Integer.parseInt(st.nextToken());
			int []temp = n.clone();
		
		Arrays.sort(n);
		int cnt = 0;
		HashMap<Integer, Integer> hmap = new HashMap<>();
   	 	for(int i = 0 ; i < n.length ; i++) {
   	 		if(!hmap.containsKey(n[i]))
   	 			hmap.put(n[i], cnt++);
   	 	}
   	 	for(int i = 0 ; i < tc ; i++) {
   	 		sb.append(hmap.get(temp[i])).append(" ");
   	 		
   	 	}
   	 System.out.println(sb.toString());
	}

}
