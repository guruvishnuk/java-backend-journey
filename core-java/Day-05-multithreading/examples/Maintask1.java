// 🧪 TASK 1 — TWO THREADS (NUMBERS + LETTERS)

class Lettertask implements Runnable{
    public void run(){
        for(char a='A';a<='E';a++){
            System.out.println("Letter is :"+a);
        }
    }
}
class Numbertask implements Runnable{
    public void run(){
        for(int i = 1;i<5;i++){
            System.out.println("Number is :"+i  );
        }
    }
}


public class Maintask1{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Lettertask());
        Thread t2 = new Thread(new Numbertask());
        t1.start();
        t2.start();
    }
}