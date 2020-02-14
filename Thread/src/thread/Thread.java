
package thread;

public class Thread {

    
    public static void main(String[] args) {
        T t= new T('a');
        t.start();
        
        T t2= new T('b');
        t2.start();
        
        R r= new R('c');
        Thread t3 = new Thread(r);
        t3
        
    }

    private Thread(R r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
