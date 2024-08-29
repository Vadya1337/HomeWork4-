//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int age = 17;
        if (age >= 18) {
            System.out.println(" ему " + age + " лет, он совершеннолетний");
        }

        if (age < 18) {
            System.out.println("ему " + age + " лет он не совершеннолетний");
        }

        // задание 2



        int temp = 3;

        if (temp > 5) {
            System.out.println("Сегодня тепло," + temp + " градусов, можно идти без шапки");
        }
        if (temp < 5) {
            System.out.println("На улице холодно," + temp + " градусов, нужно надеть шапку");
        }
            // задание 3

        int speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость равна " +speed+ ", то она привышена");
        }
        if (speed < 60) {
            System.out.println("Если скорость равна " +speed+ ", то она не привышена");
        }

        // задание 4
        int years = 22;
        if ( years > 2 && years <= 6 ) {
            System.out.println("Если возраст человека равен " +years+ " лет, то ему нужно ходить в детский сад");
        }
        if ( years > 7 && years <= 17 ) {
            System.out.println("Если возраст человека равен " +years+ " лет, то ему нужно ходить в школу");
        }
        if ( years >= 18 && years <= 24 ) {
            System.out.println("Если возраст человека равен " +years+ " лет, то ему нужно ходить в университет");
        }
        if ( years > 24 ) {
            System.out.println("Если возраст человека равен " +years+ " лет, то ему нужно ходить на работу");
        }
        // задание 5
        int vozrast = 2;
        if (vozrast < 5) {
            System.out.println( "Если возраст ребенка " + vozrast + " лет, то ему нельзя кататься на атракционнах ");
        }
        else if (vozrast > 5 && vozrast < 14) {
            System.out.println( "Если возраст ребенка " + vozrast + " лет, то ему можно кататься в сопровождении взрослых");
        }
        else {
            System.out.println( "Если возраст ребенка " + vozrast + " лет, то он может кататься самостоятельно ");
        }

        // задание 6

        int people = 30;
        if (people > 60 && people <= 102  ) {
            System.out.println("Если в вагоне " + people + " человек, то остались только стоячие места");
        } else if (people < 60 ) {
            System.out.println("В вагоне остались сидячие места");
        }else {

            System.out.println("мест нет");
        }
        int one = 1;
        int two = 2;
        int three = 3;
  boolean pervoeBolshe = one > two && one > three;
     boolean vtoroebolshe = two > one && two > three;
      if (pervoeBolshe){
      System.out.println("первое число самое большое");
  }

      else if (vtoroebolshe) {
          System.out.println("второе число самое большое");
      }
      else{
          System.out.println("третье число самое большое");
      }


    }
}