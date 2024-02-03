import org.junit.jupiter.api.Test;

import java.io.IOException;


public class TestFileRockyou {

    //��������� ��������� ������� �� ����� /rockyou-75:
    @Test
    public void testReadFilePassword() throws IOException {
        ReadFromFile readFromFile = new ReadFromFile();
        int randomValue = readFromFile.getRandomValueLine(59187);
        System.out.println("randomValue: " + randomValue);
        readFromFile.readLine(randomValue,"/rockyou-75.txt");

    }

    //��������� ��������� ������� �� ����� /rockyou-25:
    @Test
    public void testReadFileRockyouAll() throws IOException {
        ReadFromFile readFromFile = new ReadFromFile();
        int randomValue = readFromFile.getRandomValueLine(929);
        System.out.println("randomValue: " + randomValue);
        readFromFile.readLine(randomValue,"/rockyou-25.txt");

    }

    //��������� ���������� ����� � ����� /rockyou-75.txt:
    @Test
    public void testReadCountLine() throws IOException {
        ReadFromFile readFromFile = new ReadFromFile();
        int count = readFromFile.getCountLine("/rockyou-75.txt");
        System.out.println("count: " + count);

    }

    //��������� ���������� ����� � ����� rockyou-25.txt:
    @Test
    public void testReadRockyouAll() throws IOException {
        ReadFromFile readFromFile = new ReadFromFile();
        int count = readFromFile.getCountLine("/rockyou-25.txt");
        System.out.println("count: " + count);

    }

    //������������� ���� � ������������ ���������� ����� � ���������� ������ ������:
    @Test()
    public void testRandomReadLineFromFileTXT() throws IOException {
        ReadFromFile readFromFile = new ReadFromFile();
        int count = readFromFile.getCountLine("/rockyou-75.txt");
        int randomValue = readFromFile.getRandomValueLine(count);
        String line = readFromFile.readLine(randomValue,"/rockyou-75.txt");
        System.out.println("��������� �������: " + line);
    }

}
