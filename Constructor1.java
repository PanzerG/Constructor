
package constructor1;


public class Constructor1 {

    
    public static void main(String[] args) {
        Account account1 = new Account();
        
        Account account2 = new Account("12345", 1000, "Umut Babalık", "babalikumut1@gmail.com", "05372021502");
        
        
        account2.paraYatir(500);
        account2.paraCekme(2000);
        
        
        
    }
    
}
