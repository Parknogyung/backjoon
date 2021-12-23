package 그리디;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
public class 투플러스원세일 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		Integer [] arr = new Integer [tc];
		for(int i = 0 ; i < tc ; i ++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr, Collections.reverseOrder());
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(i %3 ==2 ) {
				continue;
			}
			sum+=arr[i];
		
		
	}
		System.out.println(sum);
	}
}
