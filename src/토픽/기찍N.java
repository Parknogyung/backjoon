package ����;
import java.io.*;
public class ����N {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long n = Integer.parseInt(br.readLine());
		
		for(long i = n ; i>0 ; i--) {
			bw.write(i+"\n");
		}bw.flush();
	}

}
