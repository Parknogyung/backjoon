package 토픽;
import java.io.*;
public class 단어공부 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String st = br.readLine();
		int[] word = new int[1000001];
		int [] rank = new int[26];
		int max = 0;
		int index = 0 ;
		
		for(int i = 0 ; i < st.length(); i++) {
			word[i] = (int)st.charAt(i);
			if(word[i] - 65 < 26) {
			rank[word[i]-65] = rank[word[i]-65] + 1;
			}
			else if(word[i] - 65 > 26) {
			rank[word[i]-97] = rank[word[i]-97] + 1;
		}
		}
		
		for(int i = 0 ; i < rank.length ; i++) {
		if (max < rank[i]) {
			max = rank[i];
			index = i + 65;
		}
		
		else if (max == rank[i]) {
			index = '?';
		}
		}
		bw.write((char)index);
		bw.flush();
	}}


