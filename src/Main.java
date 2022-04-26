import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Создадим мою машину");
        Car myCar = new Car(2005, "combi", "gas", "OpelAstra", "Silver");
        Comporator myComporator = new Comporator();
        System.out.println(myCar);
        myCar.changeColor("Red");
        System.out.println("Перекрасили мою машину в красный");
        System.out.println(myCar);

        System.out.println("Создадим новую машину пустым конструктором");
        Car newCar = new Car();
        System.out.println(newCar);
        newCar.changeColor("Pink");
        newCar.changeYearsOfProd(2021);
        System.out.println("Частично определили её свойства");
        System.out.println(newCar);

        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        String[] word3 = {"abc", "d", "defg"};
        String[] word4 = {"abcddefg"};
        System.out.println("Сравнения массивов " + Arrays.toString(word1) + " и " + Arrays.toString(word2));
        System.out.print("Результат:");
        System.out.println(myComporator.arrayStringComporator(word1, word2));
        System.out.println("Сравнения массивов " + Arrays.toString(word3) + " и " + Arrays.toString(word4));
        System.out.print("Результат:");
        System.out.println(myComporator.arrayStringComporator(word3, word4));
    }

}
