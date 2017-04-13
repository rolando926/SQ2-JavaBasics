package data_inheritance;

/**
 * Created by RXC8414 on 4/12/2017.
 */
public abstract class PolyClassB {
    public int id;

    public int getId() {
        return id;
    }

    // Here is the abstract method for this class
    public abstract void setId(int id);
}

