package javaapp;

public class first {
	public static void push(){

	}
	public void put(int m){

	}
static void patt(int n) {
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.println();
	}
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i+1;j++) {
			System.out.print(i);
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
patt(4);
push();
put(7);
	}

}


