package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	public String[] getHashes(List<String> sources) {
		List<String> filteredSources = sources.stream().filter(el -> el.contains("#")).filter(el -> el.contains("")).collect(Collectors.toList());
		return filteredSources.toArray(String[]::new);
	}
}


//	Getting that List<String> contains following values
// word1, word1, #hash1, word1, #hash2,  word1, #hash3, word1,word1,
// #hash1, word1, #hash7, word13, #hash5, word1, word1, word1, #hash4, word1, #hash2,  word1, #hash7, word1, home7898, #hash11, #hashabc
//
//
//
//		Implement function:
//

//
//		So that resulting array will contain following data in the following order:
//
//		#hash1, #hash2, #hash3, #hash4, #hash5, #hash7, #hash11
