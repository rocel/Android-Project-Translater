package com.rocel.apt.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.rocel.apt.controler.IControler;

public class LeftPane extends JPanel {
	private static final int PREFERED_WIDTH = 200;
	private static final long serialVersionUID = -6819652200900372195L;
	private static final int HGAP = 10;
	private static final int VGAP = 10;
	private static final int GAP = 5;

	private IControler controler;
	
	public LeftPane( IControler controler) {
		this.controler = controler;
		this.setPreferredSize(new Dimension(PREFERED_WIDTH, this.getHeight()));
		this.setLayout(new BorderLayout(HGAP,VGAP));
//		this.setBorder(new EmptyBorder(HGAP, HGAP, HGAP, HGAP));
		this.add(getViewsList(), BorderLayout.CENTER);
		this.add(getLangPanel(), BorderLayout.NORTH);
	}
	

	public JPanel getLangPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(new JLabel(controler.getLang()), BorderLayout.CENTER);
		panel.add(new JLabel(">"), BorderLayout.LINE_END);	
		panel.setBorder(new EmptyBorder(GAP, GAP, GAP, GAP));
		panel.setBackground(Color.WHITE);
		return panel;
	}

	public JPanel getViewsList() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.WHITE);
		panel.add(new JLabel("LIST DES VUES"));
		return panel;
	}

}
