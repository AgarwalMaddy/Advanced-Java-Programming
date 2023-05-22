class Even implements Runnable{
    private int start;
    private int end;
    public Even(int start , int end){
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() {
        for(int i = start ; i <= end; i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + " EVEN " + i );
            }
        }
    }
}

class Odd implements Runnable {
   private int start;
   private int end;

   Odd(int start , int end){
       this.start = start;
       this.end = end;
   }
    @Override
    public void run() {
        for(int i = start ; i <= end; i++){
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + " ODD " + i);
            }
        }
    }
}


public class EvenOdd {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Even(2, 100));
        Thread t2 = new Thread(new Odd(2 , 100));

        t1.start();
        t2.start();
    }
}
