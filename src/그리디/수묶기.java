package 그리디;
import java.io.*;
import java.util.Arrays;

public class 수묶기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] num = new int [n];
		 for (int i = 0; i < n; i++) {
		        num[i] = Integer.parseInt(br.readLine());
		    }
		 
		    Arrays.sort(num);
		    int left = 0;
		    int right = n - 1;
		    long ans = 0;
		    // -
		    for (; left < right; left += 2) {
		        if (num[left] < 1 && num[left + 1] < 1) {
		            ans += num[left] * num[left + 1];
		        } else {
		            break;
		        }
		    }
		    // +
		    for (; right > 0; right -= 2) {
		        if (num[right] > 1 && num[right - 1] > 1) {
		            ans += num[right] * num[right - 1];
		        } else {
		            break;
		        }
		    }
		 
		    for (; right >= left; right--) {
		        ans += num[right];
		    }
		    System.out.println(ans);
		}
}
