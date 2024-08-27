import java.io.Serializable;

public class Serialization implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String address;
    private int age;
    transient int x; // transient member var will not serialize and deserialize
    public String toString(){
        return ("The name is: "+ name + " The age is: "+ age + " The address is: "+ address);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Serialization(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Serialization(String name) {
        this.name = name;
    }

//    public Serialization(String address){
//        this.address = address;
//    }


    public Serialization(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
