package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.carFactory.CarFactory;
import creationalPatterns.abstractFactory.colorFactory.ColorFactory;

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