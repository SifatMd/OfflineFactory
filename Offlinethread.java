/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offlinethread;

import java.util.logging.Level;
import java.util.logging.Logger;


class A{
    public void func(){
        BothSingle a = new BothSingle();
        Thread t1 = new Thread(new Runnable(){
        public void run(){
                try {
                    a.produce();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Offlinethread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                try {
                    a.consume(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Offlinethread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
            t1.start();
            t2.start();

            try {
                t1.join();
                t2.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Offlinethread.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}

class B{
    public void func(){
        BothSingle a = new BothSingle();
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                try {
                    a.produce();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Offlinethread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                try {
                    a.consume(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Offlinethread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        Thread t3 = new Thread(new Runnable(){
           public void run(){
               try {
                   a.consume(2);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Offlinethread.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
                    
        });
        
        t1.start();
        t2.start();
        t3.start();
        
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(InterruptedException e){
            
        }
         
    }
}

class C{
    public void func(){
        BothSingle a = new BothSingle();
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                try {
                    a.produce();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Offlinethread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        Thread t4 = new Thread(new Runnable(){
            public void run(){
                try {
                    a.produce();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Offlinethread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
            
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                try {
                    a.consume(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Offlinethread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        Thread t3 = new Thread(new Runnable(){
           public void run(){
               try {
                   a.consume(2);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Offlinethread.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
                    
        });
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }catch(InterruptedException e){
            
        }
        
    }
               
}



public class Offlinethread {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args)  {
        A ob1 = new A();
        B ob2 = new B();
        C ob3 = new C();
        
        ob1.func();
        //ob2.func();
        //ob3.func();
        
        
        
    }
    
}
