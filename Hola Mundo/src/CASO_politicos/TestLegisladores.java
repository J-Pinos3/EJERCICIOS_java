package CASO_politicos;

public class TestLegisladores {
    public static void main(String[] args) {

        Legislador leg1 = new Diputado("Carlos", "Pérez", 49, true, "Córdoba", "FPV", 506, 25);
        Legislador leg2 = new Diputado("Diego", "Ramírez", 51, false, "Buenos Aires", "PRO", 208, 95);
        Legislador leg3 = new Diputado("Alberto", "Garay", 19, false, "Formosa", "Radicalismo", 774, 104);
        Legislador leg4 = new Diputado("María", "Lopérfido", 39, true, "Neuquén", "UNEN", 225, 100);
        Legislador leg5 = new Senador("Luisina", "Brando", 62, false, "Santa Fe", "PRO", 58, 97);
        Legislador leg6 = new Senador("Nestor", "Kirchner", 61, true, "Santa Cruz", "FPV", 012, 41);
        Legislador leg7 = new Senador("Cristina", "Fernández", 60, true, "Santa Cruz", "FPV", 013, 42);
        Legislador leg8 = new Senador("Ivan", "Ochoa", 31, true, "Córdoba", "FPV", 57, 215);

        NominaLegisladores listaCongreso = new NominaLegisladores();

        listaCongreso.agregarLegislador(leg1); listaCongreso.agregarLegislador(leg2);
        listaCongreso.agregarLegislador(leg3); listaCongreso.agregarLegislador(leg4);
        listaCongreso.agregarLegislador(leg5); listaCongreso.agregarLegislador(leg6);
        listaCongreso.agregarLegislador(leg7); listaCongreso.agregarLegislador(leg8);


        listaCongreso.mostrarLegisladores();

    }
}
