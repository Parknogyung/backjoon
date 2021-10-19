package 그리디;
import java.util.*;
public class 로프 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] w = new Integer[n];
		int max = 0;
		int cnt = 0;
		
		for(int i = 0 ; i < n ; i++) {
			w[i] = sc.nextInt();		
		}
		Arrays.sort(w, Collections.reverseOrder());
	for(int i = 0 ; i < n ; i++){
		cnt++;
		if(max <= w[i] * cnt) {
			max = w[i] * cnt;
		}
	
	}
		System.out.println(max);
	}
}
