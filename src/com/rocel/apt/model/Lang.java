package com.rocel.apt.model;

import java.util.HashMap;
import java.util.Map;

public class Lang {

	Map<String,Map<String,String>> langs;
	
	public Lang(){
		langs = new HashMap<String,Map<String,String>>();
	}

	public Map<String,String> getValues(String lang){
		return langs.get(lang);
	}
	
	public String getValue(String lang, String key){
		return langs.get(lang) != null
				?langs.get(lang).get(key)
				:null;
	}
	

	public void setValues(String lang,  Map<String,String> values){
		langs.get(lang).putAll(values) ;
	}
	
	public void setValue(String lang, String key, String value){
		langs.get(lang).put(key, value) ;
	}
	
}
