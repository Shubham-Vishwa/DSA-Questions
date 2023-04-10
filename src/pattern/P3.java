package pattern;
/*
1 
2 3 2 
3 4 5 4 3 
4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5
*/
public class P3 {
	public static void main(String[] args) {
		int n = 5;
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=n-r;c++) {
				System.out.print("  ");
			}
			int temp=r;
			for(int c=1;c<=r;c++) {
				System.out.print(temp+++" ");
			}
			temp-=2;
			for(int c=1;c<=(r-1);c++) {
				System.out.print(temp--+" ");
			}
			System.out.println();
		}
	}
}
