package com.tsswebapps.tssblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tsswebapps.tssblog.model.Post;
import com.tsswebapps.tssblog.service.BlogService;

@Controller
public class BlogController {
	@Autowired
	BlogService blogService;
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public ModelAndView getPosts() {
		ModelAndView mAv = new ModelAndView("page-posts");
		List<Post> posts = blogService.findAll();
		mAv.addObject("postsItems", posts);
		return mAv;
	}
	
	@RequestMapping(value = "/post/{id}", method = RequestMethod.GET)
	public ModelAndView getPostId(@PathVariable("id") long id ) {
		ModelAndView mAv = new ModelAndView("page-post");
		Post posts = blogService.findById(id);
		mAv.addObject("postItem", posts);
		return mAv;
	}

}
