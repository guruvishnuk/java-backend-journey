// 🔹 Example 2 — Using Runnable (BEST PRACTICE)

class Myrunnable implements Runnable{
    public void run(){
        System.out.println("Myrunnable is running");
    }
}

class Main1{
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new Myrunnable());
        t1.start();
         
    }
}