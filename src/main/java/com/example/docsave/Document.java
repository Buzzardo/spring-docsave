package com.example.docsave;

import org.springframework.data.annotation.Id;

/**
 * A document to store in MongoDB
 */
public class Document {
	
	@Id private String id;

	private String name;
	private String content;

	Document(String name, String content) {
		this.name = name;
		this.content = content;
	}

	// Gotta have this constructor to allow insertion into the collection
	Document() {
		
	}

	public String getDocument() {
		return content;
	}

	public void setDocument(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
