import org.junit.jupiter.api.DisplayName;

import java.io.*;
import java.util.Random;

public class HelperForRead {

    @DisplayName("Получение рандомного числа")
    public int getRandomValueLine(int rangeLine) {
        Random random = new Random();
        int randValue = random.nextInt(rangeLine) + 1; // от 1 до ..
        return randValue;
    }

    @DisplayName("Получение строки из полученного рандомного числа {arg0} , файла {arg1}")
    public String readLine(int randomValue, String pathNameFile) throws IOException {

        int targetLineNumber = 6; // Номер целевой строки

        // Получение потока ввода для файла из папки ресурсов
        InputStream inputStream = TestFileRockyou.class.getResourceAsStream(pathNameFile);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String line;
        int lineNumber = 1;

        while ((line = bufferedReader.readLine()) != null) {
            if (lineNumber == randomValue) {
                System.out.println(line); // Выводим целевую строку
                break;
            }
            lineNumber++;
        }
        return line;
    }

    @DisplayName("Узнать количество строк в файле {arg0}")
    public int getCountLine(String pathFile) throws FileNotFoundException {
        //        InputStream inputStream = TestFileRockyou.class.getResourceAsStream(pathFile);
        String absPath = System.getProperty("user.dir");
        int lineCount = 0;

        FileInputStream fileInputStream = new FileInputStream(absPath+"\\src\\test\\resources\\rockyou-25.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        try (      BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            while (bufferedReader.readLine() != null) {
                lineCount++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lineCount;
    }


}