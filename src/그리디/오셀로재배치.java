package 그리디;
import java.io.*;
public class 오셀로재배치 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < tc ; i++) {
			int n = Integer.parseInt(br.readLine());
			String start = br.readLine();
			String target = br.readLine();
			int wcnt =0;
			int bcnt = 0;
			for(int j = 0 ; j < start.length() ; j++) {
				if(start.charAt(j) != target.charAt(j)) {
					if(start.charAt(j) == 'W') 
						wcnt++;
					
					else 
						bcnt++;
					
					
				}
			}
			bw.write(Math.max(wcnt, bcnt)+"\n");
		}
bw.flush();
	}

}
