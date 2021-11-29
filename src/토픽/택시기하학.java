package 토픽;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
	public class 택시기하학 {
		public static void main(String[] args) throws IOException {	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int r = Integer.parseInt(br.readLine());
			double a = Math.pow(r, 2)*Math.PI;
			double b= 2*r*r;
			System.out.printf("%.6f\n", a);
			System.out.printf("%.6f",b);
		}
	}