package CASOcalificaciones_multidimensional;

public class GradeBook2D {
    private String courseName;
    private  int[][] grades;


    public GradeBook2D(String courseName, int[][] grades){
        this.courseName = courseName;
        this.grades = grades;
    }



    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void process_Grades2D(){
        outputGrades2D();

        System.out.printf("%n%s %d%n%s %d%n%n",
                "La nota más baja del libro de calificaciones es: ", getMinimum2D(),
                "La nota más alta del libro de calificaciones es: ", getMaximum2D());

        outputBarChart2D();
    }


    private int getMinimum2D(){
        int lowGrade = grades[0][0];
        for(int i = 0; i < grades.length; i++){
            for(int j = 0; j < grades[i].length; j++){
                if(grades[i][j] < lowGrade){
                    lowGrade = grades[i][j];
                }
            }
        }

        return lowGrade;
    }


    private int getMaximum2D(){
        int highGrade = grades[0][0];
        for(int i = 0; i < grades.length; i++){
            for(int j = 0; j < grades[i].length; j++){
                if(grades[i][j] > highGrade){
                    highGrade = grades[i][j];
                }
            }
        }

        return highGrade;
    }


    /*DETERMINA EL PROMEDIO DE UN CONJUNTO ESPECÍFICO DE NOTAS*/
    private double getaverage2D(int[] setOfGrades){
        int total = 0;
        for(int nota : setOfGrades){
             total+=nota;
        }
        return (double)total / setOfGrades.length;
    }


    private void outputBarChart2D(){
        System.out.println("Distribución de todas las notas");
        int[] frecuencia = new int[11];

        for(int[] studentsGrades : grades){
            for(int grade : studentsGrades){
                frecuencia[grade/10]++;
            }
        }

        for(int i = 0; i < frecuencia.length; i++){
            if(i == 10){
                System.out.printf("%5d:", 100);
            }else{
                System.out.printf("%2d-%2d:", i*10, i*10 + 9);
            }

            for(int estrellas = 0; estrellas < frecuencia[i]; estrellas++){
                System.out.print("*");
            }
            System.out.println();
        }

    }//-------

    private void outputGrades2D(){
        System.out.printf("Las notas son: %n%n");
        System.out.print("               ");

        for(int i = 0; i < grades[0].length; i++){
            System.out.printf("Prueba %d  ", i+1);
        }

        System.out.println("Promedio");
        for(int student = 0; student < grades.length; student++){
            System.out.printf("Estudiante %2d", student+1);
            for(int prueba : grades[student]){
                System.out.printf("%8d", prueba);
            }

            double average = getaverage2D(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }




}//fin de la clase GradeBook2D
