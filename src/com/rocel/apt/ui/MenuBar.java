package com.rocel.apt.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.rocel.apt.controler.IControler;

public class MenuBar extends JMenuBar {
	private static final String MENU_STRING_FILE = "File";
	private static final String MENU_STRING_OPENPROJECT = "Open project";
	private static final String MENU_STRING_SAVEPROJECT = "Save project";
	private static final String MENU_STRING_QUIT = "Quit";


	private static final long serialVersionUID = 432106559041649548L;
	
	private IControler controler;
	private JFrame parent;
	
	public MenuBar(JFrame pParent, IControler pControler) {
		this.controler = pControler;
		this.parent = pParent;
		
		/**
		 * FILE MENU
		 */
		JMenu mnFichier = new JMenu(MENU_STRING_FILE);
		mnFichier.setMnemonic(KeyEvent.VK_F);
		add(mnFichier);

		JMenuItem mntmOpenProject = new JMenuItem(MENU_STRING_OPENPROJECT);
		mntmOpenProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controler.openProject();
			}
		});
		mnFichier.add(mntmOpenProject);
		
		JMenuItem mntmSaveProject = new JMenuItem(MENU_STRING_SAVEPROJECT);
		mntmSaveProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controler.saveProject();
			}
		});
		mnFichier.add(mntmSaveProject);
		

		JMenuItem mntmQuitter = new JMenuItem(MENU_STRING_QUIT);
		mntmQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controler.quit();
			}
		});
		mnFichier.add(mntmQuitter);

	}
	
}
