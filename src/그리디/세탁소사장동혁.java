package ±×¸®µð;
import java.io.*;
import java.util.Arrays;
public class ¼¼Å¹¼Ò»çÀåµ¿Çõ {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		int [] c = new int[4];
		c[0] = 25;
		c[1] = 10;
		c[2] = 5;
		c[3] = 1;		
		int [] a = new int[tc];
		int [] mok = new int [4];
		
		for(int i = 0 ; i < tc ; i++) {
			a[i] = Integer.parseInt(br.readLine());
			int nam = a[i];
			mok[0] = nam / c[0];
			nam = nam % c[0];
			mok[1] = nam/c[1];
			nam = nam% c[1];
			mok[2] = nam/c[2];
			nam = nam% c[2];
			mok[3] = nam/c[3];
			nam = nam% c[3];
			bw.write(mok[0]+" "+ mok[1]+" " +mok[2]+ " "+ mok[3]+"\n");
				Arrays.fill(mok, 0);
		}
		bw.flush();
		
	}

}
