package com.idealizza.app.Password;

import java.io.File;
import java.nio.file.Path;

public class Identify {

    public Identify() {

    }

    public String getPassword(File fileName) {
        String file = fileName.toPath().getFileName().toString();

        String[] parts = file.split("_");
        String password = parts[2].substring(0, 4);

        return password;
    }
}
