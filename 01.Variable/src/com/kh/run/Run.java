package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_Constant;
import com.kh.variable.D_Cast;
import com.kh.variable.E_Overflow;
import com.kh.variable.F_Printf;

public class Run {
	
	
	public static void main(String[] args) {
		A_Variable var = new A_Variable();
		// var.declareVariable();
		// var.initVariable();
		
		B_KeyboardInput kb = new B_KeyboardInput();
		// kb.inputScanner1();
		// kb.inputScanner2();
		// kb.inputScanner3();
		
		C_Constant con = new C_Constant();
		// con.final1Constant();
		
		D_Cast ca = new D_Cast();
		// ca.rule1();
		// ca.rule2();
		// ca.dataLoss();
		
		E_Overflow of = new E_Overflow();
		//of.overflow();
		//of.cale();
		
		F_Printf pf = new F_Printf();
		pf.printfMethod();
		
		
		
	}

}
