package com.oracle.corejava.advance.t9;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemParse {
	
	public static void main(String[] args) {
		Iterable<Path>  p=FileSystems.getDefault().getRootDirectories();
		for(Path pp:p) {
			System.out.println(pp);
		}
	}

}
