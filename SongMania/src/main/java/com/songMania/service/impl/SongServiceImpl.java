package com.songMania.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.songMania.model.Song;
import com.songMania.repository.SongRepo;
import com.songMania.service.SongService;

@Service
public class SongServiceImpl implements SongService {

	@Autowired
	private SongRepo repo;
	

	@Override
	public String addSong(Song song) {
	    Song savedSong = repo.save(song);
	    if (savedSong != null && savedSong.getId!= null) {
	        return "Song saved successfully";
	    } else {
	        return "Song not saved";
	    }
	}

	}

}
