package com.rocel.apt.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.rocel.apt.controler.IControler;

public class CenterPane extends JPanel {
	private static final String NEXT = "Next";
	private static final long serialVersionUID = -6819652200900372195L;
	private static final int PREFERED_WIDTH_PREVIEW = 480;
	private static final int PREFERED_HEIGHT = 100;
	private static final int HGAP = 10;
	private static final int VGAP = 10;
	private static final int GAP = 5;
	private IControler controler;
	private JTextField inputField;
	private JButton nextButton;

	public CenterPane(IControler controler) {
		this.controler = controler;
		this.setLayout(new BorderLayout(HGAP,VGAP));
//		this.setBorder(new EmptyBorder(HGAP, HGAP, HGAP, HGAP));
		this.add(getPreview(), BorderLayout.LINE_START);
		this.add(getTranslationPanel(), BorderLayout.CENTER);
	}

	private JPanel getTranslationPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(0, VGAP));
		panel.setBorder(new EmptyBorder(HGAP, HGAP, HGAP, HGAP));
		panel.setBackground(Color.WHITE);
		panel.add(getTranslationTop(), BorderLayout.NORTH);
		panel.add(getPropositions(), BorderLayout.CENTER);
		return panel;
	}
	
	private JPanel getTranslationTop() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 0, HGAP, VGAP));
		panel.add(getWordToTranslate());
		panel.add(getTranslation());
		this.setPreferredSize(new Dimension(PREFERED_HEIGHT, panel.getHeight()));
		panel.setBackground(Color.WHITE);
		return panel;
	}

	private JPanel getPreview() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBackground(Color.WHITE);
		panel.setBorder(new EmptyBorder(HGAP, HGAP, HGAP, HGAP));
		panel.setPreferredSize(new Dimension(PREFERED_WIDTH_PREVIEW, this.getHeight()));
		JPanel preview = new JPanel();
		preview.setBackground(new Color(230,230,230));
		panel.add(preview, BorderLayout.CENTER);
		return panel;
	}
	
	private JPanel getWordToTranslate() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.RED);
		JComboBox<String> list = new JComboBox<String>(this.controler.getWordsToTranslate());
		panel.add(list, BorderLayout.CENTER);
		return panel;
	}

	private JPanel getTranslation() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.BLUE);
		inputField = new JTextField();
		nextButton = new JButton(NEXT);
		panel.add(inputField,BorderLayout.CENTER);
		panel.add(nextButton,BorderLayout.EAST);
		return panel;
	}
	
	private JPanel getPropositions() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		
		return panel;
	}
	
}
