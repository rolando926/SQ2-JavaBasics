package classes_objects;

/**
 * Created by RXC8414 on 3/21/2017.
 */
public class MainTwoObject {
    public static void main(String[] args) {
        int counter = 1;
        int lastValue = 100;
        //TwoObjects object1 = new TwoObjects();
        //TwoObjects object2 = new TwoObjects();
        //TwoObjects object3 = new TwoObjects();
        //TwoObjects object4 = new TwoObjects();

        TwoObjects[] objects = {new TwoObjects(),new TwoObjects(),new TwoObjects(),new TwoObjects()};

        //object1.value1 = 100;
        //object2.value1 = 200;
        //object3.value1 = 300;
        //object4.value1 = 400;

        for (TwoObjects tempObject:objects) {
            tempObject.value1 = lastValue;
            System.out.println("object"+(counter)+".value1="+tempObject.value1);
            lastValue = lastValue + 100;
            counter++;
        }

        //System.out.println("object1.value1="+object1.value1);
        //System.out.println("object2.value1="+object2.value1);
        //System.out.println("object3.value1="+object3.value1);
        //System.out.println("object4.value1="+object4.value1);
    }
}
