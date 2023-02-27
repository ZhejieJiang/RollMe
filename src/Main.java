import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        while (List.size() != 0) {
            int a = (int) (Math.random() * 6) + 1;
            int b = (int) (Math.random() * 6) + 1;

            int DiceRoll = a + b;
            System.out.println("You Rolled a " + DiceRoll + ", How many pegs do you want to remove?");
            if(SumChecker.canAddUp(List, DiceRoll)){
                int removePegAmount = scan.nextInt();
            if (removePegAmount == 1) {
                if(List.contains(DiceRoll)){
                    List.remove(List.indexOf(DiceRoll));
                    System.out.println("You have gotten rid of " + DiceRoll + ", You have " + List + "left");
                }
                else{break;}
            }
            else if (removePegAmount > 1) {
                if (SumChecker.canAddUp(List, DiceRoll)) {
                    int multiplePegRemoval = DiceRoll;
                    while (multiplePegRemoval != 0) {
                        System.out.println("You can make the number, which pins are you removing?");
                        int removedPeg = scan.nextInt();
                        if(List.contains(removedPeg)){
                            List.remove(List.indexOf(removedPeg));
                            System.out.println("You have gotten rid of " + removedPeg + ", You have " + List + "left");
                        }
                        else{break;}
                        multiplePegRemoval -= removedPeg;
                    }
                    System.out.println("You have " + List + "left");

                }
            } else {
                System.out.println("You have entered an invalid number so the game ends");
                break;
            }
            }
            else{System.out.println("You can't make the number so the game ends");
                break;}
            System.out.println("You win");
        }
    }
}




