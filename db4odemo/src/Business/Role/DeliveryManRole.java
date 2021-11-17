/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DeliveryManRole.DeliveryManWorkAreaJPanel;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;

/**
 *
 * @author harold
 */
public class DeliveryManRole extends Role {

    
    /*
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new DeliveryManWorkAreaJPanel(userProcessContainer,account,business);//To change body of generated methods, choose Tools | Templates.
    }*/
    
      public  JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business){
           return new DeliveryManWorkAreaJPanel(userProcessContainer,account, 
           organization, 
           enterprise, 
            business);
    }

    public JPanel createWorkArea(JPanel pnl, UserAccount ua, EcoSystem es) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
