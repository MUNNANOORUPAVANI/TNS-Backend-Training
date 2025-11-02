//DEEMO FOR PHONE STRUCTURE 
public class PhoneStructure {
    //Variables
    int ram;
    int gb;
    String model;

    //Methods
    void poweron(){
        System.out.println("The phone is opening");
    }
    void switchoff(){
        System.out.println("The phone is Switchoff");
    }
    //Main method
    public static void main(String[] args){
        PhoneStructure ps=new PhoneStructure();
        ps.ram=8;
        ps.gb=256;
        ps.model="Realme";
        ps.poweron();
        ps.switchoff();
        System.out.println("the phone details are: " +ps.ram+ "GB RAM,"+ps.gb+ "GB STORAGE,"+ps.model);
    }
}
