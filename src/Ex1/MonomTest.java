package Ex1;
import java.util.ArrayList;
/**
 * This class represents a simple (naive) tester for the Monom class, 
 * Note: <br>
 * (i) The class is NOT a JUNIT - (i.e., educational reasons) - should be changed to a proper JUnit in Ex1. <br>
 * (ii) This tester should be extend in order to test ALL the methods and functionality of the Monom class.  <br>
 * (iii) Expected output:  <br>
 * *****  Test1:  *****  <br>
0) 2.0    	isZero: false	 f(0) = 2.0  <br>
1) -1.0x    	isZero: false	 f(1) = -1.0  <br>
2) -3.2x^2    	isZero: false	 f(2) = -12.8  <br>
3) 0    	isZero: true	 f(3) = 0.0  <br>
 *****  Test2:  *****  <br>
0) 0    	isZero: true  	eq: true  <br>
1) -1.0    	isZero: false  	eq: true  <br>
2) -1.3x    	isZero: false  	eq: true  <br>
3) -2.2x^2    	isZero: false  	eq: true  <br>

 *****  Test3:  *****
0) The monom is:.12   The monom isn't vaild !
1) The monom is:!14   The monom isn't vaild !
2) The monom is:16^1   The monom isn't vaild !
3) The monom is:16&   The monom isn't vaild !
4) The monom is:(18   The monom isn't vaild !
5) The monom is:()4   The monom isn't vaild !
6) The monom is:(21)   The monom isn't vaild !
7) The monom is:5-9   The monom isn't vaild !



 *****  Test4:  *****
0) The monom is : 3x  the derivative is : 3.0
 isZero: false
add the monom oneself : 6.0x
is equals : true
1) The monom is : 5x^3  the derivative is : 15.0x^2
 isZero: false
add the monom oneself : 10.0x^3
is equals : true
2) The monom is : -6x^6  the derivative is : -36.0x^5
 isZero: false
add the monom oneself : -12.0x^6
is equals : true
3) The monom is : x  the derivative is : 1.0
 isZero: false
add the monom oneself : 2.0x
is equals : true
4) The monom is : -x  the derivative is : -1.0
 isZero: false
add the monom oneself : -2.0x
is equals : true
5) The monom is : -9  the derivative is : 0.0
 isZero: false
add the monom oneself : -18.0
is equals : true
6) The monom is : 0  the derivative is : 0.0
 isZero: true
add the monom oneself : 0.0
is equals : true

*****  Test5:  *****
0) The monom is : 0  after multiply : 0
1) The monom is : 4x  after multiply : 36.0x^2
2) The monom is : -x  after multiply : -9.0x^2
3) The monom is : 8  after multiply : 72.0x
4) The monom is : 12x^2  after multiply : 108.0x^3
5) The monom is : 9x^7  after multiply : 81.0x^8


 */
public class MonomTest {
	public static void main(String[] args) {
//		test1();
//		test2();
//		test3();
//		test4();
		test5();
	}
	private static void test1() {
		System.out.println("*****  Test1:  *****");
		String[] monoms = { "2" , "x","-3.2x^2","0"};
		for(int i=0;i<monoms.length;i++) {
			Monom m = new Monom(monoms[i]);
			String s = m.toString();
			m = new Monom(s);
			double fx = m.f(i);
			System.out.println(i+") "+m +"    \tisZero: "+m.isZero()+"\t f("+i+") = "+fx);
		}
	}
	private static void test2() {
		System.out.println("*****  Test2:  *****");
		ArrayList<Monom> monoms = new ArrayList<Monom>();
		monoms.add(new Monom(0,5));
		monoms.add(new Monom(-1,0));
		monoms.add(new Monom(-1.3,1));
		monoms.add(new Monom(-2.2,2));

		for(int i=0;i<monoms.size();i++) {
			Monom m = new Monom(monoms.get(i));
			String s = m.toString();
			Monom m1 = new Monom(s);
			boolean e = m.equals(m1);
			System.out.println(i+") "+m +"    \tisZero: "+m.isZero()+"  \teq: "+e);
		}
		System.out.println(" ");
	}


	/**
	 * all the ans should be error
	 */
	private static void test3() {
		System.out.println("*****  Test3:  *****");
		String[] monoms = { ".12", "!14", "16^1", "16&", "(18", "()4", "(21)","5-9" };
		for(int i=0;i<monoms.length;i++) {
			try {
				Monom temp = new Monom(monoms[i]);
			}
			catch (Exception Runtime) {
				System.out.println(i+")"+" The monom is:"+monoms[i]+ "   "
						+ "The monom isn't vaild !");
			}

		}
		System.out.println(" ");
	}


	private static void test4() {
		System.out.println("*****  Test4:  *****");
		String[] monoms = { "3x", "5x^3","-6x^6" , "x", "-x","-9", "0"};
		for(int i=0;i<monoms.length;i++) {
			Monom temp=new Monom(monoms[i]);
			System.out.println(i+")"+" The monom is : "+ monoms[i] +"  "
					+"the derivative is : "+ temp.derivative());
			System.out.println(" isZero: "+temp.isZero());
			temp.add(temp);
			System.out.println("add the monom oneself : "+temp );
			System.out.println("is equals : "+temp.equals(temp));

		}
	}

	private static void test5() {
		System.out.println("*****  Test5:  *****");
		String[] monoms = { "0", "4x", "-x", "8","12x^2", "9x^7"};
		Monom mul=new Monom("9x");
		for(int i=0;i<monoms.length;i++) {
			Monom temp=new Monom(monoms[i]);
			temp.multipy(mul);
			System.out.println(i+ ")"+" The monom is : " + monoms[i] + "  "+"after multiply : " + temp.toString() );

		}

	}
}
