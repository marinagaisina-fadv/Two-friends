public class EmployeeUnits {

 //поиск сотрудника в массиве по его имени
 public static Employee findByName(Employee[] employees, String byName) {
       for (Employee employee : employees) {
           if (employee.getName().equals(byName)) {
              return employee;
          }
       }
       return null;
   }

    //поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static Employee findBySubstring(Employee[] employees, String substring) {
        for (Employee employee : employees) {
           if (employee.getName().contains(substring)) {
                return employee;
            }
        }
       return null;

    }

    //подсчет зарплатного бюджета для всех сотрудников в массиве
    public static double getTotalSalary(Employee[] employees) {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;


    }

    //поиск наименьшей зарплаты в массиве
    public static double minSalary(Employee[] employees) {
        if (employees.length == 0) {
            System.out.println("Can't find salary in empty array");
            return -1;
        }
       double min = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[0].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        return min;

    }

    //поиск наибольшей зарплаты в массиве
    public static double maxSalary(Employee[] employees) {
        if (employees.length == 0) {
            System.out.println("Can't find salary in empty array");
            return -1;
        }
       double max = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[0].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        return max;

    }

    //поиск наименьшего количества подчиненных в массиве менеджеров
    public static int minSubordinates(Manager[] managers) {
        if (managers.length == 0) {
            System.out.println("Can't find min");
            return -1;
        }
        int min = managers[0].getNumberOfSubordinates();
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() < min) {
                min = manager.getNumberOfSubordinates();

           }

        }
        return min;
    }
    //поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой)
    // в массиве менеджеров

}










//поиск наибольшего количества подчиненных в массиве менеджеров

//поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой)
// в массиве менеджеров


