import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/game", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Game game = new Game();
      String compChoice = game.compTurn();
      String userChoice = request.queryParams("choice");
      String winner = game.compare(userChoice, compChoice);
      model.put("game", game);
      model.put("userChoice", userChoice);
      model.put("compChoice", compChoice);
      model.put("winner", winner);
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
