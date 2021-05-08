package com.journaldev.bootifulmongodb.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.journaldev.bootifulmongodb.model.Article;

@Repository
public interface ArticleRepository extends MongoRepository<Article, String> {
}
