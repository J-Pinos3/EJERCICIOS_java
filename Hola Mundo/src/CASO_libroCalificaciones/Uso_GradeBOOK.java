package CASO_libroCalificaciones;

public class Uso_GradeBOOK {
    public static void main(String[] args) {

    int[] gradesArray = {14,22,27,30,50,56,7,90,91,95};

    GradeBook myGradeBook = new GradeBook("CS101 JAVA", gradesArray);

        System.out.printf("Welcome to %s", myGradeBook.getCourseName());

        System.out.println();

        myGradeBook.processGrades();

    }//FIN DEL MÉTODO DE MAIN
}
