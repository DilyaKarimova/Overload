package ru.itpark.service;

import ru.itpark.domain.File;
import ru.itpark.domain.Movie;
import ru.itpark.domain.Song;

public class Player {
    public void play(Movie movie){
        System.out.println("Play movie");
    }

    public void play(Song song){
        System.out.println("Play song");
    }

    public void play(File file){
        throw new IllegalArgumentException();
    }
}
