package ±×¸®µğ;
import java.util.*;
public class ÀÒ¾î¹ö¸°_°ıÈ£ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sub = sc.next().split("\\-");
		int sum = 0;
		int sus = 0;
		String[] fir = sub[0].split("\\+");
		
		for(int i=0;i<fir.length;i++) {
			sum = sum+Integer.parseInt(fir[i]);
		}
	
		for(int j = 1 ; j < sub.length;j++) {
		String[] sub2 = sub[j].split("\\+");
		
		for(int i=0; i<sub2.length;i++) {
			sus = sus+Integer.parseInt(sub2[i]);
		}}
System.out.println(sum-sus);
	}}
