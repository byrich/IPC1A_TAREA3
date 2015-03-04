package ipc;
import java.util.Scanner;
public class Ipc2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=0;
		System.out.println("ingrese numero para verificacion");
		a = s.nextInt();
		if (a%2==0) {
			System.out.println("el numero es par");
		}
			else{ 
				System.out.println("el numero es impar");
		}
	}

}
