package homework3;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {

        String[] swArray = {"one", "two", "three", "four", "five"};
        System.out.println(Arrays.toString(swArray));
        SwapArray sw = new SwapArray(swArray);
        sw.swapEl(1, 2);
        System.out.println(Arrays.toString(swArray));

        Box<Apple> boxOfApple = new Box<>();
        Box<Orange> boxOfOrange = new Box<>();
        Box<Apple> boxOfApple2 = new Box<>();

        boxOfApple.addFruit(new Apple());
        boxOfApple.addFruit(new Apple());
        boxOfApple.addFruit(new Apple());

        boxOfOrange.addFruit(new Orange());
        boxOfOrange.addFruit(new Orange());

        System.out.println("Before moving: ");
        System.out.println("Box of apple:" + boxOfApple.getWeight());
        System.out.println("Box of apple2:" + boxOfApple2.getWeight());
        boxOfApple2.moveFruit(boxOfApple);
        System.out.println("After moving: ");
        System.out.println("Box of apple:" + boxOfApple.getWeight());
        System.out.println("Box of apple2:" + boxOfApple2.getWeight());

        System.out.println(boxOfApple.compare(boxOfOrange));
    }
}
