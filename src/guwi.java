import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class guwi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ImageIcon image = new ImageIcon("/BSCS2A/src/logo.jpg");
		
		JLabel label =  new JLabel();
		label.setText("Hi girls my name is: Mark Peter Florentino. "
				+ "Computer Science student from PILIMON :)");
		label.setIcon(image);	
		
		
		JFrame frame = new JFrame();
		frame.setTitle("JOEY NI BOK AKA. HI GIRLS");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(690,690);
		frame.setVisible(true);
		frame.add(label);
	}

}
