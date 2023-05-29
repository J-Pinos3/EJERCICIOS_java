package CASOcalificaciones_multidimensional;

public class TestGBook2D {
    public static void main(String[] args) {

        int[][] arrayNotas = { {87,96,70},
                               {0,12,35},
                               {68,87,90},
                               {84,100,90},
                               {7,56,37},
                               {100,81,82},
                               {83,65,85},
                               {78,85,65},
                               {91,30,75},
                               {84,73,97} };


        GradeBook2D miLibro2D = new GradeBook2D("CS102 POO", arrayNotas);
        System.out.printf("Bienvenido al libro de calificaciones para: %s%n%n", miLibro2D.getCourseName());
        miLibro2D.process_Grades2D();


    }//fin del método de main
}
