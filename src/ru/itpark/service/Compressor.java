package ru.itpark.service;

import ru.itpark.domain.File;

public class Compressor {
    public void compress(File file, String level){
        System.out.println("compress with level: " + level);
    }

    public void compress(File file){
        compress(file, "normal");

    }
}
