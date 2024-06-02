package file.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileFile {

    public static void main(String[] args) {
        File file = new File("C:/Users/Moses/Desktop/School/java/polo.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else{
            try {
                BufferedReader reader =new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
                String line = reader.readLine();
                while(line!=null){
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
    }
    
}
