package com.camargo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.camargo.domaim.Post;

@Repository
public interface PostRepository extends MongoRepository <Post, String> {

	List<Post> findByTitleContaining(String text);
}
