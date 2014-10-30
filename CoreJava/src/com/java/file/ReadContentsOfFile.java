package com.java.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.io.IOUtils;

public class ReadContentsOfFile {
	public static void main(String[] args) throws IOException {

		// Read A File using the BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(
						"D:\\eclipse-luna\\eclipse\\java\\CoreJava\\temp.txt")));
		String s = "";
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}

		System.out.println(" *************This is using the library of IO Utils *********");
		// Read a file using the IOUtils inbuilt apache function
		String everything = IOUtils
				.toString(new InputStreamReader(new FileInputStream(
						"D:\\eclipse-luna\\eclipse\\java\\CoreJava\\temp.txt")));
		System.out.println(everything);

	}
}
