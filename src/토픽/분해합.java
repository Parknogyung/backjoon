package 토픽;
import java.io.*;
public class 분해합 {
static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		System.out.println(a(n));
		
		
	}
		static int a(int x) {
			int result = 0;
			for(int i = 0; i < x; i++) {
				int number = i;
				int sum = 0;	// 각 자릿수 합 변수 
				
				while(number != 0) {
					sum += number % 10;	// 각 자릿수 더하기
					number /= 10;
				}
				if(sum + i == x) {
					result = i;
					break;
				}
			}
			return result;
		
		}
	}
	


