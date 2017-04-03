package methods_encapsulation_conditionals.encapsulation;

/**
 * Created by RXC8414 on 4/3/2017.
 */
public class Main {
    public static void main(String[] args) {
        Utilities util = new Utilities();
        UtilitiesOverloadedConstructors util2 = new UtilitiesOverloadedConstructors(10,20,30);

        //util.setStrTeam("Team12");
        //System.out.println(util.getStrTeam());
        //util.printMessage();

        util2.printValues();
    }
}
