package Ball;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.Timer;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Math;

import javax.swing.JPanel;

class BallPanel extends JPanel {
	private int delay = 10;
	private ArrayList<Ball> list = new ArrayList<Ball>();
// Create a timer with the initial delay
	protected Timer timer = new Timer(delay, new TimerListener());

	private class TimerListener implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}

	public BallPanel() {
		timer.start();
	}

	public void add() {
		list.add(new Ball());
	}

	public void subtract(int ind) {
		if (list.size() > 0)
			list.remove(ind); // Remove the last ball
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < list.size(); i++) {
			Ball ball = (Ball) list.get(i); // Get a ball
			g.setColor(ball.color); // Set ball color
			// Check boundaries
			if (ball.x < 0 || ball.x > getWidth())
				ball.dx = -ball.dx;
			if (ball.y < 0 || ball.y > getHeight())
				ball.dy = -ball.dy;
			// Adjust ball position
			ball.x += ball.dx;
			ball.y += ball.dy;
			g.fillOval(ball.x - ball.radius, ball.y - ball.radius, ball.radius * 2, ball.radius * 2);

      for (int j=0;j<list.size();++j) {

        if (j == i)
          continue;
        
        Ball ball2 = (Ball) list.get(j);
        double dist = Math.sqrt((ball.x - ball2.x)^2 + (ball.y - ball2.y)^2);

        if (dist + Math.min(ball.radius, ball2.radius) < Math.max(ball.radius, ball2.radius)) {

          if (Math.min(ball.radius, ball2.radius) == ball.radius) {
            subtract(i);
            ball2.radius += ball.radius;
          } else {
            subtract(j);
            ball.radius += ball2.radius;
          }

        }

      }

		}

	}

	public void suspend() {
		timer.stop();
	}

	public void resume() {
		timer.start();
	}

	public void setDelay(int delay) {
		this.delay = delay;
		timer.setDelay(delay);
	}
        
}
