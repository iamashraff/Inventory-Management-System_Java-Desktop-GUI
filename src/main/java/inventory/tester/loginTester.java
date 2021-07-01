package inventory.tester;

import inventory.gui.checkLogin;

/**
 *
 * @author Muhamad Ashraff
 */
public class loginTester {
    
    public static void main(String[] args) {
        checkLogin cl = new checkLogin(1,"1");
        boolean isLoginvalid = cl.verifyLogin();
        System.out.println(isLoginvalid);
    }//END MAIN
    
    
}//END CLASS
