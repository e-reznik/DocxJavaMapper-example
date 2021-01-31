package com.mycompany.docxunzipper;

import com.mycompany.model.DJMDocument;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
       new Main();
    }

    private Main() throws IOException {
        String userDirectory = System.getProperty("user.dir");
        File f = new File(userDirectory, "/src/main/resources/example.docx");

        DJMDocument djmDocument = DocxJM.map(f.toString());

        LOGGER.log(Level.INFO, "The text is: " + Helper.getTextFromDocument(djmDocument));
        LOGGER.log(Level.INFO, "All bold words in the document: " + Helper.getBoldWords(djmDocument).toString());
    }
}