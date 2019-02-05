
public class PatternFactory {

   public static void main(String[] args) {
      FactoryForme shapeFactory = new FactoryForme();

      //Prend un objet de Cercle et appele sa methode dessine.
      Forme shape1 = shapeFactory.getForme("CERCLE");

      //Appele la methode de Cercle
      shape1.dessine();

      //Prend un objet de Rectangle et appele dessine.
      Forme shape2 = shapeFactory.getForme("RECTANGLE");

      //Appele la methode dessine de Rectangle
      shape2.dessine();

      //Prend un objet de Carré et appele sa methode dessine.
      Forme shape3 = shapeFactory.getForme("Carré");

      //appel dessine method de cercle
      shape3.dessine();
   }
}