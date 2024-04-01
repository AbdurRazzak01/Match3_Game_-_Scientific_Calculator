
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;



class Connect6 implements ActionListener {
	JFrame frame;
	
	
	JButton button1, button2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23,
			btn24;


	int[] colour = new int[24];

	Connect6() {
		frame = new JFrame("Match 3");
		
		
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(50, 50, 450, 600);
		frame.setResizable(false);

		button1 = new JButton();
		button2 = new JButton();
		btn3 = new JButton();
		btn4 = new JButton();
		btn5 = new JButton();
		btn6 = new JButton();
		btn7 = new JButton();
		btn8 = new JButton();
		btn9 = new JButton();
		btn10 = new JButton();
		btn11 = new JButton();
		btn12 = new JButton();
		btn13 = new JButton();
		btn14 = new JButton();
		btn15 = new JButton();
		btn16 = new JButton();
		btn17 = new JButton();
		btn18 = new JButton();
		btn19 = new JButton();
		btn20 = new JButton();
		btn21 = new JButton();
		btn22 = new JButton();
		btn23 = new JButton();
		btn24 = new JButton();


		button1.setBounds(70, 90, 70, 50);
		button2.setBounds(140, 90, 70, 50);
		btn3.setBounds(210, 90, 70, 50);
		btn4.setBounds(280, 90, 70, 50);

		btn5.setBounds(70, 140, 70, 50);
		btn6.setBounds(140, 140, 70, 50);
		btn7.setBounds(210, 140, 70, 50);
		btn8.setBounds(280, 140, 70, 50);

		btn9.setBounds(70, 190, 70, 50);
		btn10.setBounds(140, 190, 70, 50);
		btn11.setBounds(210, 190, 70, 50);
		btn12.setBounds(280, 190, 70, 50);

		btn13.setBounds(70, 240, 70, 50);
		btn14.setBounds(140, 240, 70, 50);
		btn15.setBounds(210, 240, 70, 50);
		btn16.setBounds(280, 240, 70, 50);

		btn17.setBounds(70, 290, 70, 50);
		btn18.setBounds(140, 290, 70, 50);
		btn19.setBounds(210, 290, 70, 50);
		btn20.setBounds(280, 290, 70, 50);

		btn21.setBounds(70, 340, 70, 50);
		btn22.setBounds(140, 340, 70, 50);
		btn23.setBounds(210, 340, 70, 50);
		btn24.setBounds(280, 340, 70, 50);

		

		
	
		Random ran = new Random();

		Arrays.fill(colour, -1);
		int i = 0;
		while (i < 8) {
			int non1 = ran.nextInt(0, 24);
			System.out.println(non1);
			if (colour[non1] != -1) {
				while (colour[non1] != -1) {
					non1 = ran.nextInt(0, 24);
				}
			}
			colour[non1] = i;
			int non2 = ran.nextInt(0, 24);
			if (colour[non2] != -1) {
				while (colour[non2] != -1) {
					non2 = ran.nextInt(0, 24);
				}
			}
			colour[non2] = i;
			int non3 = ran.nextInt(0, 24);
			if (colour[non3] != -1) {
				while (colour[non3] != -1) {
					non3 = ran.nextInt(0, 24);
				}
			}
			colour[non3] = i;
			i++;
		}

		button1.addActionListener(this);
		button2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn10.addActionListener(this);
		btn11.addActionListener(this);
		btn12.addActionListener(this);
		btn13.addActionListener(this);
		btn14.addActionListener(this);
		btn15.addActionListener(this);
		btn16.addActionListener(this);
		btn17.addActionListener(this);
		btn18.addActionListener(this);
		btn19.addActionListener(this);
		btn20.addActionListener(this);
		btn21.addActionListener(this);
		btn22.addActionListener(this);
		btn23.addActionListener(this);
		btn24.addActionListener(this);


		
		frame.add(button1);
		frame.add(button2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.add(btn7);
		frame.add(btn8);
		frame.add(btn9);
		frame.add(btn10);
		frame.add(btn11);
		frame.add(btn12);
		frame.add(btn13);
		frame.add(btn14);
		frame.add(btn15);
		frame.add(btn16);
		frame.add(btn17);
		frame.add(btn18);
		frame.add(btn19);
		frame.add(btn20);
		frame.add(btn21);
		frame.add(btn22);
		frame.add(btn23);
		frame.add(btn24);


	}

	public static void main(String[] args) {
		new Connect6();
	}

	
	//int priviousnum = 0; 
	//int currentnum = 0; 
	//int counter = 0;
	

	public void setColor(JButton btn, int index) {
		Color colorArr[] = new Color[] { Color.GRAY, Color.GREEN, Color.BLUE, Color.YELLOW, Color.CYAN, Color.RED,
				Color.ORANGE, Color.PINK };
		for (int i = 0; i < 8; i++) {
			if (index == i) {
				btn.setBackground(colorArr[i]);
				btn.setText("" + index);
			//	if (priviousnum == 0) {
				//	priviousnum = index;
					
				} //else if (priviousnum == index) {
					//counter++;
				} 
				//	priviousnum = index;
					//counter = 0;
				//}
			//}
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		

		if (e.getSource() == button1) {

			setColor(button1, colour[0]);
		} else if (e.getSource() == button2) {
			setColor(button2, colour[1]);
		} else if (e.getSource() == btn3) {
			setColor(btn3, colour[2]);
		} else if (e.getSource() == btn4) {
			setColor(btn4, colour[3]);
		} else if (e.getSource() == btn5) {
			setColor(btn5, colour[4]);
		} else if (e.getSource() == btn6) {
			setColor(btn6, colour[5]);
		} else if (e.getSource() == btn7) {
			setColor(btn7, colour[6]);
		} else if (e.getSource() == btn8) {
			setColor(btn8, colour[7]);
		} else if (e.getSource() == btn9) {
			setColor(btn9, colour[8]);
		} else if (e.getSource() == btn10) {
			setColor(btn10, colour[9]);
		} else if (e.getSource() == btn11) {
			setColor(btn11, colour[10]);
		} else if (e.getSource() == btn12) {
			setColor(btn12, colour[11]);
		} else if (e.getSource() == btn13) {
			setColor(btn13, colour[12]);
		} else if (e.getSource() == btn14) {
			setColor(btn14, colour[13]);
		} else if (e.getSource() == btn15) {
			setColor(btn15, colour[14]);
		} else if (e.getSource() == btn16) {
			setColor(btn16, colour[15]);
		} else if(e.getSource() == btn17) {
			setColor(btn17, colour[16]);
		} else if (e.getSource() == btn18) {
			setColor(btn18, colour[17]);
		} else if (e.getSource() == btn19) {
			setColor(btn19, colour[18]);
		} else if (e.getSource() == btn20) {
			setColor(btn20, colour[19]);
		} else if (e.getSource() == btn21) {
			setColor(btn21, colour[20]);
		} else if (e.getSource() == btn22) {
			setColor(btn22, colour[21]);
		} else if (e.getSource() == btn23) {
			setColor(btn23, colour[22]);
		} else if (e.getSource() == btn24) {
			setColor(btn24, colour[23]);
		}  

		

	}
}