import java.nio.file.LinkOption;
import java.util.Random;

public class LetsGo {

    public static int random(){
        int min = 100;
        int max = 500;
        return new Random().nextInt((max-min))+min;
    }

    public static void main(String[] args){
        int Lionel, Andreas, Messi;
        do {
            Lionel = random();
            Andreas = random();
            Messi = random();
        }while(!(Lionel>Andreas && Andreas>Messi));

        RunForYourLife pelari1 = new RunForYourLife("Lionel", Lionel);
        pelari1.start();
        RunForYourLife pelari2 = new RunForYourLife("Andres",Andreas);
        pelari2.start();
        RunForYourLife pelari3 = new RunForYourLife("Messi",Messi);
        pelari3.start();
    }
}
