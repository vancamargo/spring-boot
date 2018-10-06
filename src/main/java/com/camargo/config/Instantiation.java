package com.camargo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.camargo.domaim.Post;
import com.camargo.domaim.User;
import com.camargo.dto.AuthorDTO;
import com.camargo.repository.PostRepository;
import com.camargo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository PostRepository;
	
	@Override
	public void run(String... args0) throws Exception {
		SimpleDateFormat stf = new SimpleDateFormat("dd/MM/yyyy");
		stf.setTimeZone(TimeZone.getTimeZone("GMT"));
		userRepository.deleteAll();
		PostRepository.deleteAll();
		
		User vanessa = new User(null, "Vanessa", "vanessa@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com"); 
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(vanessa, alex, bob));
		
		Post post1 = new Post(null, stf.parse("21/03/2018"), "partiu viagem", "vou viajar",new AuthorDTO(alex));
		Post post2 = new Post(null, stf.parse("23/03/2018"), "bom dia", "acordei",new AuthorDTO(alex));
		
	
		PostRepository.saveAll(Arrays.asList(post1, post2));
		alex.getPosts().addAll(Arrays.asList(post1, post2));
		
		userRepository.save(alex);
		
	}

}
