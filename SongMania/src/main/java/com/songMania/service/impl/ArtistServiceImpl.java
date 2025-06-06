package com.songMania.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songMania.model.Artist;
import com.songMania.repo.ArtistRepo;
import com.songMania.service.ArtistService;

@Service
public class ArtistServiceImpl  implements ArtistService{
	
	@Autowired
	private ArtistRepo repo;

	public Artist registerArtist(Artist artist) {
	    Optional<Artist> existing = repo.findByStageName(artist.getStageName());

	    if (existing.isPresent()) {
	        throw new RuntimeException("Artist with stage name already exists!");
	    }

	    return repo.save(artist);
	}


}
