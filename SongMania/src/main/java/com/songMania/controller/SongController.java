package com.songMania.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.songMania.model.Song;
import com.songMania.service.SongService;

@RestController
@RequestMapping("songmania")
public class SongController {
	
	@Autowired
	private SongService service;
	
	@PostMapping("/addSong")
	public ResponseEntity<String> newSong(@RequestBody Song song){
		String message=service.addSong(song);
		return new ResponseEntity<String>(message,HttpStatus.OK);
		
	}

}
