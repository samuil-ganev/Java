import java.awt.*;
import javax.swing.JFrame;

public class App {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.add(new TicTacToe());
		frame.setTitle("TicTacToe");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
