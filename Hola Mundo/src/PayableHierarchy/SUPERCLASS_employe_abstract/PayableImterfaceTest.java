package PayableHierarchy.SUPERCLASS_employe_abstract;

public class PayableImterfaceTest {
    public static void main(String[] args) {

        Payable[] payableObjects = new Payable[4];

        payableObjects[0] = new BasePlusComissionEmployee("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);
        payableObjects[1] = new ComissionEmployee("Louis","Jhonson","44-44-4",10000, 0.06);
        payableObjects[2] = new HourlyEmployee("John","Doe","11-11-1",16.75, 40);
        payableObjects[3] = new SalariedEmployee("Lisa","Simpson","22-22-2",800.0);

        System.out.println("Facturas y empleados procesados polimórficamente");

        for(Payable currentPayable : payableObjects){

            if(currentPayable instanceof  BasePlusComissionEmployee){
                BasePlusComissionEmployee employee = (BasePlusComissionEmployee) currentPayable;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());
            }

            System.out.printf("%n%s %n%s: $%,.2f%n",
                    currentPayable.toString(),
                    "payment due", currentPayable.getPaymentAmount() );
        }

    }
}
