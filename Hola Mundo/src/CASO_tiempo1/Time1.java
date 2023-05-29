package CASO_tiempo1;

public class Time1 {
    private int hour; // 0 - 23
    private int minute;// 0 - 59
    private int second;// 0 - 59

    public void setTime(int hour, int minute, int second){
        if(hour<0 || hour>=24 || minute<0 || minute>=60  || second<0 || second>=60){
            throw new IllegalArgumentException("hour/minute or second was out of a valid range");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    //convierte el string a formato universal de tiempo (HH:MM:SS)
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d",hour, minute, second);
    }

    //convierte el string a formato estándar de tiempo (H:MM:SS: AM o PM)
    public String toString(){
        return String.format( "%d:%02d:%02d:%s",((hour==0||hour==12)?12:hour%12), minute, second, (hour < 12)?"AM":"PM" );
    }




}///FIN DE LA CLASE TIME1
