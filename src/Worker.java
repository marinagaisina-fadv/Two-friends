public class Worker {
    int worker;
    double baseSalary;
    double Salary;
    String name;

    public int getWorker() {
        return worker;
    }
        public void setWorker(int worker) {
        this.worker = worker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public static void main(String[] args) {

          Employee emp1 = new Employee();
//           emp1.baseSalary = 2000;
//           emp1.salary = 5000;
//           emp1.name = "Joe";

          Employee emp2 = new Employee();
//          emp2.baseSalary = 2000;
//          emp2.salary = 6000;
//          emp2.name = "Mary";
        emp2.setName("Jonh");
        String workerName = emp2.getName();
        System.out.println(emp2.getName());
        emp2.setBaseSalary(2356.75);
        String workerSalary = String.valueOf(emp2.getBaseSalary());




             Worker workers = new Worker ();









    }

}


