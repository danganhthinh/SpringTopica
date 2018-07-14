package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class ReadFile {

	public void readFile(File file, List<WordMean> list) throws IOException {
		Resource rs = new FileSystemResource("d:/dictionary.txt");
		InputStream inputStream = rs.getInputStream();
		file = rs.getFile();
		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
	}
}
