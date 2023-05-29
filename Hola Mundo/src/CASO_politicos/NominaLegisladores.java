package CASO_politicos;
import java.util.ArrayList;

public class NominaLegisladores {

    private ArrayList<Legislador> listaLegisladores;

    public NominaLegisladores(){
        listaLegisladores = new ArrayList<Legislador>();
    }


    public void agregarLegislador(Legislador legs){
        listaLegisladores.add(legs);
    }

    public void mostrarLegisladores(){
        for(Legislador legs : listaLegisladores){
            System.out.println(legs.toString() + "\n" +
                    "Trabaja en: " + legs.getCamaraenQueTrabaja());
        }
    }

}
