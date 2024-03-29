package constructor1;

import jdk.nashorn.internal.ir.BreakNode;

public class Account {

    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNO;

    public Account(String isim,String email,String telefonNo){
   /* this.isim = isim;
    this.email = email;
    this.telefonNO = telefonNo;
    
    
    this.bakiye = 0.0;
    this.hesapNo = "Bilgi yok"; */
   
   this("Bilgi yok", 0.0, isim, email, telefonNo);
    }
    
    
    public Account() {
       /* this.hesapNo = "Bilgi yok";
        this.bakiye = 0.0;
        this.isim = "Bilgi yok";
        this.telefonNO = "Bilgi yok";
        this.email = "Bilgi yok"; */
       // System.out.println("Kendi yazdigimiz constructor......");
       
       this("Bilgi yok",0.0, "Bilgi yok", "Bilgi yok", "Bilgi yok");
    }

    public Account(String hesapNo,double bakiye,String isim,String email,String telefonNo) {
         this.hesapNo = hesapNo;
         this.bakiye = bakiye;
         this.isim = isim;
         this.telefonNO = telefonNo;
         this.email = email;
    }
    
    public void bilgileriGoster(){
        System.out.println("Hesap no : " + hesapNo);
        System.out.println("Bakiye : " + bakiye);
        System.out.println("email : " + email);
        System.out.println("Telefon no : " + telefonNO);
        System.out.println("İsim : " + isim);
    }

    public void paraYatir(double miktar) {
        bakiye += miktar;

        System.out.println("Yeni bakiye : " + bakiye);
    }

    public void paraCekme(double miktar) {
        if (miktar > 1500) {
            System.out.println("1 günde 1500 TL den fazla para cekemezsiniz...");

        }
        if (bakiye - miktar < 0) {
            System.out.println("Yeterli bakiye yok ..." + bakiye);

        } else {
            bakiye -= miktar;
            System.out.println("Yeni bakiye : " + bakiye);
        }

    }

    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNO
     */
    public String getTelefonNO() {
        return telefonNO;
    }

    /**
     * @param telefonNO the telefonNO to set
     */
    public void setTelefonNO(String telefonNO) {
        this.telefonNO = telefonNO;
    }
}
