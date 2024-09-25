public class Lesson_8 {
//    Написать статический метод, превращающий натуральное (целое положительное) число
//    (например, 643) в строку, состоящую из названий цифр
//    этого числа (например, “шесть четыре три”).
public static String numberToWords(int number){
    String [] digitNames ={"zero", "one", "two",
    "three", "four", "five", "six", "seven", "eight", "nine"};
    String numberString = String.valueOf(number);
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < numberString.length(); i++) {
         int digit = Character.getNumericValue(numberString.charAt(i));
        result.append(digitNames[digit]);

        if (i < numberString.length() - 1) {
            result.append(" ");
        }
    }
    return result.toString();
    }
    public static void main(String[] args) {
        int number = 643;
        System.out.println(numberToWords(number));
    }



}

