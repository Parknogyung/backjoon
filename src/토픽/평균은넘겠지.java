package 토픽;
import java.io.*;
import java.util.StringTokenizer;
public class 평균은넘겠지 {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		StringTokenizer st;
		double [] total = new double[tc];
		
		for(int i = 0 ; i < tc ; i ++) {
		st = new StringTokenizer(br.readLine(), " ");
		int stu = Integer.parseInt(st.nextToken());	
		double sum = 0;
		double avg =0;
		double cnt =0;
		double to = 0;
		int[] sco = new int [stu]; 
		
		for(int j = 0 ; j <stu ; j++) {
				int num = Integer.parseInt(st.nextToken());
				 sco[j] = num; 
				 sum += sco[j];
				 
		}
			
		
		avg = sum/stu;
		
		for(int k = 0 ; k < stu ; k++) {
		if(avg < sco[k]) {
				cnt++;	
			}
		}
		to=cnt/stu;
		total[i] = to;
		}
		for(int i = 0 ; i < tc ; i++) {
			System.out.printf("%.3f%c\n", total[i]*100, '%');
		}
		
	}

}
