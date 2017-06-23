package com.idealizza.app.Password;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.*;

public class Remove {

    public Remove(File pathFile, String password) throws IOException, InvalidFormatException {
        InputStream inp = new FileInputStream(pathFile);
        org.apache.poi.hssf.record.crypto.Biff8EncryptionKey.setCurrentUserPassword(password);

        Workbook wb = WorkbookFactory.create(inp);

        // Write the output to a file
        FileOutputStream fileOut;
        fileOut = new FileOutputStream(pathFile);
        wb.write(fileOut);
        fileOut.close();
    }
}
