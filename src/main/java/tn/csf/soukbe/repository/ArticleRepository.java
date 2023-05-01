package tn.csf.soukbe.repository;

import org.springframework.data.repository.CrudRepository;

import tn.csf.soukbe.model.Article;

//repository that extends CrudRepository  

public interface ArticleRepository extends CrudRepository<Article, Integer>  
{  
}  