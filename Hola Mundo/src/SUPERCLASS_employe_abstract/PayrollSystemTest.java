package SUPERCLASS_employe_abstract;

public class PayrollSystemTest {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.0);


        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);

        ComissionEmployee comissionEmployee =
                new ComissionEmployee("Sue", "Jones", "333-33-3333",10000, 0.06);

        BasePlusComissionEmployee basePlusComissionEmployee =
                new BasePlusComissionEmployee("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);


        System.out.println("\nEMPLOYEES PROCESSED INDIVIDUALLY"+"\n");

        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                salariedEmployee, "earned", salariedEmployee.earnings());


        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                hourlyEmployee, "earned", hourlyEmployee.earnings());


        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                comissionEmployee, "earned", comissionEmployee.earnings());


        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                basePlusComissionEmployee, "earned", basePlusComissionEmployee.earnings());




        /*Array de empleados con polimorfismo*/
        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = comissionEmployee;
        employees[3] = basePlusComissionEmployee;

        System.out.println("\nEMPLOYESS PROCESSED POLYMORPHICALLY\n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee); //invoca a toString
            if(currentEmployee instanceof BasePlusComissionEmployee){
                BasePlusComissionEmployee employee = (BasePlusComissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("new bsae salary with 10%% increase is: $%,.2f%n",
                        employee.getBaseSalary() );
            }

            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }

        for(int i = 0; i < employees.length; i++){
            System.out.printf("Employee %d is a %s%n", i, employees[i].getClass().getName());
        }

    }
}
