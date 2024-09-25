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


      for (Employee_1 employee : employees) {
          for (TaxPayment taxPayment : taxPayments) {
              String name = employee.getName();
              int taxRate = 0;
              if (employee.getSalary() > 10000) {
                  taxRate = 23;
              } else if (employee.getSalary() < 5000) {
                  taxRate = 18;
              } else {
                  taxRate = 13;
              }

              double incomTax = (employee.getSalary() * taxRate) / 100 - employee.numberOfChildren * 1000;
              TaxPayment taxPaymentFinal = new TaxPayment(employee.getName(), incomTax);
              taxPayment = taxPaymentFinal;


          }
      }
          return taxPayments;
      }


}

