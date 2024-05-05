package FileOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
Write a Java program to find the longest word in a text file
 */

public class LongestWordInFile {

    public static LinkedHashMap<Integer, String> removeAllEntriesExceptTheLastOne(LinkedHashMap<Integer, String> linkedHashMap) {
        List<Integer> keysToRemove = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            if (!entry.equals(linkedHashMap.entrySet().toArray()[linkedHashMap.size() - 1])) {
                keysToRemove.add(entry.getKey());
            }
        }
        for (Integer key : keysToRemove) {
            linkedHashMap.remove(key);
        }
        return linkedHashMap;
    }


    public static LinkedHashMap<Integer,String> getLongestLengthWordMapFromLine(String[] stringArray){
        LinkedHashMap<Integer,String> longestWordLengthStringMap = new LinkedHashMap<>();
        int longestLength = 0;
        int temp = 0;
        for(String string: stringArray){
            temp = string.length();
            if(temp>longestLength){
                longestLength = temp;
                longestWordLengthStringMap.put(longestLength,string);
            }
        }
        longestWordLengthStringMap = removeAllEntriesExceptTheLastOne(longestWordLengthStringMap);
        return longestWordLengthStringMap;
    }

    public static void main(String[] args) {
        String filePath = "JavaBasicsProblems\\src\\example.txt";
        LinkedHashMap<Integer,String> longestWordLengthWordMap;
        LinkedHashMap<Integer,String> answerKeyMap = new LinkedHashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int longestWordLength =0;
            while ((line = reader.readLine()) != null) {
                String[] lineStringArray = line.split(" ");
                longestWordLengthWordMap = getLongestLengthWordMapFromLine(lineStringArray);
                Map.Entry<Integer,String> firstEntry = longestWordLengthWordMap.entrySet().iterator().next();
                if(firstEntry.getKey()>longestWordLength){
                    answerKeyMap.put(firstEntry.getKey(),firstEntry.getValue());
                }
            }
            System.out.println(removeAllEntriesExceptTheLastOne(answerKeyMap));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
{13=LOOONGESTWORD}
 */
