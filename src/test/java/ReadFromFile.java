import org.junit.jupiter.api.DisplayName;

import java.io.*;
import java.util.Random;

public class ReadFromFile {

    @DisplayName("��������� ���������� �����")
    public int getRandomValueLine(int rangeLine) {
        Random random = new Random();
        int randValue = random.nextInt(rangeLine) + 1; // �� 1 �� ..
        return randValue;
    }

    @DisplayName("��������� ������ �� ����������� ���������� ����� {arg0} , ����� {arg1}")
    public String readLine(int randomValue, String pathNameFile) throws IOException {

        int targetLineNumber = 6; // ����� ������� ������

        // ��������� ������ ����� ��� ����� �� ����� ��������
        InputStream inputStream = TestFileRockyou.class.getResourceAsStream(pathNameFile);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String line;
        int lineNumber = 1;

        while ((line = bufferedReader.readLine()) != null) {
            if (lineNumber == randomValue) {
                System.out.println(line); // ������� ������� ������
                break;
            }
            lineNumber++;
        }
        return line;
    }

    @DisplayName("������ ���������� ����� � ����� {arg0}")
    public int getCountLine(String pathFile) {
        int lineCount = 0;
        InputStream inputStream = TestFileRockyou.class.getResourceAsStream(pathFile);
        try (      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
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