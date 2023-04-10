package pattern;

import java.util.Scanner;
/*
5   6  15  16  25
4   7  14  17  24
3   8  13  18  23
2   9  12  19  22
1  10  11  20  21
*/
public class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for(int r=n;r>=1;r--) {
			int t1=r;
			int t2=2*n-(r-1);
			for(int c=1;c<=n;c++) {
				if(c%2!=0) {
					System.out.printf("%4d",t1++);
					t1+=(2*n-1);
				}else {
					System.out.printf("%4d",t2);
					t2+=2*n;
				}
			}System.out.println();
		}
	}
}
