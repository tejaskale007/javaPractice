import java.io.*;

class FileOperations {

    public void createOrcheckfile(String fileName) throws Exception{
        File file = new File(fileName);

        if(file == null){
            throw new Exception("fileDoesNotExitException");
        }else{
            int i =0;
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while((line = reader.readLine())!=null){
                i++;
                if(i==1)
                    System.out.println("line no: "+i + " "+line);
                else
                    System.out.println("line no: "+i + " "+reader.readLine());
            }
            if(i==0){
                throw new Exception("fileIsEmptyException");
            }
        }

    }

    public static void main(String[] args) {
        FileOperations fileOperation = new FileOperations();
        try{
            fileOperation.createOrcheckfile("example.txt");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}