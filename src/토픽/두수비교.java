package ����;
import java.util.*;
public class �μ��� {
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
