package com.rocel.apt;

import java.awt.EventQueue;

import com.rocel.apt.controler.Controler;
import com.rocel.apt.controler.IControler;
import com.rocel.apt.ui.MainView;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IControler controler = new Controler();
					MainView window = new MainView(controler);
					window.display();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
}
