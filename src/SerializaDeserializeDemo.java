import java.io.*;

public class SerializaDeserializeDemo {
    public static void main(String[] args) {
        Serialization stu = new Serialization("Arti", "Bangalore", 22);
        stu.setX(10);
        String fileName = "C:\\Users\\FH330\\Desktop\\ADVANCEJAVA\\Student.txt";
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;

        //Serialization
        try{
            fileOut = new FileOutputStream(fileName);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(stu);
            objOut.close();
            fileOut.close();
            System.out.println("Object has been serialize: " + stu);


        } catch(Exception e){
            e.printStackTrace();

        }

        //Deserialize
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;
        try{
            fileIn = new FileInputStream(fileName);
            objIn = new ObjectInputStream(fileIn);
            Serialization obj = (Serialization) objIn.readObject();

            System.out.println("Object has been deserialize: "+ obj);
            System.out.println(stu.getX());
            objIn.close();
            fileIn.close();

        } catch(Exception e){
            System.out.println("something error");
            e.printStackTrace();
        }


    }
}
