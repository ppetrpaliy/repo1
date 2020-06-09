package com.ppsdevelopment.filelib;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Класс предоставляет методы для записи строковых данных в текстовый файл
 */

public class textFileWriter {
    public static BufferedWriter initWriter(String fileName) throws IOException {
        File file=new File(fileName);
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        return writer;
    }

    public static void write(BufferedWriter writer, String s) throws IOException {
        if (writer!=null) {
            writer.write(s);
        }
    }

    public static void writeLine(BufferedWriter writer, String s) throws IOException {
        write(writer,s);
        if (writer!=null)
            writer.newLine();
    }

    public static void newLine(BufferedWriter writer) throws IOException {
        if (writer!=null)
            writer.newLine();
    }

    public static void flush(BufferedWriter writer) throws IOException {
        if (writer!=null) writer.flush();
    }

    public static void close(BufferedWriter writer) throws IOException {
        if (writer!=null) writer.close();
    }



}
