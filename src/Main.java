//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int age = 9;
        if (age >= 18) {
            System.out.println(" ему " + age + " лет, он совершеннолетний");
        } else
        {
            System.out.println("ему " + age + " лет он не совершеннолетний");
        }

        // задание 2


        int temp = 10;

        if (temp > 5) {
            System.out.println("Сегодня тепло," + temp + " градусов, можно идти без шапки");
        }
        else {
            System.out.println("На улице холодно," + temp + " градусов, нужно надеть шапку");
        }
        // задание 3

        int speed = 30;
        if (speed > 60) {
            System.out.println("Если скорость равна " + speed + ", то она привышена");
        }
        else  {
            System.out.println("Если скорость равна " + speed + ", то она не привышена");
        }

        // задание 4
        int years = 22;
        if (years > 2 && years <= 6) {
            System.out.println("Если возраст человека равен " + years + " лет, то ему нужно ходить в детский сад");
        }
        else if (years > 7 && years <= 17) {
            System.out.println("Если возраст человека равен " + years + " лет, то ему нужно ходить в школу");
        }
        else if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + " лет, то ему нужно ходить в университет");
        }
        else {
            System.out.println("Если возраст человека равен " + years + " лет, то ему нужно ходить на работу");
        }
        // задание 5
        int vozrast = 22;
        if (vozrast < 5) {
            System.out.println("Если возраст ребенка " + vozrast + " лет, то ему нельзя кататься на атракционнах ");
        } else if (vozrast > 5 && vozrast < 14) {
            System.out.println("Если возраст ребенка " + vozrast + " лет, то ему можно кататься в сопровождении взрослых");
        } else {
            System.out.println("Если возраст ребенка " + vozrast + " лет, то он может кататься самостоятельно ");
        }

        // задание 6

        int peoplePridet = 122;
        if (peoplePridet > 60 && peoplePridet <= 102) {
            System.out.println("Если в вагоне " + peoplePridet + " человек, то остались только стоячие места");
        } else if (peoplePridet < 60) {
            System.out.println("В вагоне остались сидячие места");
        } else {

            System.out.println("мест нет");
        }
        int one = 1;
        int two = 2;
        int three = 3;
        boolean pervoebolshe = one > two && one > three;
        boolean vtoroebolshe = two > one && two > three;
        if (pervoebolshe) {
            System.out.println("первое число самое большое");
        } else if (vtoroebolshe) {
            System.out.println("второе число самое большое");
        } else {
            System.out.println("третье число самое большое");
        }


    }
}