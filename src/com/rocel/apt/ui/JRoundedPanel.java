package com.rocel.apt.ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JRoundedPanel extends JPanel {
	private static final long serialVersionUID = -4643389976297325684L;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.fillRoundRect(100, 100, 500, 500, 30, 30); 
	}
}
