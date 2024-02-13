import java.util.Scanner;
import java.io.*;
import java.util.*;
//2023 j3
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] inputs = new String[n];
		
		for (int i = 0; i <= n; i++) {
			inputs[i] = sc.nextLine();
		}
		System.out.println(Arrays.toString(inputs));
	}
}
