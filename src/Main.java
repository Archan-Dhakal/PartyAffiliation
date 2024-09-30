import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your party affiliation [Democrat (D), Republican (R), Independent(I): ");
        String partyAffilitation;
        partyAffilitation=in.nextLine();
        if (Objects.equals(partyAffilitation, "D")){
            System.out.println("You got a democratic Donkey!");
        } else if (Objects.equals(partyAffilitation, "R")) {
            System.out.println("You got Republican Elephant!");
        } else if (Objects.equals(partyAffilitation, "I")) {
            System.out.println("You got Independent Indivisual!");
        } else {
            System.out.println("You get other!");
 }
}
}