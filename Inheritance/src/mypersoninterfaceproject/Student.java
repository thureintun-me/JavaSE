package mypersoninterfaceproject;

public class Student implements StudentInterface{
    private int cashSaving;
    private int retirementFund;
    private String firstName;
    private String lastName;
    private String school;

    public Student(int cashSaving, int retirementFund, String firstName, String lastName, String school) {
        this.cashSaving = cashSaving;
        this.retirementFund = retirementFund;
        this.firstName = firstName;
        this.lastName = lastName;
        this.school = school;
    }

    @Override
    public String findSchool() {
      return school ;
    }

    @Override
    public int computeTotalWealth() {
        return  cashSaving + retirementFund;
    }

    @Override
    public String getName() {
        return firstName + " " + lastName;
    }
}
