package CollectionProblems;

import java.util.ArrayList;
import java.util.Arrays;

/*
Write a program to remove duplicates from ArrayList ?

Input:

ArrayList with duplicates: [1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5]

Output:
ArrayList with duplicates removed: [1, 10, 2, 3, 4, 5]
 */
public class FindDuplicate {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
        int arrayLength = arrayList.size();
        for(int i=0;i<arrayLength;i++){
            for(int j=i+1;j<arrayLength;j++){
                if(arrayList.get(i) == arrayList.get(j)){
                    arrayList.remove(j);
                    arrayLength--;
                    j--;
                }
            }
        }
        System.out.println(arrayList.size());
        System.out.println(arrayList);
    }
}
