public class Director extends Manager {
 @Override
 public double getSalary() {
  if (numberOfSubordinates != 0) {
   return getBaseSalary() * getNumberOfSubordinates() / 100 * 9;
  } else{
   return super.getSalary();
  }
  }
}


