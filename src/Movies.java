import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Movies {
    public static void main(String[] args){
        //Variables
        ArrayList<String> movies = new ArrayList<>();
        Scanner kybd = new Scanner(System.in);

        movies.add("No Movies");

        String userInput = " ";
        Random random = new Random();
        int randNum = 0;

        //Loop
        while(userInput != "q"){
            System.out.print("Enter a movie (Press 'Q' to quit): ");
            userInput = kybd.nextLine();

            if(userInput.equals("q") || userInput.equals("Q")){
                userInput = "q";
            }
            else{
                movies.add(userInput);
                movies.remove("No Movies");
            }
        }

        randNum = random.nextInt(movies.size());

        System.out.println("Here is your list of movies: " + movies);
        System.out.println("I suggest you watch: " + movies.get(randNum));
        System.out.println("Program Done!");

    }
}
