package pattern;

import java.util.Scanner;
/*
Hello World
H
He
Hel
Hell
Hello

W
Wo
Wor
Worl
World
 */
public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		sc.close();
		String [] ar = name.split(" ");
		for(int i=0;i<ar.length;i++) {
			print(ar[i]);
			System.out.println();

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
