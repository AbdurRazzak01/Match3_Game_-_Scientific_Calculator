import javax.swing.*;
import java.awt.event.*;

public class ScientificCalculator extends JFrame implements ActionListener {

	//Fields
	JPanel panel1;

	JButton button0;
	JButton buttonDec;
	JButton buttonPlus;
		
	JButton button1;
	JButton button2;
	JButton button3;
	JButton minusButton;
	
	JButton button4;
	JButton button5;
	JButton button6;
	JButton multiplyButton;
		
	JButton button7;
	JButton button8;
	JButton button9;
	JButton divideButton;
		
	JButton Equalbtn;
	JButton Clearbtn;
   // -----------------------------
	JButton buttonsin;
	JButton buttoncos;
	JButton tanButton;
	
	JButton ButtonLog;
	JButton facbtn;
	JButton squareButton;
	JButton SquareRoot;
	JButton cubeButton;
	JButton PIeButton;
	
	JButton mybuttonfirstbracket;
	JButton mybuttonlastbracket;
	
	JButton mybuttonpower;
	
	JButton mybuttonpercentage;
  //-------------------------------	
	JTextField mytext1;
	JTextField mytext2;

	
	double num = 0.0, result = 0.0;
	double a;
	
	boolean firstEntry = true, firstperiod=false;
	String lastOperation = "";
	
	//constructor
	public ScientificCalculator()
	{
		panel1 = new JPanel();
		panel1.setLayout(null);
		//-------------------------------------
		
		button0 = new JButton("0");
		button0.setBounds(15, 250, 95, 45);
		
		buttonDec = new JButton(".");
		buttonDec.setBounds(115, 250, 45, 45);
		
		buttonPlus = new JButton("+");
		buttonPlus.setBounds(165, 250, 45, 45);
		//-------------------------------------
		button1 = new JButton("1");
		button1.setBounds(15, 200, 45, 45);
		
		button2 = new JButton("2");
		button2.setBounds(65, 200, 45, 45);
		
		button3 = new JButton("3");
		button3.setBounds(115, 200, 45, 45);
		
		minusButton = new JButton("-");
		minusButton.setBounds(165, 200, 45, 45);
		//-------------------------------------		
		button4 = new JButton("4");
		button4.setBounds(15, 150, 45, 45);
		
		button5 = new JButton("5");
		button5.setBounds(65, 150, 45, 45);

		button6 = new JButton("6");
		button6.setBounds(115, 150, 45, 45);
		
		multiplyButton = new JButton("*");
		multiplyButton.setBounds(165, 150, 45, 45);
		//-------------------------------------
		button7 = new JButton("7");
		button7.setBounds(15, 100, 45, 45);
		
		button8 = new JButton("8");
		button8.setBounds(65, 100, 45, 45);

		button9 = new JButton("9");
		button9.setBounds(115, 100, 45, 45);
		
		divideButton = new JButton("/");
		divideButton.setBounds(165, 100, 45, 45);
		//-------------------------------------
		Equalbtn = new JButton("=");
		Equalbtn.setBounds(15, 55, 95, 40);
		
		Clearbtn = new JButton("AC");
		Clearbtn.setBounds(115, 55, 95, 40);
		//-------------------------------------
		buttonsin = new JButton("Sin");
		buttonsin.setBounds(280, 55, 60, 40); 
		
		buttoncos = new JButton("Cos");
		buttoncos.setBounds(265, 100, 60, 40);
		
		tanButton= new JButton("Tan");
		tanButton.setBounds(215, 200, 60, 40);
		
		ButtonLog= new JButton("Log");
		ButtonLog.setBounds(215, 250, 60, 40);
		
		facbtn= new JButton("n!");
		facbtn.setBounds(215, 55, 60, 40);
		
		squareButton= new JButton("x^2");
		squareButton.setBounds(215, 150, 60, 40);
		
		SquareRoot= new JButton("\u221A");
		SquareRoot.setBounds(280, 150, 60, 40);
		
		cubeButton= new JButton("\u221B");
		cubeButton.setBounds(280, 200, 60, 40);
		
		PIeButton= new JButton("\u03c0");
		PIeButton.setBounds(280, 250, 60, 40);
		
		mybuttonfirstbracket = new JButton("(");
		mybuttonfirstbracket.setBounds(345, 55, 45, 40);
		mybuttonlastbracket = new JButton(")");
		mybuttonlastbracket.setBounds(330, 100, 45, 40);
		mybuttonpower = new JButton("x^y");
		mybuttonpower.setBounds(345, 150, 60, 40);
		
		mybuttonpercentage = new JButton("%");
		mybuttonpercentage.setBounds(215, 100, 45, 40);
		//-------------------------------------
		mytext1 = new JTextField(20);
		mytext1.setText("0.0");
		mytext1.setBounds(15, 5, 320, 25);
		mytext2 = new JTextField(20);
		mytext2.setText("");
		mytext2.setBounds(15, 27, 320, 25);
		
		//-------------------------------------
		//-------------------------------------
		add(panel1);
		panel1.add(button0);
		panel1.add(buttonDec);
		panel1.add(buttonPlus);
		
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(minusButton);
				
		panel1.add(button4);
		panel1.add(button5);
		panel1.add(button6);
		panel1.add(multiplyButton);
		
		panel1.add(button7);
		panel1.add(button8);
		panel1.add(button9);
		panel1.add(divideButton);
		
		panel1.add(Equalbtn);
		panel1.add(Clearbtn);
		
		panel1.add(buttonsin);
		panel1.add(buttoncos);
		panel1.add(tanButton);
		panel1.add(ButtonLog);
		panel1.add(facbtn);
		panel1.add(squareButton);
		panel1.add(SquareRoot);
		panel1.add(cubeButton);
		panel1.add(PIeButton);
		panel1.add(mybuttonfirstbracket);
		panel1.add(mybuttonlastbracket);
		panel1.add(mybuttonpower);
		panel1.add(mybuttonpercentage);
		
		panel1.add(mytext1);
		panel1.add(mytext2);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		buttonDec.addActionListener(this);
		
		buttonPlus.addActionListener(this);
		minusButton.addActionListener(this);
		multiplyButton.addActionListener(this);
		divideButton.addActionListener(this);
		
		Equalbtn.addActionListener(this);
		Clearbtn.addActionListener(this);
		
        buttonsin.addActionListener(this);
        buttoncos.addActionListener(this);
        tanButton.addActionListener(this);
        ButtonLog.addActionListener(this);
        facbtn.addActionListener(this);
        squareButton.addActionListener(this);
        SquareRoot.addActionListener(this);
        cubeButton.addActionListener(this);
        PIeButton.addActionListener(this);
        mybuttonfirstbracket.addActionListener(this);
        mybuttonlastbracket.addActionListener(this);
        mybuttonpower.addActionListener(this);
		mybuttonpercentage.addActionListener(this);
			
	}
	
	//methods
	public static void main(String[] args) {
		
		JFrame Calculator = new ScientificCalculator();
		
		Calculator.setTitle("Calculator");
		Calculator.setSize(500, 400);
		Calculator.setLocation(20, 200);
		Calculator.setVisible(true);
		Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==button0)
		{
			if (firstEntry == true)
			{
				mytext1.setText("0");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "0");
		}
		else if (e.getSource()==button1)
		{
			if (firstEntry == true)
			{
				mytext1.setText("1");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "1");
		}
		else if (e.getSource()==button2)
		{
			if (firstEntry == true)
			{
				mytext1.setText("2");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "2");
		}
		else if (e.getSource()==button3)
		{
			if (firstEntry == true)
			{
				mytext1.setText("3");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "3");
		}
		else if (e.getSource()==button4)
		{
			if (firstEntry == true)
			{
				mytext1.setText("4");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "4");
		}
		else if (e.getSource()==button5)
		{
			if (firstEntry == true)
			{
				mytext1.setText("5");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "5");
		}
		else if (e.getSource()==button6)
		{
			if (firstEntry == true)
			{
				mytext1.setText("6");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "6");
		}
		else if (e.getSource()==button7)
		{
			if (firstEntry == true)
			{
				mytext1.setText("7");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "7");
		}
		else if (e.getSource()==button8)
		{
			if (firstEntry == true)
			{
				mytext1.setText("8");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "8");
		}
		else if (e.getSource()==button9)
		{
			if (firstEntry == true)
			{
				mytext1.setText("9");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "9");
		}
		//////////////////////////////////////////////////
		else if (e.getSource()==buttonDec)
		{
			if (firstperiod == false)
			{
				mytext1.setText(mytext1.getText() + ".");
				firstperiod = true;
			}
		}
		//////////////////////////////////////////////////		
		//Arithmetic Operations
		else if (e.getSource()==buttonPlus)
		{
			if (lastOperation.equalsIgnoreCase("+"))
			{
				num = num + Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "+";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("-"))
			{
				num = num - Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "+";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("*"))
			{
				num = num * Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "+";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("/"))
			{
				num = num / Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "+";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("%"))
			{
				num = (num * Double.parseDouble(mytext1.getText()))/100;
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "+";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("x^y"))
			{
				double a = Math.log(Double.parseDouble(mytext1.getText()));
				num =(num)*(Math.E)*(a) ;
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "x^y";
				firstperiod = false;
			}
			else 
			{
				num = Double.parseDouble(mytext1.getText());	
				mytext1.setText("");
				lastOperation = "+";
				firstperiod = false;
			}
		}
		else if (e.getSource()==minusButton)
		{
			if (lastOperation.equalsIgnoreCase("+"))
			{
				num = num + Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "-";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("-"))
			{
				num = num - Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "-";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("*"))
			{
				num = num * Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "-";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("/"))
			{
				num = num / Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "-";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("%"))
			{
				num = (num * Double.parseDouble(mytext1.getText()))/100;
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "-";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("x^y"))
			{
				double a = Math.log(Double.parseDouble(mytext1.getText()));
				num =(num)*(Math.E)*(a) ;
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "x^y";
				firstperiod = false;
			}
			else 
			{
				num = Double.parseDouble(mytext1.getText());	
				mytext1.setText("");
				lastOperation = "-";
				firstperiod = false;
			}
		}
		else if (e.getSource()==multiplyButton)
		{				
			if (lastOperation.equalsIgnoreCase("+"))
			{
				num = num + Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "*";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("-"))
			{
				num = num - Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "*";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("*"))
			{
				num = num * Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "*";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("/"))
			{
				num = num / Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "*";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("%"))
			{
				num = (num * Double.parseDouble(mytext1.getText()))/100;
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "*";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("x^y"))
			{
				double a = Math.log(Double.parseDouble(mytext1.getText()));
				num =(num)*(Math.E)*(a) ;
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "x^y";
				firstperiod = false;
			}
			else 
			{
				num = Double.parseDouble(mytext1.getText());	
				mytext1.setText("");
				lastOperation = "*";
				firstperiod = false;
			}
		}
		else if (e.getSource()==divideButton)
		{
			if (lastOperation.equalsIgnoreCase("+"))
			{
				num = num + Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "/";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("-"))
			{
				num = num - Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "/";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("*"))
			{
				num = num * Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "/";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("/"))
			{
				num = num / Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "/";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("%"))
			{
				num = (num * Double.parseDouble(mytext1.getText()))/100;
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "/";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("x^y"))
			{
				double a = Math.log(Double.parseDouble(mytext1.getText()));
				num =(num)*(Math.E)*(a) ;
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "x^y";
				firstperiod = false;
			}
			else 
			{
				num = Double.parseDouble(mytext1.getText());	
				mytext1.setText("");
				lastOperation = "/";
				firstperiod = false;
			}
		}
		else if (e.getSource()==mybuttonpercentage)
		{				
			if (lastOperation.equalsIgnoreCase("+"))
			{
				num = num + Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "%";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("-"))
			{
				num = num - Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "%";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("*"))
			{
				num = num * Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "%";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("/"))
			{
				num = num / Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "%";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("%"))
			{
				num = (num * Double.parseDouble(mytext1.getText()))/100;
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "%";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("x^y"))
			{
				double a = Math.log(Double.parseDouble(mytext1.getText()));
				num =(num)*(Math.E)*(a) ;
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "x^y";
				firstperiod = false;
			}
			else 
			{
				num = Double.parseDouble(mytext1.getText());	
				mytext1.setText("");
				lastOperation = "%";
				firstperiod = false;
			}
		}
		
		else if (e.getSource()==buttonsin) {
			double sin = Math.sin(Double.parseDouble(mytext1.getText()));
			mytext1.setText(""); 
			mytext2.setText(" "+sin);
			firstperiod = false;
			}
		else if (e.getSource()==buttoncos) {
			double cos = Math.cos(Double.parseDouble(mytext1.getText()));
			mytext1.setText(""); 
			mytext2.setText(" "+cos);
			firstperiod = false;
			}
		else if (e.getSource()==tanButton) {
			double a = Math.tan(Double.parseDouble(mytext1.getText()));
			mytext1.setText(""); 
			mytext2.setText(" "+a);
			firstperiod = false;
			}
		else if (e.getSource()==ButtonLog) {
			double log = Math.log10(Double.parseDouble(mytext1.getText()));
			mytext1.setText(""); 
			mytext2.setText(" "+log);
			firstperiod = false;
			}
		else if (e.getSource()==facbtn) {
			double x =(Double.parseDouble(mytext1.getText()));
			double factorial = 1;
			while(x!=0) {
				factorial = factorial *x;
				x--;
				firstperiod = false;
			}
			mytext1.setText(""); 
			mytext2.setText(" "+factorial);
			}
		else if (e.getSource()==squareButton) {
			double a =(Double.parseDouble(mytext1.getText()));
			a=a*a;
			mytext1.setText(""); 
			mytext2.setText(mytext1.getText()+a);
			firstperiod = false;
			}
		else if (e.getSource()==SquareRoot) {
			double a = Math.sqrt(Double.parseDouble(mytext1.getText()));
			mytext1.setText(""); 
			mytext2.setText(" "+a);
			firstperiod = false;
			}
		else if (e.getSource()==cubeButton) {
			double a = Math.cbrt(Double.parseDouble(mytext1.getText()));
			mytext1.setText(""); 
			mytext2.setText(" "+a);
			firstperiod = false;
			}
		else if (e.getSource()==PIeButton) {
			double a = Math.PI;
			mytext1.setText(""); 
			mytext2.setText(" "+a);
			firstperiod = false;
		}	
else if (e.getSource()==mybuttonpower) {
			if (lastOperation.equalsIgnoreCase("+"))
			{
				num = num + Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "x^y";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("-"))
			{
				num = num - Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "x^y";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("*"))
			{
				num = num * Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "x^y";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("/"))
			{
				num = num / Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "x^y";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("%"))
			{
				num = (num * Double.parseDouble(mytext1.getText()))/100;
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "x^y";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("x^y"))
			{
				a = Math.log(Double.parseDouble(mytext1.getText()));
				num =(num)*(Math.E)*(a) ;
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "x^y";
				firstperiod = false;
			}
			else 
			{
				num = Double.parseDouble(mytext1.getText());	
				mytext1.setText("");
				lastOperation = "x^y";
				firstperiod = false;
			}
			}
		           
		else if (e.getSource()==Equalbtn)
		{
			if (lastOperation.equals("+"))
				mytext2.setText(String.valueOf(num+Double.parseDouble(mytext1.getText())));
			else if (lastOperation.equals("-"))
				mytext2.setText(String.valueOf(num-Double.parseDouble(mytext1.getText())));
			else if (lastOperation.equals("*"))
				mytext2.setText(String.valueOf(num*Double.parseDouble(mytext1.getText())));
			else if (lastOperation.equals("/"))
				mytext2.setText(String.valueOf(num/Double.parseDouble(mytext1.getText())));
			else if (lastOperation.equals("%"))
				mytext2.setText(String.valueOf((num * Double.parseDouble(mytext1.getText()))/100));
			else if (lastOperation.equals("x^y"))
				mytext2.setText(String.valueOf(Math.pow(num,a)));
			
			firstEntry = true;
			firstperiod = false;
			result = 0;
		}
		else if (e.getSource()==Clearbtn)
		{
			mytext1.setText("0.0");
			mytext2.setText("");
			firstEntry = true;
			firstperiod = false;
			lastOperation="";
			result = 0;
			num = 0.0; 
		
		}
			
		
		 
	   
	}

	

}





