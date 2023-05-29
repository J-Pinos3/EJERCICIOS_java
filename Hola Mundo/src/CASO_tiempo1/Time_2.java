package CASO_tiempo1;

public class Time_2 {
    private int seconds ;//segundos desde media noche

    public Time_2(){
        seconds = 0;
    }

    public void setTime(int seconds){
        if(seconds < 0){
            throw new IllegalArgumentException("Number of seconds must be a positive number");
        }
        this.seconds = seconds;
    }


    public String toUniversalTime(){
        int aux_seconds = seconds;
        int hour = aux_seconds/3600;
        aux_seconds %= 3600;
        int minute = aux_seconds/60;
        aux_seconds %= 60;

        return String.format("%02d:%02d:%02d", hour,minute,aux_seconds);
    }

    public String toString(){
        int aux_seconds = seconds;
        int hour = aux_seconds/3600;
        aux_seconds %= 3600;
        int minute = aux_seconds/60;
        aux_seconds %= 60;

        return String.format("%d:%02d:%02d:%s", ( (hour==0||hour==12)?12:hour%12 ), minute, aux_seconds, (hour < 12)?"AM":"PM");
    }


}
