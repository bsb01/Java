package operator;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
		System.out.print("첫 번째 논리값(true ot false) : ");
		a = sc. nextBoolean();
		System.out.print("첫 번째 논리값(true ot false) : ");
		b = sc. nextBoolean();
		
		System.out.println("!" + a + " = " + (!a));
		System.out.println(a + " && " + b + " = " + (a && b));
		System.out.println(a + " ^ " + b + " = " + (a ^ b));
		System.out.println(a + " || " + b + " = " + (a || b));
		sc.close();
}
