package com.steamproblem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCountUsingStream {

	public static void main(String[] args) throws IOException {
		
		//To load file from given path 
		Path path = Paths.get("D:\\udemy\\interview-workspace\\Java-8\\src\\com\\steamproblem\\word.txt");
		
		
		//Map<String, Integer> wordCount = 
				Files.lines(path)
				// line.trim().split(" ") returns Array of String[] for one line 
				// output of multiple line is stream<String[]>
				// flatmap is use to convert stream<String[]> to stream<String>
				.flatMap(line -> Arrays.stream(line.trim().split(" ")))
				.map(word -> word.toLowerCase().trim()) // convert all word into lower case
				.map(word -> new SimpleEntry<>(word, 1)).sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
			    .forEach(System.out::println);
			 /*  
				
				.reduce(new LinkedHashMap<>(), (acc, entry) -> {
					acc.put(entry.getKey(), acc.compute(entry.getKey(), (k, v) -> v == null ? 1 : v + 1));
					return acc;
				}, (m1, m2) -> m1);*/

		//wordCount.forEach((k, v) -> System.out.println(String.format("%s ==>> %d", k, v)));
	}

}
