package CASO_libroCalificaciones;

public class GradeBook {

    private String courseName;
    private int[] grades;


    /*CONSTRUCTOR*/
    public GradeBook(String courseName, int[] grades){
        this.courseName = courseName;
        this.grades = grades;
    }


    /*MÉTODOS*/
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }


    /*OPERACIONES CON EL ARREGLO*/

    public void processGrades(){
        outputGrades();

        System.out.printf("%nClass average: %.2f%n", getAverage());

        System.out.printf("%nLowest grade: %d%nHighest grade: %d%n%n",
                getMinimun(), getMaximun());

        outputBarChart();
    }




    public int getMinimun(){
        int lowGrade= grades[0];

        for(int grade: grades){

            if(grade < lowGrade){
                lowGrade = grade;
            }

        }

        return lowGrade;
    }


    public int getMaximun(){
        int highGrade = grades[0];

        for(int grade : grades){
            if(grade > highGrade){
                highGrade = grade;
            }
        }

        return  highGrade;
    }


    public double getAverage(){
        int total = 0;
        for(int i = 0; i < grades.length; i++){
            total += grades[i];
        }

        return (double)total/ grades.length;
    }


    public void outputBarChart(){

        System.out.println("Grade Distribution: ");
        int[] frequency = new int[11];//para poder tener la nota 10

        for(int i = 0; i < grades.length; i++){
            //las notas van del 0 al 100, al dividirlas para 10 obtengo notas entre 1 y 10
            frequency[ grades[i]/10 ]++;
        }

        for(int i = 0; i < frequency.length; i++){
            if(i == 10){
                System.out.printf("%5d:", 100);
            }else{
                System.out.printf("%2d-%2d: ", i*10, i*10 + 9);
            }

            for(int j = 0; j < frequency[i]; j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }


    public void outputGrades(){

        System.out.printf("The grades are:%n%n");

        for(int i = 0; i < grades.length; i++){
            System.out.printf("Student %2d: %3d%n", i+1, grades[i]);
        }

    }

}//END OF CLASS GRADEBOOK
