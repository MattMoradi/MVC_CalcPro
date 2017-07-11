public class CalcModel {

	private int calcAddValue;
	
	public void addTwoNumbers(int addFirstNumber, int addSecondNumber){
		calcAddValue = addFirstNumber + addSecondNumber;
	}
	
	public int getCalcAddValue(){
		return calcAddValue;
	}
	
	private int calcSubValue;
	
	public void subTwoNumbers(int subFirstNumber, int subSecondNumber){
		calcSubValue = subFirstNumber - subSecondNumber;
	}
	
	public int getCalcSubValue(){
		return calcSubValue;
	}
	
	private int calcMultValue;
	
	public void multTwoNumbers(int multFirstNumber, int multSecondNumber){
		calcMultValue = multFirstNumber * multSecondNumber;
	}
	
	public int getCalcMultValue(){
		return calcMultValue;
	}
	
	private double calcDivValue;
	
	public void divTwoNumbers(int divFirstNumber, int divSecondNumber){
		calcDivValue = divFirstNumber / divSecondNumber;
	}
	
	public double getCalcDivValue(){
		return calcDivValue;
	}
}
