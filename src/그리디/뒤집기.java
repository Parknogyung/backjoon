package 그리디;
import java.util.*;
public class 뒤집기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		int cnt1= 0;
		int cnt2=0;
		char[] num = n.toCharArray();
		if(num[0]=='0')
			cnt1++;
		else
			cnt2++;

	for(int i = 1 ; i <num.length ; i++) {
	if(num[i] != num[i-1]) {
		if(num[i]=='0') {
		cnt1++;
	}
		else if(num[i]=='1') {
			cnt2++;
		}
		
		
	}
	}
	System.out.println(Math.min(cnt1, cnt2));
}}
