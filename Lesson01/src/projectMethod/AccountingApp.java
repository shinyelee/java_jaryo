package projectMethod;

class Accounting { // Ŭ������ ������ �޼ҵ峢�� ��������.
	
    public static double valueOfSupply = 10000.0;
    public static double vatRate = 0.1;
 
    public static double getVAT() {
        return valueOfSupply * vatRate;
    }
    
    public static double getTotal() {
        return valueOfSupply + getVAT();
    }
    
}

public class AccountingApp {

    public static void main(String[] args) {
 
        System.out.println("Value of supply : " + Accounting.valueOfSupply);
        System.out.println("VAT : " + Accounting.getVAT());
        System.out.println("Total : " + Accounting.getTotal());
    }

}
