package com.idealizza.app;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import com.idealizza.app.Password.Identify;
import com.idealizza.app.Password.Remove;
import com.sun.javaws.exceptions.InvalidArgumentException;
import org.apache.commons.io.FilenameUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        try {
            String path = args[0];
            Identify identify = new Identify();

            CollectFiles collectFiles = new CollectFiles(path);
            for (File file : collectFiles.walkFolders()) {
                String password = identify.getPassword(file.getAbsoluteFile());
                Remove remove = new Remove(file.getAbsoluteFile(), password);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
