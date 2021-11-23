import java.util.Scanner;

public class ejercicioviernes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num;	
		System.out.println("Introduce un número positivo");
		num = sc.nextInt();
		while (num!=1 && num>0) {
			if (num%2==0) {
			num = num/2;
			}
			if (num%2!=0) {
				num = num*3+1;
			}
			System.out.println(num);
		}
		if (num==1) {
			System.out.println("Resultado " + num);
		} else {
			System.out.println("ERROR");
		}
		sc.close();
	}

}
