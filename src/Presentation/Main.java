/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.FileManagement;
import Logic.Client;
import Logic.Dispatcher;
import java.util.ArrayList;

/**
 *
 * @author cpineros
 */
public class Main {
    
    private static FileManagement input=new FileManagement();
    private static ArrayList<Client> clients= new ArrayList<Client>();
    
    private static Dispatcher dispatcher=new Dispatcher();
    public static void main(String[] args) {
        transferList();
        for(Client c:clients){
        dispatcher.attend(c);
        }
        dispatcher.finish();
    }
    
    public static void transferList(){
        clients=input.returnList();
    }
    
}
