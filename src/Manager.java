public class Manager {

    double baseSalary;
    public String  name;
    public int numberOfSubordinates;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
    public double getSalary(){
        return getBaseSalary() * getNumberOfSubordinates() / 100 * 3;
    }

}



