package PearsonInterface_proyec.MyPersonInterface;

public class Person implements PersonInterface {

    int cashSaving;
    int retirementFound;
    String firstName;
    String lastName;

    Person(int cashSaving, int retirementFound, String firstName, String lastName){
        this.cashSaving = cashSaving;
        this.retirementFound = retirementFound;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Override
    public int computeTotalWealth(){
        return cashSaving + retirementFound;
    }


    @Override
    public String getName(){
        return firstName + " " + lastName;

    }


}
