package 토픽;
import java.util.*;
public class 두수의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] num = new int[n][2];	
		for(int i = 0 ; i < n ; i++) {
			num[i][0] = sc.nextInt();
			num[i][1] = sc.nextInt();
		}
		for(int i = 0 ; i <n ; i++) {
				System.out.println(num[i][0] + num[i][1]);
						
			}
		}
}
