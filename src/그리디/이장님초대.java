package 그리디;
import java.io.*;
import java.util.*;
public class 이장님초대 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		Integer [] day = new Integer[tc];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0 ; i < tc ; i++) {
			day[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(day, Collections.reverseOrder());
		int sum = 0;
		int max = 0;
		for(int i = 0 ; i < tc ; i++) {
			sum = day[i]+i+1;
			if(sum>max) {
				max =sum;
			}
		}
		System.out.println(max+1);
		
		
	}

}
