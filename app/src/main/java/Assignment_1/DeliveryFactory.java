package Assignment_1;

public class DeliveryFactory {
	
   public Delivery getDelivery(String deliveryType){
      if(deliveryType == null){
         return null;
      }		
      if(deliveryType.equalsIgnoreCase("AIR")){
         return new Air();
         
      } else if(deliveryType.equalsIgnoreCase("SEA")){
         return new Sea();
         
      } else if(deliveryType.equalsIgnoreCase("GROUND")){
         return new Ground();
      }
      
      return null;
   }
}