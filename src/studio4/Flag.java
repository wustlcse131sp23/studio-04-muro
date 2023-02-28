package studio4;

import java.awt.Color;
import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {



		StdDraw.setPenColor(Color.BLUE);

		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.3);

		StdDraw.setPenColor(40, 40, 40);
		StdDraw.filledRectangle(0.5, 0.5, 0.1, 0.3);

		StdDraw.setPenColor(255, 204, 51);

		StdDraw.filledRectangle(0.6, 0.5, 0.01, 0.3);
		StdDraw.filledRectangle(0.4, 0.5, 0.01, 0.3);

		StdDraw.setPenRadius(0.02);
		StdDraw.circle(0.5, 0.5, 0.2);

		Font font = new Font("Apple Chancery", Font.ITALIC,100);
		Font fontTwo = new Font("Lucida Handwriting", Font.PLAIN,190);
		Font fontThree = new Font("Apple Chancery", Font.ITALIC, 100);

		StdDraw.setPenColor(255, 204, 51);

		StdDraw.setFont(fontTwo);
		StdDraw.text(0.5, 0.45,"B");

		StdDraw.setPenColor(Color.RED);

		StdDraw.setFont(font);
		StdDraw.text(0.5, 0.7,"Matty");

		StdDraw.setFont(fontThree);
		StdDraw.text(0.5, 0.38,"Raps");

	}
}