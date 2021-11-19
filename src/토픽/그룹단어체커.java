package 토픽;
import java.io.*;
import java.util.*;
public class 그룹단어체커 {

	public static void main(String[] args) throws IOException{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num= Integer.parseInt(br.readLine());
			int cnt=num;

			for(int c = 0;c<num;c++) {
				String st = br.readLine();
				boolean test[] = new boolean[26];

				for(int i=0;i<st.length()-1;i++) {
					
					if(st.charAt(i)!=st.charAt(i+1)) {
						if(test[st.charAt(i+1)-97]==true) {
							cnt--;
							break;
						}
					}
			
					test[st.charAt(i)-97]=true;
				}
				
			}
			
			System.out.println(cnt);
		}
	}

