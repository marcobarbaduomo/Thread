package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class R implements Runnable{

    char c;
    
    public R(char c) {
        this.c= c;
    }
    
    public void run() {
        try {
            while(true){
                System.out.println("Ciao sono Thread, implemento runnable " + c);
                java.lang.Thread.sleep(2000);
            }      
        } catch (InterruptedException ex) {
                    Logger.getLogger(T.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
