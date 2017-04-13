package data_inheritance;

/**
 * Created by RXC8414 on 4/12/2017.
 */
public class PolyClassA extends PolyClassB {
    public String name;

    public void identify(){
        System.out.println("ID:"+getId()+" Name:"+name);
    }

    public void setId(int id1){
        id = id1;
    }
}
