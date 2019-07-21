package design_pattern.structural.decorator;

public class MiniCar implements Car {

   @Override
   public void create() {
      System.out.println("Car: mini");
   }
}
