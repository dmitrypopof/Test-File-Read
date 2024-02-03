import org.junit.jupiter.api.Test;

import java.io.IOException;


public class TestFileRockyou {

    //Получение рандомной строчки из файла /rockyou-75:
    @Test
    public void testReadFilePassword() throws IOException {
        ReadFromFile readFromFile = new ReadFromFile();
        int randomValue = readFromFile.getRandomValueLine(59187);
        System.out.println("randomValue: " + randomValue);
        readFromFile.readLine(randomValue,"/rockyou-75.txt");

    }

    //Получение рандомной строчки из файла /rockyou-25:
    @Test
    public void testReadFileRockyouAll() throws IOException {
        ReadFromFile readFromFile = new ReadFromFile();
        int randomValue = readFromFile.getRandomValueLine(929);
        System.out.println("randomValue: " + randomValue);
        readFromFile.readLine(randomValue,"/rockyou-25.txt");

    }

    //Получение количества строк в файле /rockyou-75.txt:
    @Test
    public void testReadCountLine() throws IOException {
        ReadFromFile readFromFile = new ReadFromFile();
        int count = readFromFile.getCountLine("/rockyou-75.txt");
        System.out.println("count: " + count);

    }

    //Получение количества строк в файле rockyou-25.txt:
    @Test
    public void testReadRockyouAll() throws IOException {
        ReadFromFile readFromFile = new ReadFromFile();
        int count = readFromFile.getCountLine("/rockyou-25.txt");
        System.out.println("count: " + count);

    }

    //Универсальный тест с определением количества строк и рандомного выбора строки:
    @Test()
    public void testRandomReadLineFromFileTXT() throws IOException {
        ReadFromFile readFromFile = new ReadFromFile();
        int count = readFromFile.getCountLine("/rockyou-75.txt");
        int randomValue = readFromFile.getRandomValueLine(count);
        String line = readFromFile.readLine(randomValue,"/rockyou-75.txt");
        System.out.println("Рандомная строчка: " + line);
    }

}
