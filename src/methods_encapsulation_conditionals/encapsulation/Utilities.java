package methods_encapsulation_conditionals.encapsulation;

/**
 * Created by RXC8414 on 4/3/2017.
 */
public class Utilities {
    private String strTeam;

    Utilities(){
        strTeam = "No Team";
    }

    public String getStrTeam() {
        return strTeam;
    }

    public void setStrTeam(String strTeam) {
        String str = "Team1,Team2,Team3";
        if(str.contains(strTeam)) {
            this.strTeam = strTeam;
        }
        else{
            System.out.println(strTeam+" is an invalid team. Class will use default value of 'No Team'.");
        }
    }

    public void printMessage(){
        System.out.println("This is "+strTeam+"!");
    }
}
