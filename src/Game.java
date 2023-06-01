
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game {
	public static int heads = 0;
	public static int tails = 0;
	static String picPathChoose = "_silver.png";
	
	private static int flipCoin() {
		Random random = new Random();
		int choice = random.nextInt(2);
		
		if (choice == 0) {
			return choice;
	}
		else {
			return choice;
		}
	}
	
	public static void flipMultiple(int x) {
		int index = 1;
		while (index <= x) {
			int res = flipCoin();
			if (res == 0) {
				heads++;
				System.out.println("Toss #" + index + ": Heads");
			}
			else {
				System.out.println("Toss #" + index + ": Tails");
				tails++;
			}
			index++;
			
		}
		if (x == 1) {
			if (heads == 1) {
				String pic = "heads";
				showPic(pic);
			}
			else {
				String pic = "tails";
				showPic(pic);
			}
		}
		else {
		System.out.println("Total Heads: " + heads);
		System.out.println("Total Tails: " + tails);

	}
	}
	
	public static void showPic(String pic) {
		JFrame jframe = new JFrame();
		 jframe.setSize(280, 400); 
		 jframe.setTitle("Coin Flip"); 
		 jframe.setLayout(new BorderLayout(10, 10)); 
		 jframe.setResizable(false); 
		 jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		 JLabel coinIMG = new JLabel();
		 String picPath = pic + picPathChoose;
		 ImageIcon icon = new ImageIcon(picPath);
		 coinIMG.setIcon(icon);
		 jframe.add(coinIMG);
		 jframe.setVisible(true);
	}
	public static void secret() {
		System.out.println("You found the easter egg!");
	}
	
	public static void switchCoin() {
		if (picPathChoose.equals("_silver.png")) {
			picPathChoose = "_gold.png";
			System.out.println("Your current coin is gold.");
		}
		else {
			picPathChoose = "_silver.png";
			System.out.println("Your current coin is silver.");
		}
	}
}


	