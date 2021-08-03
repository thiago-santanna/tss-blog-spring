package com.tsswebapps.tssblog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsswebapps.tssblog.model.Post;
import com.tsswebapps.tssblog.repository.BlogRepository;

@Component
public class PopData {
	@Autowired
	BlogRepository blogRepository;
	
	//@PostConstructn - deixar comentado pra não gerar outros registros agora
	public void populationPosts() {
		List<Post> posts = new ArrayList<>();
		
		Post post1 = new Post();
		post1.setAuthor("Thiago Santanna");
		post1.setDate(LocalDate.now());
		post1.setTitle("Acredite em você");
		post1.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut aliquam venenatis felis, ac rhoncus leo mollis at. Quisque massa quam, malesuada eget rhoncus non, suscipit a dui. Integer sollicitudin luctus lorem vel hendrerit. In risus nibh, commodo sed orci vel, laoreet feugiat lorem. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Donec sagittis mi libero, et pulvinar tellus venenatis vel. Nunc scelerisque eget velit quis auctor. Quisque lacinia ultricies diam ac dictum. Praesent sollicitudin, erat in volutpat sodales, arcu sem molestie dolor, vel lobortis felis dolor sed dolor. Quisque nec feugiat est. Maecenas finibus massa arcu, eget mattis purus auctor ut.");
		
		Post post2 = new Post();
		post2.setAuthor("Thiago Santanna");
		post2.setDate(LocalDate.now());
		post2.setTitle("Nunca desista de seus sonhos");
		post2.setText("Donec at elit vestibulum augue aliquet semper nec ut odio. Sed dui orci, viverra non libero vitae, pharetra bibendum orci. Duis ultrices pharetra congue. Pellentesque at purus est. Mauris sit amet volutpat mauris, a iaculis massa. Aenean vel arcu eget nisl maximus sagittis vel vitae arcu. Ut ac odio tincidunt, convallis tellus non, pretium nisi. Sed molestie pharetra diam ut tempus. Aenean lorem ante, venenatis id volutpat id, facilisis sed odio. Nulla facilisi. Nulla sollicitudin tellus vel accumsan dapibus. Curabitur sagittis risus in metus mattis efficitur. Quisque tincidunt enim urna, at pretium leo tempus in. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Sed vulputate orci vitae quam molestie, sed feugiat diam pharetra. Nam egestas ex velit, sed mattis leo fermentum ac.");
		
		posts.add(post1);
		posts.add(post2);
		
		for(Post post: posts) {
			Post returnPost = blogRepository.save(post);
			System.out.println(returnPost.getTitle());
		}
	}

}
