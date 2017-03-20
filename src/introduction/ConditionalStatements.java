package introduction;

/**
 * Created by RXC8414 on 3/16/2017.
 */
public class ConditionalStatements {
    public static void main(String[] args) {
        // This is step #1
        int score = 59;

        // This is step #2
        if(score >= 90){
            System.out.println("Your grade is A...");
        }
        else if(score >= 80 && score <=89){
            System.out.println("Your grade is B...");
        }

        else if(score >= 70 && score <=79){
            System.out.println("Your grade is C...");
        }
        else if(score >= 60 && score <=69){
            System.out.println("Your grade is D...");
        }
        else {
            if (score >= 0)
                System.out.println("Your grade is F...");

            else {
                System.out.println(score + " is an invalid score. Please use another score.");
            }
        }
    }
}
