package com.ianiori.springbootmongo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ianiori.springbootmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	public List<Post> findByTitleContainingIgnoreCase(String text);
	
}
