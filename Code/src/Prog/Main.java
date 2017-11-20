//Создать в проекте (руками) текстовый файл.
// Прочитать его и вывести строки из него на экран.
// Вывести так же информацию о количестве строк, длине каждой строки
// и общей длине строк в файле.

package Prog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static final String FILE_NAME = "Text.txt";

    public static void main(String[] args) {

        String line = null;
        int[] lengthline = new int[30];
        int lineCount = 1;
        int lengthOfAllLines = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lengthline[lineCount] = line.length();
                lineCount++;
                lengthOfAllLines=lengthOfAllLines+line.length();


            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        lineCount--;
        System.out.println("Total lines = "+lineCount);
        lineCount++;              //Смутило когда он дальше выдал - Length of line number 0 = 16
        for (int i = 1; i < lineCount; i++){
            System.out.println("Length of line number "+i+" = "+lengthline[i]);
        }

        System.out.println("Total characters = "+lengthOfAllLines);

        }
    }


