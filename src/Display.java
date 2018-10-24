import java.awt.*;

import javax.swing.*;
public class Display {

	//fonts
	static Font titleF = null;
	static Font quizF = null;
	static Font textF = null;
	
	static int quizCounter; 
	
	static JFrame f = new JFrame("Dogs");
	//static ImageIcon icon = new ImageIcon(null);
	static JPanel colorpnl = new JPanel();
	static Color colr = new Color(160, 187, 229);
	
	public static void def() {
		f.setLayout(new BorderLayout());
		f.setSize(1400, 900);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		colorpnl.setBackground(colr);

		
	}
	public static void title() {
		def();
		JLabel title = new JLabel("Shelter Dogs For You");
		JButton quizButton = new JButton("Take the quiz");
	    JButton mapButton = new JButton("See the map");
		JButton dogsButton = new JButton("See the dogs");
		JButton quitButton = new JButton("Quit");
		f.add(colorpnl);
		f.setVisible(true);
		
	}
	
	public static void quizTitleScreen() {
		
		
	}
	
	public static void quizQuestionScreen() {
		
	}
	
	public static void questionFormat() {
		
	}
	
	public static void quizFinishScreen() {
		
	}
	
	public static void mapScreen() {
		
	}
	
	public static void infoScreen() {
		
	}
	
	public static void quit() {
		
	}
	
	
	public static void clear() {
		System.out.println("cleared");
		f.getContentPane().revalidate();
		f.getContentPane().removeAll();
		f.getContentPane().repaint();
	}
	
	public static void main(String[] args) {
		title();
	}
	
	
}
