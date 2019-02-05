
public class FactoryForme {
	
   //utilise getForme method pour prendre l'objet ode type Forme 
   public Forme getForme(String FormeType){
      if(FormeType == null){
         return null;
      }		
      if(FormeType.equalsIgnoreCase("CERCLE")){
         return new Cercle();
         
      } else if(FormeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      } else if(FormeType.equalsIgnoreCase("Carré")){
         return new Carré();
      }
      
      return null;
   }
}
