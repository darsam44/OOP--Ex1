package Ex1Testing;
/**
 * 

 */
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import Ex1.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ComplexFunctionTest {
	public static final double EPS = 0.00001;
	//check the initfromString && toString
	@Test
	void test1() {
		ArrayList<String> check = new ArrayList<String>();
		ArrayList<ComplexFunction> CF = new ArrayList<ComplexFunction>();
		check.add("plus(plus(x^2+2x, 6),mul(x^2, 2))"); //3x^2+2x+6
		ComplexFunction cf1= new ComplexFunction();
		ComplexFunction cf2=(ComplexFunction) cf1.initFromString("plus(3x^2, 2x+6)");
		
		check.add("plus(div(2x^2,2),plus(x,0))");//x^2+x
		ComplexFunction cf3=(ComplexFunction) cf1.initFromString("plus(x^2+x, 0)");
		
		check.add("none(x^3-9)");//x^3-9
		ComplexFunction cf4=(ComplexFunction)cf1.initFromString("plus(x^3-8, -1)");
	
		check.add("none(0)");//0
		ComplexFunction cf5=(ComplexFunction)cf1.initFromString("plus(x^2, -x^2)");
		
		check.add("max(x^2,3x)");//x^2
		ComplexFunction cf6=(ComplexFunction)cf1.initFromString("plus(x^2, -x^2+x^2)");
		
		check.add("min(x^3,x)");//x
		ComplexFunction cf7=(ComplexFunction)cf1.initFromString("plus(x, 0)");
		
		CF.add(cf2);
		CF.add(cf3);
		CF.add(cf4);
		CF.add(cf5);
		CF.add(cf6);
		CF.add(cf7);
		
		for(int i=0;i<6;i++) {
			ComplexFunction cf0= new ComplexFunction();
			ComplexFunction cf=(ComplexFunction)cf0.initFromString(check.get(i));
			if(!CF.get(i).equals(cf)){
				fail("ERR: "+cf.toString()+" should be equals to "+CF.get(i).toString());
			}
			if(!CF.get(i).copy().equals(cf.copy())) {
				fail("ERR: "+cf.copy().toString()+" should be equals to "+CF.get(i).copy().toString());
			}
		}
		
	}
	
	
	
//	@Test
//	void test() {
//		Monom m1 = new Monom(2,2);
//		Monom m2 = new Monom(3,3);
//		ComplexFunction cf = new ComplexFunction("plus", m1,m2);
//		cf.mul(m2);
//		System.out.println(cf);
//		Polynom p = new Polynom();
//		p.add(m1);
//		p.add(m2);
//		p.multiply(m2);//something weird
//		double v = 4.0;
//		double dp = p.f(v);
//		double dcf = cf.f(v);
//		double dd = Math.abs(dp-dcf);
//		if(dd>EPS) {
//			System.out.println(p+" at "+v+" = "+dp);
//			System.out.println(cf+" at "+v+" = "+dcf);
//			fail("ERR: should got the same value from: "+p+"  and "+cf);
//		
//		}
//	}

//		@Test
//		void testOfString() {
//			Polynom p1 = new Polynom();
//			p1.add( new Monom(2,2));
//			Polynom p2 = new Polynom();
//			p2.add(new Monom(3,3));
//			Monom m1 = new Monom(2,2);
//			Monom m2 = new Monom(3,3);
//			ComplexFunction cf = new ComplexFunction("plus", m1,m2);
//			ComplexFunction cf3 = new ComplexFunction("plus", p1,p2);
//			cf.mul(m2);
//			cf3.mul(m2);
//			String s = cf.toString();
//			function cf2 = cf.initFromString(s);
//			if(!cf.equals(cf2)) {
//				fail("ERR: "+cf+" should be equals to "+cf2);
//			}
//			if(!cf.equals(cf3)) {
//				fail("ERR: "+cf+" should be equals to "+cf3);
//			}
//	}
//	@Test
//	void testComplexFunction() {
//		String s1 = "3.1 +2.4x^2 -x^4";
//		String s2 = "5 +2x -3.3x +0.1x^5";
//		String[] s3 = {"x -1","x -2", "x -3", "x -4"};
//		Polynom p1 = new Polynom(s1);
//		Polynom p2 = new Polynom(s2);
//		Polynom p3 = new Polynom(s3[0]);
//		for(int i=1;i<s3.length;i++) {
//			p3.multiply(new Polynom(s3[i]));
//		}
//		ComplexFunction cf4 = new ComplexFunction("div", new Monom("x"),p3);
//		ComplexFunction cf = new ComplexFunction("plus", p1,p2);
//		cf.div(p1);
//		String s = cf.toString();
//		function cf5 = cf4.initFromString(s); //equals to cf
//		if(!cf.equals(cf5)) {
//			fail("ERR: "+cf+" should be equals to "+cf5);
//		}
//		int size=10;
//		for(int i=0;i<size;i++) {
//			double x = Math.random();
//			double d = cf.f(x);
//			double d5 = cf5.f(x);
//			assertEquals(d,d5,EPS);
//		}
//		System.out.println(cf4);
//		System.out.println(cf5);
//	}
}
