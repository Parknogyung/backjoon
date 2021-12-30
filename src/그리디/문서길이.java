package 그리디;
import java.io.*;

public class 문서길이 {
	
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	String a = br.readLine();
	String b = br.readLine();
	int cnt = 0;    	
    for(int i = 0 ; i < a.length() - b.length()+1 ; i++) {
    	if(a.substring(i, i+b.length()).equals(b)) {
    		cnt++;
    		i += b.length()-1;
    		
    	}
    }
    System.out.println(cnt);
	}


}
