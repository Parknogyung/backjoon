package 그리디;
import java.util.*;
import java.math.*;
public class 단어수학 {

	public static void main(String[] args) {
	    int n;
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
	        String[] arr = new String[n];
	        for(int i=0;i<n;i++)
	            arr[i] = sc.next();
	        // A(0) ~ J(9) 까지 => A~Z까지!
	        int[] num = new int[26];
	        for(int i=0;i<n;i++) {
	            String t = arr[i];
	            for(int j=0;j<t.length();j++) {
	                num[(t.charAt(j)-65)] += (int)Math.pow(10,(t.length()-j-1));
	            }
	        }
	        Arrays.sort(num);
	        int result = 0;
	        for(int i=25,k=9;i>=0;i--,k--) {
	            if(num[i]==0) break;
	            result += (num[i]*k);
	        }
	        System.out.println(result);
	    }
	}

		
		
		
		
	

