package pattern;

import java.util.Scanner;
/*
  1
  2 13
  3 12 14
  4 11 15 22
  5 10 16 21 23
  6  9 17 20 24 27
  7  8 18 19 25 26 28
 */
public class P6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int [][] ar = new int[n][n];
		int e = 1;
		int o = 2*n-1;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				for(int j=i;j<n;j++) {
					ar[j][i]=e++;
				}
				e+=(n-i-1);
			}else {
				for(int j=i;j<n;j++) {
					ar[j][i]=o--;
				}
				o+=(n-i)+(n-i-1)+(n-i-2);
			}
			
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(ar[i][j]==0) {
					continue;
				}else {
					System.out.printf("%3d",ar[i][j]);
				}
			}System.out.println();
		}
	}
}
