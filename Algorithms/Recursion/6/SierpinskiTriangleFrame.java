package schl;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SierpinskiTriangleFrame extends JFrame {
	static int r = 0, gr = 0, b = 255;

	private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel();

	public SierpinskiTriangleFrame() {
  
		JPanel panel = new JPanel();
		getContentPane().add(trianglePanel);
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnMin = new JButton("-");
		panel.add(btnMin);
		
		JButton btnPlus = new JButton("+");
		panel.add(btnPlus);
		btnMin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				trianglePanel.setOrder(trianglePanel.getOrder()-1);
			}
		});
		btnPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				trianglePanel.setOrder(trianglePanel.getOrder()+1);
			}
		});

	}

}
