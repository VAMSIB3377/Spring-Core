package com.vamsi.spring.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArtistConfiguration 
{
	@Bean(name = "MyArtist")
	public Artist artistgwg()
	{
		return new Artist("John","Doe");
	}
}
