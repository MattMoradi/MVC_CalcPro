import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController {

	private CalcView calcView;
	private CalcModel calcModel;
	
	String myProblem = "User must enter 2 integers.";
	
	public CalcController(CalcView calcView, CalcModel calcModel){
		
		this.calcView = calcView;
		this.calcModel = calcModel;
		
		this.calcView.addCalculationListener(new CalculateListener1());
		this.calcView.subCalculationListener(new CalculateListener2());
		this.calcView.multCalculationListener(new CalculateListener3());
		this.calcView.divCalculationListener(new CalculateListener4());
	}
	
	class CalculateListener1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0){
			int firstNumber, secondNumber = 0;
			
			try{
				firstNumber = calcView.getAddFirstNumber();
				secondNumber = calcView.getAddSecondNumber();
				
				calcModel.addTwoNumbers(firstNumber, secondNumber);
				calcView.setAddCalcSolution(calcModel.getCalcAddValue());
			}
			catch(NumberFormatException ex){
				calcView.displayErrorMessage(myProblem);
			}
		}
			
	}
	
	class CalculateListener2 implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent arg0){
			int firstNumber, secondNumber = 0;
			
			try{
				firstNumber = calcView.getSubFirstNumber();
				secondNumber = calcView.getSubSecondNumber();
				
				calcModel.subTwoNumbers(firstNumber, secondNumber);
				calcView.setSubCalcSolution(calcModel.getCalcSubValue());
			}
			catch(NumberFormatException ex){
				calcView.displayErrorMessage(myProblem);
			}
		}
	}
	
	class CalculateListener3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0){
			int firstNumber, secondNumber = 0;
		
			try{
				firstNumber = calcView.getMultFirstNumber();
				secondNumber = calcView.getMultSecondNumber();
			
				calcModel.multTwoNumbers(firstNumber, secondNumber);
				calcView.setMultCalcSolution(calcModel.getCalcMultValue());
			}
			catch(NumberFormatException ex){
				calcView.displayErrorMessage(myProblem);
			}
		}
	}
	
	class CalculateListener4 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0){
			int firstNumber, secondNumber = 0;
			
			try{
				firstNumber = calcView.getDivFirstNumber();
				secondNumber = calcView.getDivSecondNumber();
				
				calcModel.divTwoNumbers(firstNumber, secondNumber);
				calcView.setDivCalcSolution(calcModel.getCalcDivValue());
			}
			
			catch(NumberFormatException ex){
				calcView.displayErrorMessage(myProblem);
			}
		}
	}
}
