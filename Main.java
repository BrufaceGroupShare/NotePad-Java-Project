/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.swing.UIManager;

/**
 *
 * @author Ho Minh Giang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            }
        catch (Exception e)
        {
        }
        Notepad notpad = new Notepad();
        notpad.setLocation(250,250);
        notpad.setVisible(true);    
        
    }

}
