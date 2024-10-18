package Phone;

public class TestTelecom {
    public static void main(String[] args) {
        Telecom tel1=new Telecom("Ali");
        tel1.paynet(10);
        tel1.addTelNum("+998991234567");
        tel1.addTelNum("+998991255567");
        tel1.addTelNum("+998991456567");
        tel1.getTelNum();
        System.out.println(tel1.getBalanceCustomer());
        tel1.deleteNum("+998991255567");
        tel1.getTelNum();
        System.out.println(tel1.getBalanceCustomer());
    }
}
