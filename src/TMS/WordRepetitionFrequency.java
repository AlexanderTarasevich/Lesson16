package TMS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordRepetitionFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк в массиве:");
        int numberOfStrings = Integer.parseInt(scanner.nextLine());
        String[] strings = new String[numberOfStrings];

        System.out.println("Введите строки:");
        for (int i = 0; i < numberOfStrings; i++) {
            strings[i] = scanner.nextLine();
        }

        Map<String, Boolean> frequencyMap = getFrequencyMap(strings);
        System.out.println(frequencyMap);

        scanner.close();
    }

    public static Map<String, Boolean> getFrequencyMap(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Boolean> frequencyMap = new HashMap<>();

        for (String str : strings) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            frequencyMap.put(entry.getKey(), entry.getValue() >= 2);
        }
        return frequencyMap;
    }
}

