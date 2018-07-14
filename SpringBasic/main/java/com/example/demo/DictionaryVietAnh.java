package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.annotation.Configuration;
public class DictionaryVietAnh implements IDictionary {
	@Override
	public Map<String, String> addWord(WordMean word) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put(word.getWord(), word.getMean());
		
		return map;
				
	}
	@Override
	public void getWord(Map<String, String> map,String word) {
		
		if (map.get(word) != null) {
			System.out.println(map.get(word));
		}else {
			System.out.println("not exits!");
		}	
	}

	
}
