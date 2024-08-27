import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream inFile = null;
        FileOutputStream outFile = null;
        try{
            inFile = new FileInputStream("C:\\Users\\FH330\\Desktop\\ADVANCEJAVA\\Student.txt");
            outFile = new FileOutputStream("C:\\Users\\FH330\\Desktop\\ADVANCEJAVA\\destination.txt");
            int content;
            while((content = inFile.read()) != -1){
                outFile.write((byte)content);
            }
        } finally{
            if(inFile != null){
                inFile.close();
            }
            if(outFile != null){
                outFile.close();
            }
        }
    }
}
