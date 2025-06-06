package com.songMania.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.songMania.model.Artist;

@Repository
public interface ArtistRepo  extends JpaRepository<Artist, Long> {

	Optional<Artist> findByStageName(String stageName);



}
