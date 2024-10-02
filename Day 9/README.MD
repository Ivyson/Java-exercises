## Threading
## Difference between Process and Thread
1. A process is an instance of a program being executed, A process has its own resources like memory, threads etc..
    - Operating System is responsible for allocating these resources to the process
2. A Thread is a lightweight process - Similarly, A Thread is the smallest sequence of instructions executed by a CPU independantly. 
- A process can have multiple threads, Initially, a Process may have one thread, which is called ** Main Thread **
## Understanding Processes and Threads
- With Respect to Java, The JVM acts as an operating system to allocate resources to its mini- processes.
- Multi- threading allows a program to perform multiple tasks at the same time
- Threads from the same process share the same resources
- Multi-tasking and Multi-threading -- Need to recheck this..
- To call a new thread 
```Java 
Thread thread = new Thread();
thread.start();
//The rest of the code Here
```
- There are more than four ways to create and instantiate a Java Thread
1. Creating a subclass that extends to Thread, Whereby you will override the runnable method, Example:
```Java
public class ThreadEg{
    public static class MyThread extends Thread{
    public void run(){
        System.out.println("The Thread is running");
    }
    }
    public static void main(String[] args){
        MyThread thread = new MyThread();
        thread.start();
    }
}
```
- Example 2: Using the runnable extention: 
```Java
public class ThreadEg{
    public static class MyThread implements Runnable {
        @Override
    public void run(){
        System.out.println("The Thread is running");
    }
    }
    public static void main(String[] args){
        MyThread thread = new MyThread(new MyThread());
        thread.start();
    }
}
```
- Example 3 : Creating an unknown class of Runnable inside the main function
- Example 4 : Using the Lambda expressions
```Java
public class ThreadEg{
  
    }
    public static void main(String[] args){
        Runnable runnable = () -> {
            System.out.println("This is a test using Lambda functions")
        };
        MyThread thread = new MyThread(runnable);
        thread.start();
    }
}
```
- To get the name of the Thread that is currently executing, You can use the code :
```Java 
Thread.currentThread().getName();
```
- To Pause a thread from executing or to sleep a thread :
```Java
try{
    Thread.sleep(2000); //Sleep for 2 seconds and then continue
}
catch(error){
    //Code here
}

```

- To ensure synchrinised access to variables and function calls, the prefix 'Synchronise' is used. This is used when the code has a critical resource or section that may be utilised by multple threads
