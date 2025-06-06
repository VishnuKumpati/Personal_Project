package com.songMania.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Song {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
    private String artist;
    private String album;
    private String genre;
    private String language;
    private String duration;   
    private String url;     
    private int releaseYear;

}
