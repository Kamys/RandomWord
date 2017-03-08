package com.github.kamys.randomWord.model;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;

/**
 * Use for choice text from which need get word.
 */
public class TextSelector {
    private static final Logger LOGGER = Logger.getLogger(TextSelector.class);

    public void select(String path) throws IOException {
        File file = new File(path);
        if (!file.canRead()) {
            failed(file);
            return;
        }else {
            FileUtils.readFileToString(file,"UTF-8");
        }

    }

    private void failed(File file) throws IOException {
        IOException ioException = new IOException("Failed! Not can read file: " + file.getAbsolutePath());
        LOGGER.error(ioException);
        throw ioException;
    }
}
