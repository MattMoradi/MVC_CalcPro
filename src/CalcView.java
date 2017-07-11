import java.awt.event.ActionListener;
import javax.swing.*;

public class CalcView{
	//Visual Class Library Instantiations For J-Framework
	JFrame jFramework = new JFrame("MVC Calc Pro");
	
	//Visual Class Library Instantiations For Addition Operation
	private JTextField addFirstNumber = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField addSecondNumber = new JTextField(10);
	private JButton calcButt1 = new JButton("Add");
	private JTextField addCalcSolution = new JTextField(10);
	
	//Visual Class Library Instantiations For Subtraction Operation
	private JTextField subFirstNumber = new JTextField(10);
	private JLabel subtractionLabel = new JLabel("-");
	private JTextField subSecondNumber = new JTextField(10);
	private JButton calcButt2 = new JButton("Subtract");
	private JTextField subCalcSolution = new JTextField(10);
	
	//Visual Class Library Instantiations For Multiplication Operation
	private JTextField multFirstNumber = new JTextField(10);
	private JLabel multiplicationLabel = new JLabel("x");
	private JTextField multSecondNumber = new JTextField(10);
	private JButton calcButt3 = new JButton("Multiply");
	private JTextField multCalcSolution = new JTextField(10);
	
	//Visual Class Library Instantiations For Division Operation
	private JTextField divFirstNumber = new JTextField(10);
	private JLabel divisionLabel = new JLabel("÷");
	private JTextField divSecondNumber = new JTextField(10);
	private JButton calcButt4 = new JButton("Divide");
	private JTextField divCalcSolution = new JTextField(10);
	
	//Visual Class Library Instantiations For Copyright Purposes
	private JLabel mCalc = new JLabel
	("Moradi Calculation Standards - © Moradi Quality Software ©");
	
	CalcView(){
	JPanel calcPanel = new JPanel();
	jFramework.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jFramework.setSize(500, 210);
	jFramework.setResizable(false);
	jFramework.setVisible(true);
	
	//calcPannel Additions
	calcPanel.add(addFirstNumber);
	calcPanel.add(additionLabel);
	calcPanel.add(addSecondNumber);
	calcPanel.add(calcButt1);
	calcPanel.add(addCalcSolution);
	
	//calcPannel Subtractions
	calcPanel.add(subFirstNumber);
	calcPanel.add(subtractionLabel);
	calcPanel.add(subSecondNumber);
	calcPanel.add(calcButt2);
	calcPanel.add(subCalcSolution);	
	
	//calcPannel Multiplications
	calcPanel.add(multFirstNumber);
	calcPanel.add(multiplicationLabel);
	calcPanel.add(multSecondNumber);
	calcPanel.add(calcButt3);
	calcPanel.add(multCalcSolution);
	
	//calcPannel Divisions
	calcPanel.add(divFirstNumber);
	calcPanel.add(divisionLabel);
	calcPanel.add(divSecondNumber);
	calcPanel.add(calcButt4);
	calcPanel.add(divCalcSolution);
	
	//calcPannel Moradi Description
	calcPanel.add(mCalc);
	
	jFramework.add(calcPanel);
	}
	
	//Addition Getter/Setter Initialization
	public int getAddFirstNumber(){
		return Integer.parseInt(addFirstNumber.getText());
	}
	
	public int getAddSecondNumber(){
		return Integer.parseInt(addSecondNumber.getText());
	}
	
	public int getAddCalcSolution(){
		return Integer.parseInt(addCalcSolution.getText());
	}
	
	public void setAddCalcSolution(int solution){
		addCalcSolution.setText(Integer.toString(solution));
	}
	
	void addCalculationListener(ActionListener listenForCalcButton1){
		calcButt1.addActionListener(listenForCalcButton1);
	}
	
	//Subtraction Getter/Setter Initialization
	public int getSubFirstNumber(){
		return Integer.parseInt(subFirstNumber.getText());
	}
	
	public int getSubSecondNumber(){
		return Integer.parseInt(subSecondNumber.getText());
	}
	
	public int getSubCalcSolution(){
		return Integer.parseInt(subCalcSolution.getText());
	}
	
	public void setSubCalcSolution(int solution){
		subCalcSolution.setText(Integer.toString(solution));
	}
	
	void subCalculationListener(ActionListener listenForCalcButton2){
		calcButt2.addActionListener(listenForCalcButton2);
	}
	
	//Multiplication Getter/Setter Initialization
	public int getMultFirstNumber(){
		return Integer.parseInt(multFirstNumber.getText());
	}
	
	public int getMultSecondNumber(){
		return Integer.parseInt(multSecondNumber.getText());
	}
	
	public int getMultCalcSolution(){
		return Integer.parseInt(multCalcSolution.getText());
	}
	
	public void setMultCalcSolution(int solution){
		multCalcSolution.setText(Integer.toString(solution));
	}
	
	void multCalculationListener(ActionListener listenForCalcButton3){
		calcButt3.addActionListener(listenForCalcButton3);
	}
	
	//Division Getter/Setter Initialization
	public int getDivFirstNumber(){
		return Integer.parseInt(divFirstNumber.getText());
	}
	
	public int getDivSecondNumber(){
		return Integer.parseInt(divSecondNumber.getText());
	}
	
	public double getDivCalcSolution(){
		return Double.parseDouble(divCalcSolution.getText());
	}
	
	public void setDivCalcSolution(double solution){
		divCalcSolution.setText(Double.toString(solution));
	}
	
	void divCalculationListener(ActionListener listenForCalcButton4){
		calcButt4.addActionListener(listenForCalcButton4);
	}
	
	void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(jFramework, errorMessage);
	}
}
