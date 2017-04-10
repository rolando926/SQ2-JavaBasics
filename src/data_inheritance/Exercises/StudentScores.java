package data_inheritance.Exercises;

/**
 * Created by RXC8414 on 4/6/2017.
 */
public class StudentScores {
    public static void main(String[] args) {
        // Initialize double dimension int array 8x2 and set values

        int[][] scores = {{90,91,88,77,99,78,87,88},
                {78,85,100,110,88,99,87,99}};
        int week1Lowest = scores[0][0];
        int week1Highest = scores[0][0];
        int week2Lowest = scores[1][0];
        int week2Highest = scores[1][0];
        int weeksHighest;
        int weeksLowest;
        int arrayCounter = 1;
        double week1Average = 0;
        double week2Average = 0;
        int colbyAverage = 0;
        int debbieAverage = 0;
        int mattAverage = 0;
        int kimAverage = 0;
        int markAverage = 0;
        int johnAverage = 0;
        int ninaAverage = 0;
        int tracyAverage = 0;

        // Iterate through array using nested for loops
        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 8; col++){

        // Have conditional statement for lowest in week 1 and 2
        // HINT: Define variable for week1Lowest
                if((week1Lowest > scores[row][col]) && row == 0){
                    week1Lowest = scores[row][col];
                }

                if((week2Lowest > scores[row][col]) && row == 1){
                    week2Lowest = scores[row][col];
                }
        // Have a conditional statement for highest in week 1 and 2
        // HINT: Define variable for week1Highest
                if ((week1Highest < scores[row][col]) && row == 0){
                    week1Highest = scores[row][col];
                }
                if ((week2Highest < scores[row][col]) && row == 1){
                    week2Highest = scores[row][col];
                }

        // Add all numbers in a separate variable for average purposes
                if(row == 0){
                    week1Average = week1Average + scores[row][col];
                }

                if(row == 1){
                    week2Average = week2Average + scores[row][col];
                }

                // Calculate average for students
                switch (col){
                    case 0:
                        colbyAverage += scores[row][col];
                        break;
                    case 1:
                        debbieAverage += scores[row][col];
                        break;
                    case 2:
                        mattAverage += scores[row][col];
                        break;
                    case 3:
                        kimAverage += scores[row][col];
                        break;
                    case 4:
                        markAverage += scores[row][col];
                        break;
                    case 5:
                        johnAverage += scores[row][col];
                        break;
                    case 6:
                        ninaAverage += scores[row][col];
                        break;
                    case 7:
                        tracyAverage += scores[row][col];
                        break;
                }

        // Exit Loop
            }
        }

        // Do your print outs...
        System.out.println("Week 1 Lowest: "+week1Lowest);
        System.out.println("Week 1 Highest: "+week1Highest);
        System.out.println("Week 2 Lowest: "+week2Lowest);
        System.out.println("Week 2 Highest: "+week2Highest);

        //weeksHighest = (week1Highest >= week2Highest)? week1Highest:week2Highest;
        System.out.println("Highest Overall: "+((week1Highest >= week2Highest)? week1Highest:week2Highest));

        weeksLowest = (week1Lowest <= week2Lowest)? week1Lowest:week2Lowest;
        System.out.println("Lowest Overall: "+weeksLowest);

        System.out.println("\n******* AVERAGES ********");
        System.out.println("Week 1 Average: "+week1Average/8);
        System.out.println("Week 2 Average: "+week2Average/8);
        System.out.println("Colby's Average: "+colbyAverage/2);
        System.out.println("Debbie's Average: "+debbieAverage/2);
        System.out.println("Matt's Average: "+mattAverage/2);
        System.out.println("Kim's Average: "+kimAverage/2);
        System.out.println("Mark's Average: "+markAverage/2);
        System.out.println("John's Average: "+johnAverage/2);
        System.out.println("Nina's Average: "+ninaAverage/2);
        System.out.println("Tracy's Average: "+tracyAverage/2);
    }
}
