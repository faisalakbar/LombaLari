//Faisal Akbar

public class RunForYourLife implements Runnable{
    private String Nama;
    private int jeda;
    public static int checkpoints = 20;


    public RunForYourLife(String threadName,int delay){
        this.Nama = threadName;
        this.jeda = delay;
        System.out.println(threadName + ", ready.");
    }

    public void run(){
        System.out.println(Nama + ", go!");
        for(int i = 0;i<checkpoints;i++){
            System.out.println(Nama + "\thas passed checkpoint (" + (i+1) + ")");
            try{
                Thread.sleep(jeda);
            } catch(InterruptedException E){
                System.out.println(Nama + " was interrupted");
            }
        }
        System.out.println(Nama + " has finished!");
    }

    public void start(){
        System.out.println(Nama + ", set ...");
        (new Thread(this, Nama)).start();
    }

}
