public class MVCmain {
	public static void main(String[] args) {
		CalcView calcView = new CalcView();
		CalcModel calcModel = new CalcModel();
		CalcController calcController = new CalcController(calcView, calcModel);
		
		//calcView.setVisible(true);
	}
}
