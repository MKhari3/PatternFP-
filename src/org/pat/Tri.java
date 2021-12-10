package org.pat;

public class Tri {
public static void main(String[] args) {
	int a=5;
	for (int i = 1; i <=a; i++) {
		for (int j =i; j <=a; j++) {
			System.out.print(" ");
		}
		for (int k =1; k <=i; k++) {
			if (k%2!=0) {
				System.out.print(" *");
		}else {
			System.out.print("");
		}
			
		}		
		for (int l =1; l<=i; l++) {
			if (l%2==0) {
				System.out.print(" *");
		}else {
			
			System.out.print("");
		}
		}		
		System.out.println();
	}
}
}
