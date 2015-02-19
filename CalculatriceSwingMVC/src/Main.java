
import controler.*;
import model.*;
import vue.Calculette;

public class Main {

  public static void main(String[] args) {
    //Instanciation de notre modèle
    AbstractModel calc = new Calculator();
    //Création du contrôleur
    AbstractControler controler = new CalculetteControler(calc);
    //Création de notre fenêtre avec le contrôleur en paramètre
    Calculette calculette = new Calculette(controler);
    //Ajout de la fenêtre comme observer de notre modèle
    calc.addObserver(calculette);
  }
}