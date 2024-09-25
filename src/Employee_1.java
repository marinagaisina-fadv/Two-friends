public class Employee_1 {
    //    Создать класс Employee , в котором хранится информация о сотруднике предприятия:
//    имя, месячная зарплата, количество детей.
    String name;
    double salary;
    int numberOfChildren;

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public Employee_1(String name, double salary, int numberOfChildren) {
        this.name = name;
        this.salary = salary;
        this.numberOfChildren = numberOfChildren;



    }

  public static TaxPayment[] employeesTaxForm(Employee_1[] employees) {
      TaxPayment[] taxPayments = new TaxPayment[employees.length];

      for (int i=0; i<employees.length; i++) {
              //String name = employee.getName();
              int taxRate;
              if (employees[i].getSalary() > 10000) {
                  taxRate = 23;
              } else if (employees[i].getSalary() < 5000) {
                  taxRate = 18;
              } else {
                  taxRate = 13;
              }

              double incomeTax = (employees[i].getSalary() * taxRate) / 100 - employees[i].numberOfChildren * 1000;
              TaxPayment currentEmployeeTaxPayment = new TaxPayment(employees[i].getName(), incomeTax);
              taxPayments[i] = currentEmployeeTaxPayment;
      }
          return taxPayments;
      }


}

