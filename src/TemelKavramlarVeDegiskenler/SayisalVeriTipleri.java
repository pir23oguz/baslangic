package TemelKavramlarVeDegiskenler;

public class SayisalVeriTipleri {

	public static void main(String[] args) {
	byte abc = 120;
		// byte abc = 150; 127 �st� hata verir
		// System.out.println("abc"); Tirnak icinde yazarsak metin olrak alg�lar
		// System.out.println(abc); 100 yazar abc degisken bir variable dir
		// System.out.println('abc'); tek t�rnak hata 
		
		/*System.out.println(abc);
		System.out.println("abc");
		System.out.println(100);
		*/
		System.out.println("Byte degeri : " + abc);
		
		short shortDegiskeni = 1000;
		//System.out.println(shortDegiskeni);		
		System.out.println("Short Degeri :" + shortDegiskeni);	
		int intDeger = 100000;
		System.out.println("Integer Degeri : " + intDeger);
		long longDeger = 100000000;
		System.out.println("Long Degeri: " + longDeger);
	}

}
