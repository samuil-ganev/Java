import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.JPanel;

public class TicTacToe extends JPanel {

	private boolean xOnTurn = true;
	private char[][] board = { {' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '} };
	
	double boardMarginRatio = 0.1;
	double elementMarginRatio = 0.2;
	
	int upBoardBorder, downBoardBorder, leftBoardBorder, rightBoardBorder, squareWidth, squareHeight;
	
	public TicTacToe() {
		
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				int x = e.getX();
				int y = e.getY();
				
				for (int i = 0; i < 3; ++i) {
					
					for (int j = 0; j < 3; ++j) {
						
						if (board[i][j] == ' '
								&& x >leftBorder(j) && x < rightBorder(j)
								&& y < downBorder(i) && y > upBorder(i)) {
							
							board[i][j] = xOnTurn ? 'x' : 'o';
							xOnTurn = !xOnTurn;
							repaint();
										
						}
						
					}
					
				}
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {}
			
		});
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		drawBoard(g);
		
	}
	
	private void drawBoard(Graphics g) {
		
		upBoardBorder = (int)(boardMarginRatio * getHeight());
		downBoardBorder = (int)(getHeight() - boardMarginRatio * getHeight());		
		leftBoardBorder = (int)(boardMarginRatio * getWidth());
		rightBoardBorder = (int)(getWidth() - boardMarginRatio * getHeight());	
		squareWidth = (int)((getWidth() - 2 * boardMarginRatio * getWidth()) / 3);
		squareHeight = (int)((getHeight() - 2 * boardMarginRatio * getHeight()) / 3);
		
		for (int i = 1; i < 3; ++i) {
			
			g.drawLine(leftBoardBorder, upBorder(i), rightBoardBorder, upBorder(i));
			
			g.drawLine(leftBorder(i), upBoardBorder, leftBorder(i), downBoardBorder);
			
		}
		
		for (int i = 0; i < 3; ++i) {
			
			for (int j = 0; j < 3; ++j) {
				
				if (board[i][j] == 'x') {
					
					g.drawLine((int)(leftBorder(j) + elementMarginRatio * squareWidth),
							(int)(upBorder(i) + elementMarginRatio * squareHeight),
							(int)(rightBorder(j) - elementMarginRatio * squareWidth),
							(int)(downBorder(i) - elementMarginRatio * squareHeight));
					
					g.drawLine((int)(rightBorder(j) - elementMarginRatio * squareWidth),
							(int)(upBorder(i) + elementMarginRatio * squareHeight),
							(int)(leftBorder(j) + elementMarginRatio * squareWidth),
							(int)(downBorder(i) - elementMarginRatio * squareHeight));
					
				} else if (board[i][j] == 'o') {
					
					g.drawOval((int)(leftBorder(j) + elementMarginRatio * squareWidth),
							(int)(upBorder(i) + elementMarginRatio * squareHeight),
							(int)(squareWidth - 2 * elementMarginRatio * squareWidth),
							(int)(squareWidth - 2 * elementMarginRatio * squareHeight));
					
				}
				
			}
			
		}
		
	}
	
	private int leftBorder(int j) {
		
		return j * squareWidth + leftBoardBorder;
		
	}
	
	private int rightBorder(int j) {
		
		return (j + 1) * squareWidth + leftBoardBorder;
		
	}
	
	private int upBorder(int i) {
		
		return i * squareHeight + upBoardBorder;
		
	}
	
	private int downBorder(int i) {
		
		return (i + 1) * squareHeight + upBoardBorder;
		
	}
	
}
