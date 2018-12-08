package ru.itpark;

import ru.itpark.domain.File;
import ru.itpark.domain.Movie;
import ru.itpark.domain.Song;
import ru.itpark.service.Compressor;
import ru.itpark.service.Player;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        Song song = new Song();

        Player player = new Player();
        player.play(song);
        player.play(movie);

        Compressor compressor = new Compressor();
        compressor.compress(new File());


    }
}
