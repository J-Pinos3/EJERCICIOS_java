package CASO_tiempo1;

public class Time1_test {
    public static void main(String[] args) {

        Time1 t1 = new Time1();
        Time1 t2 = new Time1();
        displayTime("After time object is creater", t1);
        System.out.println();

        t1.setTime(13,27,6);
        displayTime("After calling setTime", t1);
        System.out.println();

        try{
            t1.setTime(12,60,1);
        }catch (IllegalArgumentException e){
            System.out.println("MESSAGE: " + e);
            System.out.println("MESSAGE: " + e.getMessage());
        }


        displayTime("After callig setTime with invalid values", t1);

        /*
        t2.setTime(59,48,70);
        displayTime("t2",t2);
        */
    }



    private static void displayTime(String header, Time1 t){
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                header,t.toUniversalString(),t.toString());
    }

}
