package ����;
import java.io.*;
import java.util.*;
public class a���ϱ�b����4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String str;
		
		while((str=br.readLine()) != null) {
			try {
			st=new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write((a+b)+"\n");
			}catch(Exception e) {
				break;
			}
			}
		 bw.flush();
		 
	}

}
