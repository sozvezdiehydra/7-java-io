package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int current;
        boolean isCarriageReturn = false;
        
        while ((current = System.in.read()) != -1)
        {
            if (current == 13) { // Если текущий символ - возврат каретки \r
                if (isCarriageReturn) { // если прошлый был 13, то пишем 13 (r)
                    System.out.write(13);
                }
                isCarriageReturn = true; // Установить флаг возврата каретки
            }
            else if (current == 10) { // Если текущий символ - новая строка \n
                if (isCarriageReturn) { // Если перед ним был \r
                    System.out.write(10); // Записываем только \n
                    isCarriageReturn = false; // Сбрасываем флаг
                }
                else {
                    System.out.write(current); // если прошлое не 13, то просто выводим 10 \n
                }
            }
            else { // Если символ не \r и не \n
                if (isCarriageReturn) { // Проверяем, был ли до этого \r
                    System.out.write(13); // Выводим \r, если он был
                    isCarriageReturn = false; // Сбрасываем флаг
                }
                System.out.write(current);
            }

        }
        if (isCarriageReturn)
        {
            System.out.write(13); // Если последний символ был \r, выводим его, так как за ним нет \n
        }
        System.out.flush(); // очищаем буфер
    }
}
