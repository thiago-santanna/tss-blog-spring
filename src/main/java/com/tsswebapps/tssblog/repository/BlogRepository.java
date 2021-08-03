package com.tsswebapps.tssblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsswebapps.tssblog.model.Post;

public interface BlogRepository extends JpaRepository<Post, Long> {

}
