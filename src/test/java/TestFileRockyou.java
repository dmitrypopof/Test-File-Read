import org.junit.jupiter.api.Test;

import java.io.IOException;


public class TestFileRockyou {

    //Получение рандомной строчки из файла /rockyou-75:
    @Test
    public void testReadFilePassword() throws IOException {
        HelperForRead helperForRead = new HelperForRead();
        int randomValue = helperForRead.getRandomValueLine(59187);
        System.out.println("randomValue: " + randomValue);
        helperForRead.readLine(randomValue,"/rockyou-75.txt");

    }

    //Получение рандомной строчки из файла /rockyou-25:
    @Test
    public void testReadFileRockyouAll() throws IOException {
        HelperForRead helperForRead = new HelperForRead();
        int randomValue = helperForRead.getRandomValueLine(929);
        System.out.println("randomValue: " + randomValue);
        helperForRead.readLine(randomValue,"/rockyou-25.txt");

    }

    //Получение количества строк в файле /rockyou-75.txt:
    @Test
    public void testReadCountLine() throws IOException {
        HelperForRead helperForRead = new HelperForRead();
        int count = helperForRead.getCountLine("/rockyou-75.txt");
        System.out.println("count: " + count);

    }

    //Получение количества строк в файле rockyou-25.txt:
    @Test
    public void testReadRockyouAll() throws IOException {
        HelperForRead helperForRead = new HelperForRead();
        int count = helperForRead.getCountLine("/rockyou-25.txt");
        System.out.println("count: " + count);

    }

    //Универсальный тест с определением количества строк и рандомного выбора строки:
    @Test()
    public void testRandomReadLineFromFileTXT() throws IOException {
        HelperForRead helperForRead = new HelperForRead();
        int count = helperForRead.getCountLine("/rockyou-75.txt");
        int randomValue = helperForRead.getRandomValueLine(count);
        String line = helperForRead.readLine(randomValue,"/rockyou-75.txt");
        System.out.println("Рандомная строчка: " + line);
    }

}
