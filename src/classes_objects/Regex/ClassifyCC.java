package classes_objects.Regex;

/**
 * Created by RXC8414 on 3/27/2017.
 */
public class ClassifyCC {
    public static void main(String[] args) {
        String MasterCard = "^(4444)[0-9]{12}";
        String Visa = "^(4344)[0-9]{12}";
        String Amex = "^(3777)[0-9]{12}";
        String Discover = "^(6050)[0-9]{12}";

        String[] cc = {"4444020274728877","3777757564668282","4344000011112222","6050333344445555",
        "4654000011112222"};

        for (String temp:cc) {
            if(temp.matches(MasterCard)){
                System.out.println(temp+" is a Master Card.");
            }
            else if(temp.matches(Visa)){
                System.out.println(temp+" is a Visa.");
            }
            else if(temp.matches(Amex)){
                System.out.println(temp+" is a Amex.");
            }
            else if(temp.matches(Discover)){
                System.out.println(temp+" is a Discover.");
            }
            else{
                System.out.println(temp+" is not a valid Credit Card.");
            }
        }
    }
}
