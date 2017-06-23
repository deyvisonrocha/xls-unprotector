package com.idealizza.app;

import java.io.*;

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
            String pathFile = "/home/deyvison/code/roo/1890_436C726B_70182571000170_MG_03102016_CONSIGNADO.xls";

            InputStream inp = new FileInputStream(pathFile);
            org.apache.poi.hssf.record.crypto.Biff8EncryptionKey.setCurrentUserPassword("7018");

            Workbook wb = WorkbookFactory.create(inp);

            // Write the output to a file
            FileOutputStream fileOut;
            fileOut = new FileOutputStream("/home/deyvison/code/roo/unprotectedworkbook.xls");
            wb.write(fileOut);
            fileOut.close();
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
