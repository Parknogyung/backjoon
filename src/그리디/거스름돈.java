package 그리디;
import java.util.*;
public class 거스름돈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m =1000;
		int nam = m-n;
		int cnt = 0 ;
		int[] jan = {500, 100, 50, 10, 5, 1};
		
		for(int i = 0 ; i<6 ;i++) {
	
			cnt = cnt + nam/jan[i];
			nam = nam%jan[i];
		
		}
		System.out.println(cnt);

	}

}
