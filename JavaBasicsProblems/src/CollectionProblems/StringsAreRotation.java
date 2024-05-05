package CollectionProblems;

import java.util.HashMap;
import java.util.Scanner;

/*
Write a program to check if strings are rotations of each other or not

Example:
str1 = "ABACD" str2 = "CDABA"
 */
public class StringsAreRotation {
    public HashMap<Character,Integer> initializeCharacterCountMap(String string){
         HashMap<Character,Integer> characterCountMap = new HashMap<>();
         for(int i=0;i<string.length();i++){
             characterCountMap.put(string.charAt(i),0);
         }
         return characterCountMap;
    }

    public void countCharacters(HashMap<Character,Integer> hashMap,String string){
        Integer value = null;
        char ch = ' ';
        for(int i=0;i<string.length();i++){
            ch = string.charAt(i);
            value = hashMap.get(ch);
            hashMap.put(ch,++value);
        }
    }

    public boolean compareValue(HashMap<Character,Integer> hashMap1, HashMap<Character,Integer> hashMap2){
        boolean result = false;
        if(hashMap1.keySet().size() == hashMap2.keySet().size()){
            System.out.println("Key sizes of both maps are equal");
            for(Character key: hashMap1.keySet()){
                Integer value1 = hashMap1.get(key);
                Integer value2 = hashMap2.get(key);
                if( (value1 != null && value2 != null) && (value1 == value2)){
                    System.out.println("Key: "+key+ " value1: "+value1+" value2: "+value2);
                    result = true;
                }else{
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String string2 = scanner.nextLine();

        StringsAreRotation stringsAreRotation = new StringsAreRotation();
        HashMap<Character,Integer> hashMapString1 = stringsAreRotation.initializeCharacterCountMap(string);
        HashMap<Character,Integer> hashMapString2 = stringsAreRotation.initializeCharacterCountMap(string2);
        stringsAreRotation.countCharacters(hashMapString1,string);
        stringsAreRotation.countCharacters(hashMapString2,string2);

        boolean result = stringsAreRotation.compareValue(hashMapString1,hashMapString2);
        if(result){
            System.out.println("Both strings are rotation of each other.");
        }else
            System.out.println("Strings are not rotation of each other");
    }
}

/*
ABACD
CDABA
Key sizes of both maps are equal
Key: A value1: 2 value2: 2
Key: B value1: 1 value2: 1
Key: C value1: 1 value2: 1
Key: D value1: 1 value2: 1
Both strings are rotation of each other.

Process finished with exit code 0
 */