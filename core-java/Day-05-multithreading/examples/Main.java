// 🔹 Example 1 — Creating Thread (Method 1)

class MyThread{
    public void run(){
        System.out.println("MyThread is running");
    }
}

public class Main extends MyThread{
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        t1.run();
    }
}

