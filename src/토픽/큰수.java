package ����;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class ū�� {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String A = st.nextToken();
		String B = st.nextToken();
		
		
		System.out.println(new BigInteger(A).add(new BigInteger(B)));
		
	}

}
