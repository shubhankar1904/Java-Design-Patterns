package creationalPatterns.abstractFactory;

import creationalPatterns.carFactoryPattern.CarFactory;
import creationalPatterns.colorFactoryPattern.ColorFactory;

public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("CAR")){
         return new CarFactory();
         
      }else if(choice.equalsIgnoreCase("COLOR")){
         return new ColorFactory();
      }
      
      return null;
   }
}