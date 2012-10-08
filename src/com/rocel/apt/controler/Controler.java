package com.rocel.apt.controler;



public class Controler implements IControler {

	@Override
	public void quit() {
		System.exit(0);
	}

	@Override
	public void openProject() {
		//TODO: to implement
		System.out.println("Open Project");
	}

	@Override
	public void saveProject() {
		//TODO: to implement
		System.out.println("Save Project");
		
	}

	@Override
	public String getPreferedLang() {
		//TODO: to implement
		return "Français";
	}

	@Override
	public String getLang() {
		//TODO: to implement
		return "Français";
	}

	@Override
	public String[] getWordsToTranslate() {
		String[] l = new String[] {"Word 1","Word 2","Word 3","Word 4","Word 5","Word 6","Word 7"};
		return l;
	}

}
