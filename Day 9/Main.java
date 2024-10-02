// import java.util.concurrent.*;
// import java.lang.*;

public class Main{
    public static class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println("Hello from MyThread!");
        }
    }
    public static class myThread2 extends Thread{
        @Override
        public void run(){
            System.out.println("Hello from myThread2!");
        }
    }
    public static void main(String[] args) throws Exception{
        System.out.println();
        MyThread thread = new MyThread();
        thread.start();
        myThread2 thread2 = new myThread2();
        thread2.start();
        try{
            thread.join();
            thread2.join();
            System.out.println("Done Executing Both Threads");
        }
        catch(Exception e){
            System.err.println("there was an error:"+ e);
        }
        
    }
}