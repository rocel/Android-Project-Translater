package com.rocel.apt.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;

import com.rocel.apt.controler.IControler;

public class CenterPane extends JPanel {
	private static final long serialVersionUID = -6819652200900372195L;
	private static final int PREFERED_WIDTH_PREVIEW = 480;
	private static final int PREFERED_HEIGHT = 100;
	private static final int HGAP = 10;
	private static final int VGAP = 10;
	private static final int GAP = 5;
	private IControler controler;

	public CenterPane(IControler controler) {
		this.controler = controler;
		this.setBackground(Color.GREEN);
		this.setLayout(new BorderLayout(HGAP,VGAP));
//		this.setBorder(new EmptyBorder(HGAP, HGAP, HGAP, HGAP));
		this.add(getPreview(), BorderLayout.LINE_START);
		this.add(getTranslationPanel(), BorderLayout.CENTER);
	}

	private JPanel getTranslationPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(0, VGAP));
		panel.add(getTranslationTop(), BorderLayout.NORTH);
		panel.add(getPropositions(), BorderLayout.CENTER);
		return panel;
	}
	
	private JPanel getTranslationTop() {
		JPanel panel = new JPanel();
		panel.add(getWordToTranslate());
		panel.add(getTranslation());
		this.setPreferredSize(new Dimension(PREFERED_HEIGHT, panel.getHeight()));
		panel.setBackground(Color.WHITE);
		return panel;
	}

	private JPanel getPreview() {
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(PREFERED_WIDTH_PREVIEW, this.getHeight()));
		panel.setBackground(Color.WHITE);
		return panel;
	}
	
	private JPanel getWordToTranslate() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		JComboBox<String> list = new JComboBox<String>(this.controler.getWordsToTranslate());
		panel.add(list);
		return panel;
	}

	private JPanel getTranslation() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		
		return panel;
	}
	
	private JPanel getPropositions() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		
		return panel;
	}
	
}
