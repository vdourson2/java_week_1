package java_week_1;

public class Hello2 {

	public static void main(String[] args) {
		printObjectVersion();;
	}
	
	private static void printObjectVersion() {
		Character t1 = 'e';
		Byte t2 = 120;
		Short t3 = 1546;
		Integer t4 = 1_000_000;
		Long t5 = 2_000_000_000_000l;
		Boolean t6 = true;
		Float t7 = 7.43f;
		Double t8 = 7.33e10;
		
		System.out.println("Char object type : \n Character : " + t1);
		System.out.println("Integer object types : \n Byte : " + t2 + "\n Short : " + t3 + "\n Integer : " + t4 + "\n Long : " + t5);
		System.out.println("Boolean object type : \n Boolean : " + t6);
		System.out.println("Floating-point object types : \n Float : " + t7 + "\n Double : " + t8);
	}

}
