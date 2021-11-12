package 토픽;
import java.io.*;
import java.util.*;
public class 최댓값 {

	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int [] n = new int[9];
	int cnt=1;
	
	for(int i = 0 ; i < 9 ; i++) {
		n[i] = Integer.parseInt(br.readLine());
	}
	int max = n[0];
	for (int i = 0 ; i < 9 ; i++){
	if(max < n[i]) {
		max=n[i];
		cnt=i+1;
	}
	
	}
	bw.write(max + "\n" + cnt);
	bw.flush();
}
}