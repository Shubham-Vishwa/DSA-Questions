package pattern;

import java.util.Scanner;

/*
 * 1
 * 2 7
 * 3 6 8
 * 4 5 9 10
 */
public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		m(n);
	}

	private static void m(int n) {
		int num = 1;
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=r;c++) {
				if(c%2==0) {
					num = num+(2*(n-r)+1);
					System.out.printf("%3d",num);
				}else {
					if(c==1) {
						num = r;
					}else {
						num = num+((c/2)+1)*(r-2);
					}
					System.out.printf("%3d",num);
				}
			}System.out.println();
		}
	}
}
