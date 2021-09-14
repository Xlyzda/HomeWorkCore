package homework3;

import java.util.ArrayList;

public class Box <F extends Fruit> {

    ArrayList<F> fruitBox;

    public Box() {
        fruitBox = new ArrayList<>();
    }

    public void addFruit(F fruit) {
        fruitBox.add(fruit);

    }

    public void moveFruit(Box<F> box) {
        fruitBox.addAll(box.fruitBox);
        box.fruitBox.clear();
    }

    public double getWeight() {
        if (fruitBox.isEmpty()) {
            return 0;
        } else {
            return fruitBox.get(0).getWeight() * fruitBox.size();
        }
    }

    public boolean compare(Box<?> box) {
        if (this.getWeight() == box.getWeight()) {
            return true;
        } else {
            return false;
        }


    }
}
