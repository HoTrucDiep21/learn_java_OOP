/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currenttime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PC TGDD
 */
public class CurrentTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(currentDate);
        
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormat.format(currentDate));
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat.format(currentDate));
        
        
    }
    
}
