/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segrepassbd;

/**
 *
 * @author Alessio Spina
 */
public class MainSegrepass {
    
    
    protected static Login login;
    protected static Interfaccia_Grafica frame;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        
        login=new Login(); // creo la finestra del login
        frame = new Interfaccia_Grafica(); // creo la finestra principale
        
        login.setVisible(true);
        
        
        
    }
    
}
