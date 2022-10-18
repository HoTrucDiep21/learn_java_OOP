/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountBank;

/**
 *
 * @author PC TGDD
 */
public class main {
    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.setCode("0325632452");
        ac1.setName("Lewiss Dang");
        ac1.setId("212456045");
        ac1.setPhoneNumber("0325632452");
        ac1.setBalance(20000000);
        
        System.out.println("code: "+ac1.getCode());
        System.out.println("name: "+ac1.getName());
        System.out.println("id: "+ac1.getId());
        System.out.println("phone: "+ac1.getPhoneNumber());
        System.out.println("balace: "+ac1.getBalance());
        
        ac1.sendMoney();
        ac1.withdrawMoney();
        
        System.out.println("code: "+ac1.getCode());
        System.out.println("name: "+ac1.getName());
        System.out.println("id: "+ac1.getId());
        System.out.println("phone: "+ac1.getPhoneNumber());
        System.out.println("balace: "+ac1.getBalance());
        
    }
}
