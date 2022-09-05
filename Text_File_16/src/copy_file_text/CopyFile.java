package copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    private List<String> strArr = new ArrayList<>();
    public void readFile (String filePath){
        try{
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) !=null){
                strArr.add(line);
            }
            bufferedReader.close();
        }
        catch (Exception e){
            System.err.print("File không tồn tại hoặc nội dung có lỗi.");
        }
    }
    public void writeFile(String filePathCopy){
        try{
            FileWriter writer = new FileWriter(filePathCopy, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (String str : strArr){
                bufferedWriter.write(str+"\n");
            }
            bufferedWriter.close();
            System.out.print("Copy file thành công");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public CopyFile(String filePath, String filePathCopy){
        readFile(filePath);
        writeFile(filePathCopy);
    }

    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile("F:\\CodeGym\\Module2\\Text_File_16\\src\\copy_file_text\\file.txt",
                "F:\\CodeGym\\Module2\\Text_File_16\\src\\copy_file_text\\fileCopy");
    }
}

