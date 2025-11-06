public class DayType {
    public static void main(String[] args) {
        String day = "monday"; 
        switch (day) { 
            case "monday":
            case "tuesday":
                System.out.println("Early days");
                break;
            case "wednesday":
            case "thursday":
                System.out.println("Mid days");
                break;
            case "friday":
                System.out.println("End week");
                break;
            default:
                System.out.println("Weekend or Invalid day");
                break;
        }
    }
}