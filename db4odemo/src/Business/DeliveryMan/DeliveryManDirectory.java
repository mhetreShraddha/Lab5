/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
    private ArrayList<DeliveryMan> deliverymanList;
    DeliveryMan deliveryMan;
    
    public DeliveryManDirectory() {
        this.deliverymanList = new ArrayList<DeliveryMan>();
    }

    public ArrayList<DeliveryMan> getDeliverymanList() {
        return deliverymanList;
    }

    public void setDeliverymanList(ArrayList<DeliveryMan> deliverymanList) {
        this.deliverymanList = deliverymanList;
    }

    public DeliveryMan getDeliveryMan(String deliverymanUsername) {
        for(DeliveryMan deliveryMan: deliverymanList) {
            if(deliveryMan.getDeliverymanUsername().equalsIgnoreCase(deliverymanUsername)) {
            return deliveryMan;
            }
        }
        return null;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }
    
    public DeliveryMan createDeliveryMan(String deliverymanName, String deliverymanUsername, String deliverymanPassword, String deliverymanAddress, String deliverymanNunber) {
        deliveryMan = new DeliveryMan(deliverymanName, deliverymanUsername, deliverymanPassword, deliverymanAddress, deliverymanNunber);
        deliverymanList.add(deliveryMan);
        return deliveryMan;
    }
    
    public void deleteDeliveryMan(String deliverymanUsername) {
        for(int i=0; i<deliverymanList.size(); i++) {
            if(deliverymanList.get(i).getDeliverymanUsername() == deliverymanUsername) {
                deliverymanList.remove(i);
            }
        }
    }
    
    public void updateDeliveryman(DeliveryMan deliveryMan, String deliverymanName, String deliverymanUsername, String deliverymanPassword, String deliverymanAddress, String deliverymanNunber) {
        for(DeliveryMan deliveryPerson: deliverymanList) {
            if(deliveryPerson.getDeliverymanUsername().equalsIgnoreCase(deliverymanUsername)) {
                deliveryMan.deliverymanName = deliverymanName;
                deliveryMan.deliverymanUsername = deliverymanUsername;
                deliveryMan.deliverymanPassword = deliverymanPassword;
                deliveryMan.deliverymanAddress = deliverymanAddress;
                deliveryMan.deliverymanNumber = deliverymanNunber;
            }
        }
    }
}
