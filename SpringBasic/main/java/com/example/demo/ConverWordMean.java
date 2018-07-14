package com.example.demo;

import org.springframework.core.convert.converter.Converter;

public class ConverWordMean implements Converter<String, WordMean> {

	@Override
	public WordMean convert(String line) {
		// TODO Auto-generated method stub
		
		if (line == null || line.isEmpty()) {
			
		}
		if (line.contains(":")) {
			String[] wordMean = line.split(":");
			return new WordMean(wordMean[0].trim(),wordMean[1].trim());
		}
		return null;
	}
	
}
