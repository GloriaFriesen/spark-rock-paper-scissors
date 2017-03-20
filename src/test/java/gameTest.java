import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {
  @Test
  public void compare_RockVsPaper_Paper() {
    Game testGame = new Game();
    String player2win = "Computer Won";
    assertEquals(player2win, testGame.compare("rock", "paper"));
    String player1win = "You Won";
    assertEquals(player1win, testGame.compare("paper", "rock"));
  }

  @Test
  public void compare_RockVsScissors_Paper() {
    Game testGame = new Game();
    String player2win = "Computer Won";
    assertEquals(player2win, testGame.compare("scissors", "rock"));
    String player1win = "You Won";
    assertEquals(player1win, testGame.compare("rock", "scissors"));
  }

  @Test
  public void compare_PaperVsScissors_Paper() {
    Game testGame = new Game();
    String player2win = "Computer Won";
    assertEquals(player2win, testGame.compare("paper", "scissors"));
    String player1win = "You Won";
    assertEquals(player1win, testGame.compare("scissors", "paper"));
  }

  @Test
  public void compare_Tie_Paper() {
    Game testGame = new Game();
    String expected = "Tie";
    assertEquals(expected, testGame.compare("paper", "paper"));
    assertEquals(expected, testGame.compare("scissors", "scissors"));
    assertEquals(expected, testGame.compare("rock", "rock"));
  }
}
