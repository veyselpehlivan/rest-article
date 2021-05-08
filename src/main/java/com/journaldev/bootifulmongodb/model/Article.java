package com.journaldev.bootifulmongodb.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Article")
public class Article {

	@Id
	private String id;

	private String Title;
	private String Author;
	private String ArticleContent;
	private Date PublishDate;
	private int StarCount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getArticleContent() {
		return ArticleContent;
	}

	public void setArticleContent(String articleContent) {
		ArticleContent = articleContent;
	}

	public Date getPublishDate() {
		return PublishDate;
	}

	public void setPublishDate(Date publishDate) {
		PublishDate = publishDate;
	}

	public int getStarCount() {
		return StarCount;
	}

	public void setStarCount(int starCount) {
		StarCount = starCount;
	}
}
