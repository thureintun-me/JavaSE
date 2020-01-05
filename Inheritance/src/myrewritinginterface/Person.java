package myrewritinginterface;

public class Person implements PersonInterface,PersonInterfaceAnother {

    private int cashSaving;
    private int retirementFund;
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(int cashSaving, int retirementFund, String firstName, String lastName) {
        this.cashSaving = cashSaving;
        this.retirementFund = retirementFund;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int computeTotalWealth() {
        System.out.println(cashSaving + retirementFund);
        return cashSaving + retirementFund;
    }

    @Override
    public String getName() {
        return firstName + " " + lastName;
    }

    public int getCashSaving() {
        return cashSaving;
    }

    public void setCashSaving(int cashSaving) {
        this.cashSaving = cashSaving;
    }

    public int getRetirementFund() {
        return retirementFund;
    }

    public void setRetirementFund(int retirementFund) {
        this.retirementFund = retirementFund;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void newMethod() {
        System.out.println("Adding new method...");
    }
}
