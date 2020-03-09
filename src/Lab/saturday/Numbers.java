package Lab.saturday;
/*
Calculates the arithmetic operations
SaturdayLab1: Data types. Variables. Constants.
Problem 3
Save file as Numbers.java 
 -- arithmetic operations with int and double operands (i.e. variables)
 -- mixed addition
 -- integer division. double division. mixed division
 */
public class Numbers {

	public static void main(String[] args) {
		
		//declare variable of type int
		int iNumOne, iNumTwo, iResult;
		
		//declare variable of type double
		double dNumOne, dNumTwo, dResult;
		
		//assign/store
		iNumOne = 5;
		iNumTwo = 2;
		
		dNumOne = 10.0;
		dNumTwo = 11.5;
		
		//addition task
//		iResult = iNumOne + (int) dNumTwo;
//		dResult = dNumTwo + iNumOne;
		
		//multiplication task
//		iResult = iNumOne * (int) dNumOne;
//		dResult = iNumTwo * dNumTwo;
		
		//devision task
//		iResult = (int) dNumOne / iNumTwo;
//		dResult = dNumTwo / iNumTwo;
		
		//subtraction task
		iResult = (int) dNumOne - iNumOne;
		dResult = dNumTwo - iNumTwo;
		
		String intRes = "int result: ";
		String dRes = "double result: ";
		
		System.out.println(intRes + iResult);
		System.out.println(dRes + dResult);
	}

}
