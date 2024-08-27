public class MathUtils {
    synchronized void getMultiple(int n){
        for(int i = 1; i <= 5; i++){
            System.out.println(n * i);
            try{
                Thread.sleep(400);
            } catch(Exception e){
                System.out.println("Exception occur in MathUtils. "+ e);
            }
        }
    }


}
