package inventory.gui;

import java.util.Set;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;


/**
 *
 * @author Muhamad Ashraff
 */
public class start {
      
    public static void main(String[] args) {
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }//END IF
            }//END FOR
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) { 
            java.util.logging.Logger.getLogger(frmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }//END TRY CATCH
        
        frmSplash sp = new frmSplash();
        frmLogin login = new frmLogin();
        frmLoading loading = new frmLoading();
        

        sp.lblPecentage.setVisible(false);
        sp.jProgressBar1.setVisible(false);
        sp.jLabel2.setVisible(false);
        sp.setVisible(true);
        
        try {
        Thread.sleep(1000);
        sp.jLabel2.setVisible(true);
        Thread.sleep(2000);
        sp.lblPecentage.setVisible(true);
        sp.jProgressBar1.setVisible(true);
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(10);
                sp.lblPecentage.setText("Loading... "+Integer.toString(i)+"%");
                sp.jProgressBar1.setValue(i);
                
                if(i==15){
                Thread.sleep(500);
                }
                
                if(i==35){
                Thread.sleep(500);
                }
                
                if(i==49){
                Thread.sleep(500);
                }
                
                if(i==78){
                Thread.sleep(500);
                }
                
                
                if(i==100)
                {   
                    Thread.sleep(1000);
                    sp.lblPecentage.setVisible(false);
                    sp.jProgressBar1.setVisible(false);
                    
                    Thread.sleep(1000);
                    sp.dispose();
                    loading.setVisible(true);
                    
                    Thread.sleep(2000);
                    loading.dispose();
                    
                    Thread.sleep(100);
                    login.setVisible(true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }//END TRY CATCH
        
    }//END MAIN
    
}//END CLASS
