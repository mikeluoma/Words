package com.remitly;

import java.io.*;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class Dictionary {
    private Set<String> words = new HashSet<>();

    public Dictionary() {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource("words");
        if (resource == null) {
            throw new RuntimeException("Cannot load dictionary of words");
        }

        File file = new File(resource.getFile());
        try (
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                words.add(line.toLowerCase().trim());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found for words", e);
        } catch (IOException e) {
            throw new RuntimeException("Error reading file for words", e);
        }
    }

    public boolean isWord(String candidate) {
        return candidate != null && words.contains(candidate.toLowerCase());
    }
}
