package ����;
import java.io.*;
public class ������ {
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
				int sum = 0;	// �� �ڸ��� �� ���� 
				
				while(number != 0) {
					sum += number % 10;	// �� �ڸ��� ���ϱ�
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
	


