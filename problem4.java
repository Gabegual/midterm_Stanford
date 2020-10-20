import acm.graphics.*; 
import acm.program.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class problem4 extends GraphicsProgram {
	private static final int SQUARE_SIZE = 75;
	private static final int NROWS = 4;
	private static final int NCOLUMNS = 7;
	private GImage frogger;
	private double fx;
	private double fy;
	public static final int WINDOW_WIDTH = NCOLUMNS * SQUARE_SIZE;
	public static final int WINDOW_HEIGHT = NROWS * SQUARE_SIZE;

	public void run() {
		frogger = new GImage("images.jpg");
		fx = (NCOLUMNS / 2 + 0.5) * SQUARE_SIZE;
		fy = (NROWS - 0.5) * SQUARE_SIZE;
		add(frogger, fx - frogger.getWidth() / 2, fy - frogger.getHeight() / 2);
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		double mx = e.getX();
		double my = e.getY();
		if (Math.abs(mx - fx) > Math.abs(my - fy)) {
			if (mx > fx) {
				move(SQUARE_SIZE, 0);
			} else {
				move(-SQUARE_SIZE, 0);
			}
		} else {
			if (my > fy) {
				move();
			}
		}
	}
}