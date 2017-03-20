import java.util.Arrays;
import java.util.List;

import java.util.Random;

public class Game {
  private List<String> player1Array;
  private List<String> player2Array;

  public Game() {
    player1Array = Arrays.asList("rock", "paper", "scissors");
    player2Array = Arrays.asList("paper", "scissors", "rock");
  }

  public String compare(String player1, String player2) {
    String winner = "";

    if (player1.equals(player2)){
      winner = "Tie";
    } else if (player1Array.indexOf(player1) == player2Array.indexOf(player2)) {
      winner = "Computer Won";
    } else {
      winner = "You Won";
    }
    return winner;
  }

  public String compTurn() {
    Random rng = new Random();
    return player2Array.get(rng.nextInt(3));
  }

  public String getImage(String choice) {
    return String.format("<img src='/images/%s.jpg'/>", choice);
  }
}
