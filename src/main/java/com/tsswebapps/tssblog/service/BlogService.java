package com.tsswebapps.tssblog.service;

import java.util.List;

import com.tsswebapps.tssblog.model.Post;

public interface BlogService {
	List<Post> findAll();
	Post findById(long id);
	Post save(Post post);
}
