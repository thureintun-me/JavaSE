package mypersonmutipleinterface2;

public class Person implements MyOwnInterface {
    private String name;
    AddressInterface addressInterface;

    public Person(String name, AddressInterface addressInterface) {
        this.name = name;
        this.addressInterface = addressInterface;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public AddressInterface getAddress() {
        return addressInterface;
    }

}
