package com.rocel.apt.controler;


public interface IControler {

	void quit();

	void openProject();

	void saveProject();

	String getPreferedLang();

	String getLang();

	String[] getWordsToTranslate();

}
