package �׸���;

import java.util.*;

public class ȸ�ǽ�_���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] time = new int[n][2];
		int cnt = 0;
		int end = 0;
		
		for(int i = 0 ; i<n;i++) {
			time[i][0]=sc.nextInt();
			time[i][1] =sc.nextInt();
		}
		Arrays.sort(time, (o1,o2)->(o1[0]-o2[0])); //�迭�� ù��° element�� ������������ ����
		Arrays.sort(time, (o1,o2)->(o1[1]-o2[1]));
		
		for(int i = 0 ; i < n ; i ++) {
		if(time[i][0] >= end) {
			end=time[i][1];
			cnt++;
		}
		}
		System.out.println(cnt);
	}}
		
		