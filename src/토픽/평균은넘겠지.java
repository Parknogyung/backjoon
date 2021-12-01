package 토픽;
import java.io.*;
import java.util.StringTokenizer;
public class 평균은넘겠지 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		
		for(int i = 0 ; i < tc ; i ++) {
		st = new StringTokenizer(br.readLine(), " ");
		
		int stu = Integer.parseInt(st.nextToken());	
		double sum = 0;
		double avg =0;
		int cnt =0;
		int[] sco = new int [stu]; 
		
		for(int j = 0 ; i <stu ; i++) {
				int val = Integer.parseInt(st.nextToken());
				 sco[j] = val; 
				 sum += sco[j];
				
			}
		
		avg = sum/stu;
		
		for(int j = 0 ; j < stu ; j++) {
			if(avg<sco[j]) {
				cnt++;
			}
		}
		System.out.println(cnt);
		}
		
	}

}
