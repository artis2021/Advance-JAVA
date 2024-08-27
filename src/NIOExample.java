import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fileIn = new FileInputStream("C:\\Users\\FH330\\Desktop\\ADVANCEJAVA\\destination.txt");
        FileChannel readChannel = fileIn.getChannel();
        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
        int result = readChannel.read(readBuffer);
        System.out.println("File read successfully. "+ result);

        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\FH330\\Desktop\\ADVANCEJAVA\\destination.txt");
        FileChannel writeChannel = fileOut.getChannel();
        ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
        String message = "This is a test string.";
        writeBuffer.put(message.getBytes());
        writeBuffer.flip();
        writeChannel.write(writeBuffer);
        System.out.println("File written successfully.");


    }
}
