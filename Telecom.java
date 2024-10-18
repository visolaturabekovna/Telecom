package Phone;

import java.util.ArrayList;

public class Telecom {
    private static String name;
    private String nameCustomer;
    private String telNumber;
    private double balanceCustomer=0;
    ArrayList<String> telNumList=new ArrayList<String>();
    public Telecom(String nameCustomer){
        this.nameCustomer=nameCustomer;
    };
    public void addTelNum(String telNumber){
        if (balanceCustomer>1) {
            if (telNumber.length() == 13 ){
                telNumList.add(telNumber);
                balanceCustomer -= 1;
            }
            else System.out.print("+998XXYYYYYYY formatda kiriting");
        }
        else System.out.println("Yetarli mablag' mavjud emas");
    }
    public void getTelNum(){
        for (String s:telNumList){
            System.out.println(s);
        }
    }

    public void paynet(double pay){
        balanceCustomer+=pay;
        System.out.println("Balansingizda "+pay+" $ pul tushdi. Joriy balans: "+balanceCustomer+"$");
    }
    public double getBalanceCustomer(){
        return balanceCustomer;
    }
    public void deleteNum(String telNumber){
            telNumList.remove(telNumber);
    }

}
