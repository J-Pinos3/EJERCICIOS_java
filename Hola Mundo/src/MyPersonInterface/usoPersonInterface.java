package MyPersonInterface;

public class usoPersonInterface {
    public static void main(String[] args) {

        Person p1 = new Person(6540, 1000,"Jhon","Doe");
        PersonInterface p2 = new Person(321, 6000,"Lori","Jhonson");

        System.out.println("p1.getName(): " + p1.getName() +
                "\np1.computeTotalWealth(): " + p1.computeTotalWealth() );


        if(p2 instanceof Person){
            System.out.println("p2.getName(): " + p2.getName() +
                    "\np2.computeTotalWealth(): " + p2.computeTotalWealth() );
        }





    }
}
