package FileOperations;

import java.io.File;

/*

 */
public class FileSize {
    public static void main(String[] args) {
        String filePath = "JavaBasicsProblems\\src\\example.txt";

        File file = new File(filePath);

            long fileSizeBytes = file.length();
            System.out.println("File size in bytes: " + fileSizeBytes);

            double fileSizeKB = (double) fileSizeBytes / 1024;
            System.out.println("File size in kilobytes: " + fileSizeKB);

            double fileSizeMB = fileSizeKB / 1024;
            System.out.println("File size in megabytes: " + fileSizeMB);

    }
}
/*
File size in bytes: 31
File size in kilobytes: 0.0302734375
File size in megabytes: 2.956390380859375E-5 i.e: 0.00002956390380859375
 */
