package �׸���;
import java.util.*;
public class �������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long sum = 0;
		long cnt = 0;
		
		for(int i = 1 ; i<=n ; i++) {
			sum+=i;
			if(sum>n) {
				break;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
