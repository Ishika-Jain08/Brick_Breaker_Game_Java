package brickBracker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
	JFrame t = new JFrame();
	Gameplay gameplay = new Gameplay();
	t.setBounds(10,10,700,600);
	t.setTitle("Brick Breaker");
	t.setResizable(false);
	t.setVisible(true);
	t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	t.add(gameplay);

	

	}

}
