package com.idealizza.app;

import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CollectFiles {
    private String path;

    public CollectFiles(String path) {
        this.path = path;
        walkFolders();
    }

    public List<File> walkFolders() {
        List<File> allFiles = new ArrayList<File>();
        Queue<File> dirs = new LinkedList<File>();
        dirs.add(new File(this.path));
        while (!dirs.isEmpty()) {
            for (File f : dirs.poll().listFiles()) {
                if (f.isDirectory()) {
                    dirs.add(f);
                } else if (f.isFile()) {
                    if (FilenameUtils.getExtension(f.getAbsolutePath().toLowerCase()).contains("xls")) {
                        allFiles.add(f);
                    }
                }
            }
        }
        return allFiles;
    }
}
