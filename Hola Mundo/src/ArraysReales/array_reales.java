package ArraysReales;

public class array_reales implements Estadisticas{
    double[] valor = new double[10];

    public void asignarValores(){
        for(int i = 0; i < valor.length; i++){
            valor[i] = Math.random();
        }
    }

    @Override
    public double minimo() {
        double menor = valor[0];
        for(double val : valor){
            if(val < menor){
                menor = val;
            }
        }
        return menor;
    }



    @Override
    public double maximo() {
        double mayor = valor[0];
        for(double val : valor){
            if(val > mayor){
                mayor = val;
            }
        }
        return mayor;
    }


    @Override
    public double sumatorio() {
        double suma = 0;
        for(double val : valor){
            suma += val;
        }
        return suma;
    }


    public void mostrarDatos(){
        for(int i = 0; i < valor.length; i++){
            System.out.print(valor[i] + " ");
        }
        System.out.println("\nMínimo valor: " + minimo());
        System.out.println("Máximo valor: " + maximo());
        System.out.println("Sumatorio: " + sumatorio());
    }

}
