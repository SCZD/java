import java.util.Scanner;

public class FastScanner {
	Scanner sc = new Scanner(System.in);
	public int nextInt() {
		String a = "";
		int b = 0;
		while(!isNumeric(a)) {
			System.out.print("Numero (int): ");
			a = sc.nextLine();
			if(isNumeric(a)) b = Integer.parseInt(a);
		}
		return b;
	}
	
	public Double nextDouble() {
		String a = "";
		double b = 0;
		while(!isNumericD(a)) {
			System.out.print("Numero (double): ");
			a = sc.nextLine();
			if(isNumericD(a)) b = Double.parseDouble(a);
		}
		return b;
	}
	
	public String nextLine() {
		System.out.print("String: ");
		String a = sc.nextLine();
		return a;
	}

	private boolean isNumeric(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	private boolean isNumericD(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}