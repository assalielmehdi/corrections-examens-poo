import java.io.Serializable;
import java.util.*;

public class Test {
  public static void main(String[] args) {
  }
}

class Professeur implements Serializable {
  // Attributs
  // - : private
  // + : public
  // # : protected
  private String nom;
  private List<Cours> mesCours;

  // Constructeurs

  // Constructeur par defaut => Constructeur sans params
  // ArrayList<> et LinkedList<>
  public Professeur() {
    mesCours = new ArrayList<>();
  }

  // Methodes
  // add(Object o) : Ajouter un element
  // remove(Object o) : Supprimer un element
  // boolean contains(Object o) : Verifier si un element existe
  // Object get(int i) : Retourne l'element d'indice i
  public void add(Cours c) {
    if (c.getProf() == null) {
      mesCours.add(c);
    }
  }

  /*
   * Nom: Prof X Cours: Algebre Lineaire POO
   */
  public String toString() {
    String description = "";
    description += "Nom: " + nom + "\n";
    description += "Cours:\n";
    // foreach : for (Type var : (tableau | list)) { ... }
    for (Cours cours : mesCours) {
      description += cours.toString() + "\n";
    }
    return description;
  }
}

class Cours implements Serializable {
  private String titre;
  private Professeur leProf;

  public Cours(String titre) {
    this.titre = titre;
  }

  public Cours(String titre, Professeur leProf) {
    this.titre = titre;
    setProf(leProf);
  }

  public Professeur getProf() {
    return leProf;
  }

  public void setProf(Professeur p) {
    if (leProf == null) {
      leProf.add(this);
      leProf = p;
    }
  }
}
