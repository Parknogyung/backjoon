package 토픽;

import java.io.*;
import java.util.*;

public class 폴리오미노 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String st = br.readLine();

		st = st.replace("XXXX", "AAAA");
		st = st.replace("XX", "BB");
		
		if(st.contains("X")) {
			st="-1";
		}
		
		System.out.println(st);
		
		

	}

}
