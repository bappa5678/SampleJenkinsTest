package com.jenkins.testpkg;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SampleJenkins {

	public static void main(String[] args) throws IOException {
		System.out.println("This is jenkins project");
		if(!Files.exists(Paths.get("src/test/resources/emailText.txt")))
        	Files.createFile(Paths.get("src/test/resources/emailText.txt"));

	}

}
