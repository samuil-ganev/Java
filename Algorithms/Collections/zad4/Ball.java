package Ball;

import java.awt.Color;
import java.util.Random;

class Ball {
        Random r = new Random();
	int x = r.nextInt() % 100;
	int y = r.nextInt() % 100; // Current ball position
	int dx = r.nextInt() % 4; // Increment on ball's x-coordinate
	int dy = r.nextInt() % 4; // Increment on ball's y-coordinate
	int radius = r.nextInt() % 15 + 5; // Ball radius
	Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));

}
