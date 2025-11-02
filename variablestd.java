public class variablestd {
    //instance variables
    int rollno;
    String sname;
    String branch;

    //static variables
    static String college_name="AVNIET";

    //method
    void print(){
        //Local method
        String msg="Welcome to java programming";
        System.out.println(msg);
        System.out.println("The student details are" +rollno+ " "+sname+ " "+branch+" "+college_name);
    }
    public static void main(String[] args){
        variablestd vs= new variablestd();
        vs.rollno=6684;
        vs.sname="pavani";
        vs.branch="AIML";
        vs.print();

    }


    
}
