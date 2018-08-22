/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.Random;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cpineros
 */
public abstract class Agent implements Supplier<String> {
    
    private String namec;
    private Client client;
    private long initialTime;
    
    

    public Agent(String name, Client cliente, long initialTime) {
        this.namec = name;
        this.client = cliente;
        this.initialTime = initialTime;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }   
    
    public String getNamec() {
        return namec;
    }

    public void setNamec(String name) {
        this.namec = name;
    }

    public Client getCliente() {
        return client;
    }

    public void setCliente(Client cliente) {
        this.client = cliente;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }
    
    
    public String get(){
        System.out.println("The Agent " + this.namec + " starts to process the operation of the " 
					+ this.client.getName() + " at the time: " 
					+ (System.currentTimeMillis() - this.initialTime) / 1000 
					+ "seg");
        
        this.doOperation();
        
        String message="The Agent " + this.namec + " has finished processing the operation " 
                                                + this.client.getOperation() + " of the client "
						+ this.client.getName() + " at the time: " 
						+ (System.currentTimeMillis() - this.initialTime) / 1000 
						+ "seg";
        return message;

    }
    
    public void doOperation(){
        try {
            Random r=new Random();
            Thread.sleep((r.nextInt(15-10)+10) * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Agent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}