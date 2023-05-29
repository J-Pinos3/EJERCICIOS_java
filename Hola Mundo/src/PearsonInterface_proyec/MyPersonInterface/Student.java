package PearsonInterface_proyec.MyPersonInterface;

public class Student implements StudentInterface{

    private int cashSaving;
    private int retirementFound;
    private String firstName;
    private String lastName;
    private String school;


    public Student(int cashSaving, int retirementFound, String firstName,
                   String lastName, String school){

        this.cashSaving = cashSaving;
        this.retirementFound = retirementFound;
        this.firstName = firstName;
        this.lastName = lastName;
        this.school = school;
    }

    @Override
    public int computeTotalWealth(){
        return cashSaving + retirementFound;
    }


    @Override
    public String getName(){
        return firstName + " " + lastName;
    }

    @Override
    public String findSchool(){
        return school;
    }











}






