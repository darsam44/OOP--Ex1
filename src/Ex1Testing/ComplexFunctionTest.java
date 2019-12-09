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
	@Test //check the initfromstring, copy, equals, toString
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
		
		check.add("min(x^2,x)");//x
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
	
	
	//all the edges cases 
	@Test 
	void test2() {
		ArrayList<ComplexFunction> CF = new ArrayList<ComplexFunction>();
		//opening new polynoms
		 Polynom e1 = new Polynom ("+x^4-9");
		 Polynom e2 = new Polynom ("-x+9");
		
		 
		 //should throw exceptions
		 try{
			 ComplexFunction cf3=new ComplexFunction("none", e1, e2);
		 }catch(Exception e) {
			 System.out.println("none op with 2 functions throws exception ");
		 }
		 
		 try{
			 ComplexFunction cf4=new ComplexFunction("eror", e1, e2);
		 }catch(Exception e) {
			 System.out.println("eror op throws exception ");
		 }
		 
		 try {
			 ComplexFunction cf5=new ComplexFunction("shani", e1, e2); //should throw exception
		 }catch(Exception e) {
			 System.out.println("shani op throws exception ");
 
		 }

	}
	
	
	//checking the min max cases and comp function
	@Test
	void test3() {
		
		ArrayList<ComplexFunction> CF = new ArrayList<ComplexFunction>();
		 ComplexFunction cf=new ComplexFunction();
		 ComplexFunction cf1= (ComplexFunction) cf.initFromString("+x");
		 CF.add(cf1);
		 ComplexFunction cf2= (ComplexFunction) cf.initFromString("9");
		 CF.add(cf2);
		 ComplexFunction cf3= (ComplexFunction) cf.initFromString("x^2");
		 CF.add(cf3);
		 ComplexFunction cf4= (ComplexFunction) cf.initFromString("x^2+9");

		//checking max and min function
		cf1.comp(cf1);
		if(!cf1.equals(cf3)) {
			fail("ERR: "+cf1.toString()+" should be equals to "+cf3.toString());
		}

		cf3.min(cf1);
		if(!cf3.equals(cf1)) {
			fail("ERR: "+cf1.toString()+" should be the min ");
		}
		
		cf3.plus(cf2);
		if(!cf3.equals(cf4)) {
			fail("ERR: "+cf3.toString()+" should be equals to "+cf4.toString());
		}
		
	}
	
	
	
	
	
	
	
	
	@Test 
	void test() {
		Monom m1 = new Monom(2,2);
		Monom m2 = new Monom(3,3);
		ComplexFunction cf = new ComplexFunction("plus", m1,m2);
		cf.mul(m2);
		System.out.println(cf);
		Polynom p = new Polynom();
		p.add(m1);
		p.add(m2);
		p.multiply(m2);
		double v = 4.0;
		double dp = p.f(v);
		double dcf = cf.f(v);
		double dd = Math.abs(dp-dcf);
		if(dd>EPS) {
			System.out.println(p+" at "+v+" = "+dp);
			System.out.println(cf+" at "+v+" = "+dcf);
			fail("ERR: should got the same value from: "+p+"  and "+cf);
		
		}
	}

		@Test
		void testOfString() {
			Polynom p1 = new Polynom();
			p1.add( new Monom(2,2));
			Polynom p2 = new Polynom();
			p2.add(new Monom(3,3));
			Monom m1 = new Monom(2,2);
			Monom m2 = new Monom(3,3);
			ComplexFunction cf = new ComplexFunction("plus", m1,m2);
			ComplexFunction cf3 = new ComplexFunction("plus", p1,p2);
			cf.mul(m2);
			cf3.mul(m2);
			String s = cf.toString();
			function cf2 = cf.initFromString(s);
			if(!cf.equals(cf2)) {
				fail("ERR: "+cf+" should be equals to "+cf2);
			}
			if(!cf.equals(cf3)) {
				fail("ERR: "+cf+" should be equals to "+cf3);
			}
	}

	@Test
	void testComplexFunction() {
		String s1 = "3.1 +2.4x^2 -x^4";
		String s2 = "5 +2x -3.3x +0.1x^5";
		String[] s3 = {"x -1","x -2", "x -3", "x -4"};
		Polynom p1 = new Polynom(s1);
		Polynom p2 = new Polynom(s2);
		Polynom p3 = new Polynom(s3[0]);
		for(int i=1;i<s3.length;i++) {
			p3.multiply(new Polynom(s3[i]));
		}
		ComplexFunction cf4 = new ComplexFunction("div", new Monom("x"),p3);
		ComplexFunction cf = new ComplexFunction("plus", p1,p2);
		cf.div(p1);
		String s = cf.toString();
		function cf5 = cf4.initFromString(s); //equals to cf
		if(!cf.equals(cf5)) {
			fail("ERR: "+cf+" should be equals to "+cf5);
		}
		int size=10;
		for(int i=0;i<size;i++) {
			double x = Math.random();
			double d = cf.f(x);
			double d5 = cf5.f(x);
			assertEquals(d,d5,EPS);
		}
		System.out.println(cf4);
		System.out.println(cf5);
	}
}
