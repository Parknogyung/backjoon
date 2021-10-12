package 그리디;
import java.util.*;

public class 동전0 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	int nam = 0;
	int count = 0;
	int[] mon = new int[n];

	
	for (int i=0; i<n; i++) {	
		mon[i] = sc.nextInt();
		
	}
	for(int i = n-1 ; i>=0 ; i-- ) {
	if (mon[i] <= k) {
		nam = k%mon[i];
		count = count + k/mon[i];
		k = nam;
	}
	
	

	}
	System.out.println(count);
	}}
