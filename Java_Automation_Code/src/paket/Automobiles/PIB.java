package paket.Automobiles;

public class PIB {
    private String firstName;
    private String lastName;
    private String dadName;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDadName(String dadName) {
        this.dadName = dadName;
    }

    // Getter методы для получения значений
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDadName() {
        return dadName;
    }
}

