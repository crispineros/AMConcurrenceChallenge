/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.FileManagement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cpineros
 */


public class Dispatcher {
    private final int maxCashiers=5;
    private final int maxSupervisors=3;
    private final int maxDirectors=2;
    private int actualCashiers=0;
    private int actualSupervisors=0;
    private int actualDirectors=0;
    
    static ExecutorService executor = Executors.newFixedThreadPool(10);
    public void attend(Client client){

        if(this.actualCashiers<maxCashiers){
           CompletableFuture.supplyAsync(new Cashier("Cashier "+String.valueOf(actualCashiers+1), client,System.currentTimeMillis()), executor).thenAccept
                    (response -> {
                    System.out.println(response);
                    });
           this.actualCashiers++;
        }
        else if(this.actualSupervisors<maxSupervisors){
            CompletableFuture.supplyAsync(new Supervisor("Supervisor "+String.valueOf(actualSupervisors+1), client,System.currentTimeMillis()), executor).thenAccept
                    (response -> {
                    System.out.println(response);
                    });
           this.actualSupervisors++;
        }
        else if(this.actualDirectors<maxDirectors){
            CompletableFuture.supplyAsync(new Supervisor("Director "+String.valueOf(actualDirectors+1), client,System.currentTimeMillis()), executor).thenAccept
                    (response -> {
                    System.out.println(response);
                    });
           
           this.actualDirectors++;
        }
        }
       

    public void finish() {
       executor.shutdown();
    }
    
}
