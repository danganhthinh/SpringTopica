package com.example.demo;

import java.util.Map;

import org.springframework.context.annotation.Configuration;

@Configuration
public interface IDictionary {
	Map<String, String> addWord(WordMean word);

	void getWord(Map<String, String> map, String word);

}
