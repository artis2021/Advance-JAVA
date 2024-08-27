public class AutoBoxingDemo {
    public static void main(String[] args) {
        int n = 10;
//        AutoBoxing
        Integer objI = Integer.valueOf(n);
        System.out.println("The value of the integer obj is: "+ objI);

        //AutoUnBoxing
        int n1 = objI;
        System.out.println("Value of n1: "+ n1);

        //AutoBoxing
        Character chObj = 'a';

        //Auto-Unboxing
        char ch = chObj;
        System.out.println("Value of ch: "+ ch);
        System.out.println("Value of charObj: "+ chObj);
    }
}
