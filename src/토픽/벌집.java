package ÅäÇÈ;
import java.io.*;
public class ¹úÁı {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 1;
		int index = 2;
		
		if(n == 1) {
			System.out.println(1);
		}
		else {
			while(index <= n) {
				index = index +(cnt*6);
				cnt++;
			}
			System.out.println(cnt);
		}

	}

}
