package 그리디;
import java.util.*;
public class 신입사원 {


    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int tc = sc.nextInt();
    	
    	for(int i = 0 ; i < tc; i++) {
    		int num = sc.nextInt();
    		int[] score = new int[num+1];
    		for(int j = 0 ; j<num ; j++) {
    			score[sc.nextInt()] = sc.nextInt();
    		}
    		int count = 1;
    		int rank = score[1];
    		for(int x = 2 ; x<=num;x++) {
    			if(rank >= score[x]) {
    				rank = score[x];
    				count++;
    			}
    		}
    		System.out.println(count);}
    	
    }
}