public class Enum {
    public static void main(String[] args) {
        Color c1 = Color.RED;

        System.out.println(c1.getVal());
        System.out.println(c1.name());

        for(Color c: Color.values()){
            System.out.println(c.getVal());
        }
    }
}

enum Color{
    RED("red"), GREEN("green"), YELLOW("yellow");

    private String val;

//    void setColor(String val){
//        this.val = val;
//    }

    Color(String val){
        this.val = val;
    }

    String getVal(){
        return val;
    }

}

