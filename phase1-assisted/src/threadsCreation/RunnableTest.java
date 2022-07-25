package threadsCreation;

public class RunnableTest implements Runnable{
	 
    public static int myCount = 0;
    public RunnableTest(){
        
    }
    public void run() {
        while(RunnableTest.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++RunnableTest.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        RunnableTest mrt = new RunnableTest();
        Thread t = new Thread(mrt);
        t.start();
        while(RunnableTest.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++RunnableTest.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
