package 그리디;
import java.util.*;
public class 전자레인지 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] a = {300, 60, 10};
		int nam = t;
		int[] mok = new int[3];
		
		
		for(int i = 0 ; i < 3 ; i++) {
			mok[i] = nam/a[i];
			nam = nam%a[i];
					if(0 <nam && nam < 10) {
						System.out.println(-1);
						break;
					}
					else if(nam == 0) {
						System.out.printf("%d %d %d", mok[0], mok[1], mok[2]);
						break;
					}
		}
		
	}

}
