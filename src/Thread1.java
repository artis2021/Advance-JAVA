public class Thread1 extends Thread{
//    public void run(){
//        try{
//            System.out.println("Thread1 is running.");
//        } catch(Exception e){
//            System.out.println("Exception occure: "+ e);
//        }

    MathUtils m;
    public Thread1(MathUtils m){
        this.m = m;
    }

    public void run(){
        try{
            m.getMultiple(2);

        } catch (Exception e){
            System.out.println("Exception occur in Thread 1. "+ e);
        }

    }
}
