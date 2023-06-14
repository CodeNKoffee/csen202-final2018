// Exercise 4B & C
public class Building {
  String name;
  Apartment[] apt;
  int max;

  public Building(
    String name,
    int max
  ) {
    this.name = name;
    this.max = max;
    // Create the array of apartments for each floor in building:
    this.apt = new Apartment[max];
  }

  public void addApt(Apartment ap) {
    if (apt[max - 1] != null) {
      System.out.println("Errr! Sorry, at full capacity.");
      return;
    }

    for (int i = 0; i < max; i++) {
      if (apt[i] == null) {
        apt[i] = ap;
        return;
      }
      if (apt[i].floor == ap.floor && apt[i].aptNum == ap.aptNum) {
        System.out.println("The apartment already exists");
        return;
      }
    }
  }

  public Apartment[] generateFloor(int level) {
    int c = 0;
    for (int i = 0; i < max; i++) {
      if (apt[i] != null && apt[i].floor == level) {
        c++;
      }
    }

    Apartment[] a = new Apartment[c];
    int j = 0;
    for (int i = 0; i < max; i++) {
      if (apt[i] != null && apt[i].floor == level) {
        a[j] = apt[i];
        j++;
      }
    }

    return a;
  }

  public String toString() {
    String temp = "Building name: " + name + "\n";
    for(int i = 0; i < max; i++) {
      if (apt[i] != null) {
        temp += apt[i] + "\n";
      }
    }
    return temp;
  }

  public static void main(String[] args) {
    Apartment t = new Apartment(8,4,3,3,4500);
    Apartment u = new Apartment(10,3,2,4,3500);
    Apartment v = new Apartment(6,4,3,2,4500);
    Apartment w = new Apartment(18,5,3,6,5500);
    Apartment x = new Apartment(7,3,3,3,4000);
    Building b = new Building("City Lights", 50);
    b.addApt(t);
    b.addApt(u);
    b.addApt(v);
    b.addApt(w);
    b.addApt(x);
    Apartment[] a = b.generateFloor(3);
    System.out.println("Apartments in floor:");
    for(int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    } 
  }
}
