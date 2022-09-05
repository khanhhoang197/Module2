package find_max_and_write;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("F:\\CodeGym\\Module2\\Text_File_16\\src\\find_max_and_write\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("F:\\CodeGym\\Module2\\Text_File_16\\src\\find_max_and_write\\result.txt", maxValue);
    }
}
