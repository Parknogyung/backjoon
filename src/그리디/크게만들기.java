package 그리디;
import java.io.*;
import java.util.*;
public class 크게만들기 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); int k = Integer.parseInt(st.nextToken());
		int [] num = new int[n];
		Stack<Integer> stack = new Stack<>();
		int cnt = 0;
		String[] str = br.readLine().split("");
		for(int i = 0; i < str.length ; i++) {
			num[i] = Integer.parseInt(str[i]);
		}
		
		for(int i = 0 ; i<num.length; i++) {
			while(cnt < k && !stack.isEmpty() &&stack.peek()<num[i]) {
				stack.pop();
				cnt++;
			}
			stack.push(num[i]);
		}
		for(int i = 0 ; i <n-k;i++) {
			System.out.print(stack.elementAt(i));
		}
	}

}
