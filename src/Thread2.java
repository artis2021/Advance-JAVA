public class Thread2 implements Runnable{
//    public void run(){
//        try{
//            System.out.println("Thread 2 is running.");
//        } catch(Exception e){
//            System.out.println("Exception is caught.");
//        }

        MathUtils m;
        public Thread2(MathUtils m){
            this.m = m;
        }

        public void run() {
            try {
                m.getMultiple(3);
            } catch (Exception e) {
                System.out.println("Excetion is occure in thread 2. " + e);
            }
        }


    }

