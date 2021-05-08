package com.journaldev.bootifulmongodb.controller;

import java.util.List;

import com.journaldev.bootifulmongodb.dto.RequestDTO;
import com.journaldev.bootifulmongodb.model.Article;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.journaldev.bootifulmongodb.dal.ArticleRepository;

@RestController
@RequestMapping("/article")
public class ArticleController {

	private final ArticleRepository articleRepository;

	public ArticleController(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	@PostMapping(value = "/create")
	public Article addNewArticle(@RequestBody RequestDTO requestDTO) {
		Article article = new Article();
		article.setAuthor(requestDTO.getAuthor());
		article.setArticleContent(requestDTO.getArticleContent());
		article.setPublishDate(requestDTO.getPublishDate());
		article.setStarCount(requestDTO.getStarCount());
		article.setTitle(requestDTO.getTitle());
		return articleRepository.save(article);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Article> getAllArticles() {
		return articleRepository.findAll();
	}

	@RequestMapping(value = "/{articleId}", method = RequestMethod.GET)
	public Article getArticle(@PathVariable String articleId) {
		return articleRepository.findById(articleId).get();
	}
}