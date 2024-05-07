package package1;
import package2.*;

public class A {

	
	//protected String protMessage = "this is protected";
	public static void main(String[] args) {
		//public - pristupy z tridy, packeg, subtridy , svet
			// bude mozne vsude , vsimne me si ze tridy maji public
		//protected - pristupy z tridy, packeg, subtridy 
			//pristup napric tridama paklize jsou extended
		//no modifier (kdyz definuji a explicitne nereknu je toto) - pristupy z tridy, packeg, subtridy 
			//jen v ramci daneho packege jinak neni videt
		//private - trida
			//jen dana trida
		//package je kolekce trid, kazda ma stoji vstupni man tridu, ale nemusi

		C c = new C();
		
		// System.out.println(c.defMessage); - nepujde jelikoz ji nevidi
		//System.out.println(c.pubMessage); - pujde jelikoz public muze napric.
		
		
		B b = new B();
		
		//System.out.println(b.privMessage); // nepujde
		
	}

}
