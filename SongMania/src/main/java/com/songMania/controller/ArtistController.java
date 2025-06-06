package com.songMania.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.songMania.model.Artist;
import com.songMania.service.ArtistService;

import jakarta.persistence.Entity;

@RestController
@RequestMapping("artist")
public class ArtistController {
	@Autowired
	private ArtistService service;
	
	@PostMapping("/register")
	public ResponseEntity<Artist> registerArtist(Artist artist){
		Artist registered=service.registerArtist(artist);
		return new ResponseEntity<>(registered,HttpStatus.OK);
		
		
	}

}
