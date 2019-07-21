package design_pattern.behavioral.template_method;

public class TemplatePatternDemo {
   public static void main(String[] args) {

      Game game = new Basketball();
      game.play();

      Game football= new Football();
      football.play();


      Game volleyball = new Volleyball();
      volleyball.play();

   }
}
