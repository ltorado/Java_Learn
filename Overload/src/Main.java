
public class Main {

	public static void main(String[] args) {
		int x = add(1,2);
		System.out.println(x);
	}
	
	static int add(int a, int b){	
		return a+b;

	}
	static int add(int a, int b, int c){	//aby slo musime bud prejmenovat, nebo upravit vice hodnot, nebo zmenit datovy typ
		return a + b + c;

	}
	
	static int add(double a, int b){	//musim obe nebo staci jendu ?
		return a + b;

	}
}
