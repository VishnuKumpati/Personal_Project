package com.songMania.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.songMania.model.Song;

public interface SongRepo extends JpaRepository<Song,Long> {

}
