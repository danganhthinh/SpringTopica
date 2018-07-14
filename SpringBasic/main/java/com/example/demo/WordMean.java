package com.example.demo;

public class WordMean {
	
	private String word;
	private String mean;
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	public WordMean(String word, String mean) {
		super();
		this.word = word;
		this.mean = mean;
	}
	
	public WordMean() {
	
	}
}
