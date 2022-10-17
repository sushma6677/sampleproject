package javaapp;

public class firstpattrecur {
static void  patt(int row,int col) {
	if(row==0) {
		return;
	}
	if(col<row) {
		System.out.print("*");
		patt(row,col+1);
	}else {
		System.out.println();
		patt(row-1,col);
	}
}
	public static void main(String[] args) {
patt(4,0);
	}

}
