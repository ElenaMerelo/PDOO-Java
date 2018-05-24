/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View.GUI;

import java.util.ArrayList;
import java.awt.Component;

import deepspace.HangarToUI;
import deepspace.WeaponToUI;
import deepspace.ShieldToUI;
/**
 *
 * @author antonio
 */
public class HangarView extends javax.swing.JPanel {

    HangarToUI hangar;
    /**
     * Creates new form HangarView
     */
    public HangarView() {
        initComponents();
    }

    void setHangarToUI(HangarToUI h){
                
        hangar=h;
        
        ArrayList<WeaponToUI> weapons;
        ArrayList<ShieldToUI> shields;
        
        if( h != null ){
            weapons = h.getWeapons();
            shields = h.getShieldBoosters();
            
            WeaponView wView;
            for( WeaponToUI weapon : weapons ){
                wView = new WeaponView();
                wView.setWeaponToUI(weapon);
                add( wView ); 
            }

            ShieldBoosterView sView;
            for( ShieldToUI shield : shields ){
                sView = new ShieldBoosterView();
                sView.setShieldToUI(shield);
                add( sView ); 
            }

        }
               
        revalidate();
        repaint();
    }
    
    public HangarToUI getHangar(){ return hangar; }
    
    ArrayList<Integer> getSelectedWeapons(){
        ArrayList<Integer> selectedWeapons = new ArrayList();
        int i = 0;
        for (Component c : getComponents()) {
           try{
            if (((WeaponView) c).isSelected()) {
                    selectedWeapons.add(i);
                }
            }
           catch( Exception e){}
           i++;
        }
        return selectedWeapons;        
    }
    
    ArrayList<Integer> getSelectedShields(){
        ArrayList<Integer> selectedShields = new ArrayList();
        int i = 0;
        for (Component c : getComponents()) {
           try{
            if (((ShieldBoosterView) c).isSelected()) {
                    selectedShields.add(i);
                }
            }
           catch( Exception e){}
           i++;
        }
        return selectedShields;        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setName(""); // NOI18N
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
