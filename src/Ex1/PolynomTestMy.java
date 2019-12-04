package Ex1;
/*
 the polynom is : 1.0x^3+5.0
when the root function gets (-3,5,0.0000001) the root is -1.7099759504199028
when the area function gets (-3,5,0.0000001) the area is 187.66241595146707
when the root function gets (2, -7, 0.0000001) the root is -1.70997594576329
 
the polynom is : 1.0x^7+8.0x^5+3.0x^3+5.0
when the root function gets (-3, 5, 0.0005) the root is -0.8249359130859375
when the area function gets (4, 5, 0.00005) the area is 56293.08196979487
 
*****  Test2:  *****
The polynom is : -3x  when x=-1, f(-1)=3.0   
isZero: false
add the polynom oneself : -6.0x
 multiply the polynom with 0.5: -3.0x
the derivative is: -3.0
the polynom substract oneself: 0
isZero: true
 
The polynom is : 5x^5-9x^3+6x^5-0  when x=-1, f(-1)=-2.0   
isZero: false
add the polynom oneself : 22.0x^5-18.0x^3
 multiply the polynom with 0.5: 11.0x^5-9.0x^3
the derivative is: 55.0x^4-27.0x^2
the polynom substract oneself: 0
isZero: true
 
The polynom is : 0  when x=-1, f(-1)=0.0   
isZero: true
add the polynom oneself : 0
 multiply the polynom with 0.5: 0
the derivative is: 0
the polynom substract oneself: 0
isZero: true
 
The polynom is : 8+5+6+x  when x=-1, f(-1)=18.0   
isZero: false
add the polynom oneself : 2.0x+38.0
 multiply the polynom with 0.5: 1.0x+19.0
the derivative is: 1.0
the polynom substract oneself: 0
isZero: true
 
 
*****  Test3:  *****
0) The polynom is:2x^+7^x+2x^7   The polynom isn't vaild !
1) The polynom is:2x^&+3x^2   The polynom isn't vaild !
2) The polynom is:3x^2+5^3+38^3   The polynom isn't vaild !
4) The polynom is:(x^2+6x^7)   The polynom isn't vaild !
5) The polynom is:!   The polynom isn't vaild !
6) The polynom is:()   The polynom isn't vaild !
 
*****  Test4:  *****
0) the polynom is : 2x^5+3x^3 , after multiply is : -4.0x^7+9.0x^3
1) the polynom is : 7x^2-9 , after multiply is : -14.0x^4+39.0x^2-27.0
2) the polynom is : -8x^4+5 , after multiply is : 16.0x^6-24.0x^4-10.0x^2+15.0
3) the polynom is : x^7 , after multiply is : -2.0x^9+3.0x^7
 
*****  Test5:  *****
0) the polynom is : 2x^5+3x^3 , are the polynom are equals : false
1) the polynom is : 7x^2-9 , are the polynom are equals : false
2) the polynom is : -4x^7+9 , are the polynom are equals : true
3) the polynom is : 0 , are the polynom are equals : false
4) the polynom is : 4x^7+9 , are the polynom are equals : false
5) the polynom is : -4x^7-9 , are the polynom are equals : false
6) the polynom is : 9-4X^7 , are the polynom are equals : true
 
*****  Test6:  *****
after copy the poly: true
after adding 1 to poly : false
after substarct 1 from poly : true

*****  Test7:  *****
the are of the polynom 2.0x^5+3.0x^3 from -3 to 3 with eps= 0.000001 is : 303.74971653909205
the are of the polynom 7.0x^2-9.0 from -3 to 3 with eps= 0.000001 is : 85.60672102675231
the are of the polynom -4.0x^7+9.0 from -3 to 3 with eps= 0.000001 is : 3316.3466191138864
the are of the polynom 0 from -3 to 3 with eps= 0.000001 is : 0.0
the are of the polynom 4.0x^7+9.0 from -3 to 3 with eps= 0.000001 is : 3316.337863280124
the are of the polynom -4.0x^7-9.0 from -3 to 3 with eps= 0.000001 is : 3262.3466101351823
the are of the polynom -4.0x^7+9.0 from -3 to 3 with eps= 0.000001 is : 3316.3466191138864

 */



public class PolynomTestMy {
	public static void main(String[] args) {
//		test1();
//		test2();
//		test3();
//		test4();
//		test5();
//		test6();
//		test7();
//		test8();
		test9();
	}

	private static void test9() {
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.point(0.5, 0.5);
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.line(0.2, 0.2, 0.8, 0.2);
		
	}

	public static void test8() {
		Monom mon= new Monom("+1x");
		System.out.println(mon);
		ComplexFunction cf = new ComplexFunction(new Polynom ("-1.0x^4 +2.4x^2 +3.1"));
		function f= cf.initFromString("plus(-1.0x^4 +2.4x^2 +3.1,+0.1x^5 -1.2999999999999998x +5.0)");
		System.out.println(f.toString());
	}
	

	public static void test1() {

		Polynom poly = new Polynom ("x^3+5");
		System.out.println("the polynom is : "+ poly);
		System.out.println("when the root function gets (-3,5,0.0000001) the root is "+  poly.root(-3, 5, 0.0000001));
		System.out.println("when the area function gets (-3,5,0.0000001) the area is "+poly.area(-3, 5, 0.0000001));
		System.out.println("when the root function gets (2, -7, 0.0000001) the root is "+ poly.root(2, -7, 0.0000001));

		System.out.println(" ");
		Polynom poly1 = new Polynom ("x^7+8x^5+3x^3+5");
		System.out.println("the polynom is : "+ poly1);
		System.out.println("when the root function gets (-3, 5, 0.0005) the root is "+poly1.root(-3, 5, 0.0005));
		System.out.println("when the area function gets (4, 5, 0.00005) the area is "+poly1.area(4, 5, 0.00005));

		System.out.println(" ");
	}
	private static void test2() {
		System.out.println("*****  Test2:  *****");
		String[] polynoms = { "-3x", "5x^5-9x^3+6x^5-0", "0", "8+5+6+x" };
		for(int i=0;i<polynoms.length;i++) {
			Polynom temp=new Polynom(polynoms[i]);
			System.out.println("The polynom is : "+ polynoms[i] +
					"  "+ "when x=-1, f(-1)="+temp.f(-1) +"   " );
			temp.add(temp);
			System.out.println("isZero: "+temp.isZero());
			System.out.println("add the polynom oneself : "+temp.toString() );
			Monom half =new Monom("0.5");
			temp.multiply(half);
			System.out.println(" multiply the polynom with 0.5: "+temp.toString());
			System.out.println("the derivative is: "+temp.derivative());
			temp.substract(temp);
			System.out.println("the polynom substract oneself: "+temp.toString());
			System.out.println("isZero: "+temp.isZero());
			System.out.println(" ");
		}

		System.out.println(" ");
	}



	private static void test3() {
		System.out.println("*****  Test3:  *****");
		String[] polynoms = { "2x^+7^x+2x^7", "2x^&+3x^2", "3x^2+5^3+38^3", "3x^7+8x^-5", "(x^2+6x^7)", "!", "()" };
		for(int i=0;i<polynoms.length;i++) {
			try {
				Polynom temp = new Polynom(polynoms[i]);
			}
			catch (Exception Runtime) {
				System.out.println(i+")"+" The polynom is:"+polynoms[i]+ "   "
						+ "The polynom isn't vaild !");
			}

		}
		System.out.println(" ");

	}



	private static void test4() {
		System.out.println("*****  Test4:  *****");
		String[] polynoms = { "2x^5+3x^3", "7x^2-9", "-8x^4+5", "x^7" };
		Polynom poly1=new Polynom("-2x^2+3");
		for(int i=0;i<polynoms.length;i++) {
			Polynom temp_poly=new Polynom(polynoms[i]); 
			temp_poly.multiply(poly1);
			System.out.println(i + ") " +"the polynom is : "+polynoms[i] + " , after multiply is : " 
					+temp_poly.toString());
		}
		System.out.println(" ");

	}


	private static void test5() {
		System.out.println("*****  Test5:  *****");
		String[] polynoms = { "2x^5+3x^3", "7x^2-9", "-4x^7+9", "0", "4x^7+9", "-4x^7-9" , "9-4X^7" };
		Polynom poly_1=new Polynom("-4x^7+9");
		for(int i=0;i<polynoms.length;i++) {
			Polynom temp_poly=new Polynom(polynoms[i]); 
			System.out.println(i + ") " +"the polynom is : "+polynoms[i] + " , are the polynom are equals : " 
					+poly_1.equals(temp_poly));
		}
		System.out.println(" ");
	}
	
	private static void test6() {
		System.out.println("*****  Test6:  *****");
		Polynom poly = new Polynom("2x^3-3x+4");
		Polynom_able x = poly.copy();
		System.out.println("after copy the poly: " +poly.equals(x));
		Polynom y = new Polynom("1");
		x.add(y);
		System.out.println("after adding 1 to poly : "+poly.equals(x));
		x.substract(y);
		System.out.println("after substarct 1 from poly : " +poly.equals(x));
	}


private static void test7() {
	System.out.println("*****  Test7:  *****");
	String[] polynoms = { "2x^5+3x^3", "7x^2-9", "-4x^7+9", "0", "4x^7+9", "-4x^7-9" , "9-4X^7" };
	for(int i=0;i<polynoms.length;i++) {
		Polynom temp_poly=new Polynom(polynoms[i]);
		double ans = temp_poly.area(-3, 3, 0.000001);
		System.out.println("the are of the polynom " +temp_poly + " from -3 to 3 with eps= 0.000001 is : " + ans );
	}
	System.out.println(" ");
}
}
