package com.rocel.apt.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.rocel.apt.controler.IControler;

public class MainView extends JFrame {
	private static final int MIN_HEIGHT = 500;
	private static final int MIN_WIDTH = 1024;
	private static final long serialVersionUID = 5355088278564875583L;
	private static final String APP_NAME = "Android Project Translater";
	private IControler controler;
	private JPanel contentPane;
	private static final int PADDING = 10;
	private static final int HGAP = 10;
	private static final int VGAP = 10;
	
	public MainView(IControler controler) {
		this.controler = controler;
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 800, 600);
		this.setMinimumSize(new Dimension(MIN_WIDTH,MIN_HEIGHT));
		this.setTitle(APP_NAME);
		this.setBackground(Color.WHITE);
		this.contentPane = getContentPanel();
		this.getContentPane().add(contentPane,BorderLayout.CENTER);
		this.getContentPane().add(new MenuBar(this, controler), BorderLayout.NORTH);
	}

	private JPanel getContentPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(HGAP,VGAP));
		panel.add(new LeftPane(controler),BorderLayout.LINE_START);
		panel.add(new CenterPane(controler),BorderLayout.CENTER);
		panel.setBorder(new EmptyBorder(PADDING, PADDING, PADDING, PADDING));
		
		return panel;
	}

	public void display() {
		this.setVisible(true);
	}
	
	
	
}
