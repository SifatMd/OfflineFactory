/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offlinethread;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author User
 */
public class BothSingle {
    
    private LinkedList<Integer> list = new LinkedList<Integer>();
    private int limit = 20;
    
    public void produce() throws InterruptedException{
        int val=0;
        while(true){
            synchronized(this){
                while(list.size()==limit){
                    wait();
                }
                list.add(val++);
                notify();
            }
        }
        
    }
    
    public void consume(int id) throws InterruptedException{
        int val=0;
        int idno = id;
        Random a = new Random();
        while(true){
            synchronized(this){
                while(list.size()==0){
                    wait();
                }
                val = list.removeFirst();
                System.out.println("List size is "+list.size() + " value is "+val+" id no is "+idno);
                notify();
                //Thread.sleep(a.nextInt(1000));
            }
            Thread.sleep(a.nextInt(1000));
        }
    }
    
    
    
}
