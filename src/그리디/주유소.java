package 그리디;
import java.util.*;
public class 주유소 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int city = sc.nextInt();
	long[] mt = new long[city-1];
	long[] oil = new long[city];
	for(int i = 0 ; i < city-1 ; i++) {
		mt[i] = sc.nextLong();
	}
	for(int i = 0 ; i <city ; i ++) {
		oil[i] = sc.nextLong();
	}
	long sum =0;
	long cnt = oil[0];
 for(int i =0 ; i <city-1 ; i++) {
	 if(oil[i] < cnt) {
		 cnt = oil[i];
	 }
	 sum = sum+ (cnt*mt[i]);
 }
System.out.println(sum);
}
}
