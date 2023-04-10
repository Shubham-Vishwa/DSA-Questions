package pattern;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		sc.close();
		String [] ar = name.split(" ");
		for(int i=0;i<ar.length;i++) {
			print(ar[i]);
			System.out.println();
			System.out.println("\033[H\033]2J");
			System.out.flush();
		}
	}

	private static void print(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(str.charAt(j));
			}System.out.println();
		}
	}
}
