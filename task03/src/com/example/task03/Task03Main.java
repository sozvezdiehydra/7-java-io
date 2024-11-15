package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        // Charset.forName return Charset by using name of coding like "ASCII", "UTF-8", valueOf make string
        InputStreamReader reader = new InputStreamReader(inputStream, Charset.forName(String.valueOf(charset)));
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder result = new StringBuilder();

        String line;

        // Читаем построчно до конца потока
        while ((line = bufferedReader.readLine()) != null) {
            result.append(line);
        }

        return result.toString();
    }
}
