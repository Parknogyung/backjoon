package 토픽;
import java.util.*;
public class 두수비교 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int n1 = sc.nextInt();

	if(n>n1) {
		System.out.println(">");
	}
	else if(n<n1) {
		System.out.println("<");
	}
	else if(n==n1) {
		System.out.println("==");
	}
}
}
