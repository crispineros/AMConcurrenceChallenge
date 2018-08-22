/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Logic.Cashier;
import Logic.Client;
import java.util.ArrayList;

/**
 *
 * @author cpineros
 */
public class FileManagement {
    
        Client client1 = new Client("Client1","Deposit");
        Client client2 = new Client("Client2","Withdraw");
        Client client3 = new Client("Client3","Resolve issue");
        Client client4 = new Client("Client4","Deposit");
        Client client5 = new Client("Client5","withdraw");
        Client client6 = new Client("Client6","Resolve issue");
        Client client7 = new Client("Client7","Deposit");
        Client client8 = new Client("Client8","Withdraw");
        Client client9 = new Client("Client9","Resolve issue");
        Client client10 = new Client("Client10","Deposit");

    public ArrayList<Client> clients=new ArrayList<Client>();
    public void fillArray(){
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(client4);
        clients.add(client5);
        clients.add(client6);
        clients.add(client7);
        clients.add(client8);
        clients.add(client9);
        clients.add(client10);   
    }
    public ArrayList<Client> returnList(){
        this.fillArray();
        return clients;
    }
}
    

