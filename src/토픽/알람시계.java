package 토픽;
import java.util.*;
public class 알람시계 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if(h==0 && m <45) {
			m=m+60;
			m=m-45;
			h=23;
		}
		else if(m<45) {
			m=m+60;
			m=m-45;
			h=h-1;
		}
		
		else {
			m=m-45;
		}
		System.out.printf("%d %d", h, m);
	}

}
