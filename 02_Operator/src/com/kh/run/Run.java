package com.kh.run;

import com.kh.operator.A_LocalNegation;
import com.kh.operator.B_InDecrease;
import com.kh.operator.C_Arithmetic;
import com.kh.operator.D_Comparison;
import com.kh.operator.E_Logical;
import com.kh.operator.F_Compound;
import com.kh.operator.G_Triple;

public class Run {

	public static void main(String[] args) {
		A_LocalNegation ln = new A_LocalNegation();
		//ln.method1();
		
		B_InDecrease id = new B_InDecrease();
		id.method();
		//id.method2();
		
		C_Arithmetic ari = new C_Arithmetic();
		// ari.method1();
		
		D_Comparison com = new D_Comparison();
		//com.method1();
		
		E_Logical log = new E_Logical();
		//log.method4();
		//log.method4();
		
		F_Compound cop = new F_Compound();
		//cop.method();
		
		G_Triple tri = new G_Triple();
		//tri.method5();
		
	
		
		
		
		
		
		
		

	}

}
