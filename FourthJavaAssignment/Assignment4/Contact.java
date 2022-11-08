class Contact {
    // Data Members
    private String name;   // The name of this person
    private long number;    // The age of this person

    public Contact() {
        this("name", 00);
    }

    public Contact(String name, long number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {

        return name;
    }

    public long getNumber() {

        return number;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setNumber(long number) {

        this.number = number;
    }
    // override toString
    public String toString() {

        return "Name: " + getName()+ "\tAge: " + getNumber();
    }
}
