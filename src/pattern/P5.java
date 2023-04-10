package pattern;

import java.util.Scanner;
/*
4444444
4333334
4322234
4321234
4322234
4333334
4444444
 */
public class P5 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int r=1;r<=(n+1)/2;r++) {
			for(int c=1;c<=r;c++) {
				int value = (n+1)/2-(c-1);
				System.out.print(value+" ");
				Thread.sleep(100);
			}
			for(int c=1;c<=2*((n/2)-(r-1));c++) {
				int v = (n+1)/2 - (r-1);
				System.out.print(v+" ");
				Thread.sleep(100);
			}
			int v = (n+1)/2-(r-2);
			for(int c=1;c<=r-1;c++) {
				System.out.print(v+++" ");
				Thread.sleep(100);
			}
			System.out.println();
		}
		for(int r=(n)/2;r>=1;r--) {
			for(int c=1;c<=r;c++) {
				int value = (n+1)/2-(c-1);
				System.out.print(value+" ");
				Thread.sleep(100);
			}
			for(int c=1;c<=2*((n/2)-(r-1));c++) {
				int v = (n+1)/2 - (r-1);
				System.out.print(v+" ");
				Thread.sleep(100);
			}
			int v = (n+1)/2-(r-2);
			for(int c=1;c<=r-1;c++) {
				System.out.print(v+++" ");
				Thread.sleep(100);
			}
			System.out.println();
		}
	}
}
