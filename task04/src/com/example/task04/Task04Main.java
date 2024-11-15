package com.example.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        double sum = 0.0;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                String[] tokens = line.split("\\s+"); // \\s+ один или более пробел

                for (String token : tokens)
                {
                    try {
                        double number = Double.parseDouble(token);
                        sum += number;
                    } catch (NumberFormatException ex) {
                        // Игнорируем, если токен не является числом
                    }
                }
            }
        }
        System.out.printf(Locale.US, "%.6f%n", sum);
    }
}
