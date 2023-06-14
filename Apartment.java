// Exercise 4A
public class Apartment {
  int aptNum, bedroomNum, bathroomNum, floor, rent;

  public Apartment(
    int aptNum,
    int bedroomNum,
    int bathroomNum,
    int floor,
    int rent
  ) {
    this.aptNum = aptNum;
    this.bedroomNum = bedroomNum;
    this.bathroomNum = bathroomNum;
    this.floor = floor;
    this.rent = rent;
  }

  public String toString() {
    return "Apartment Number: "+ this.aptNum +"\n"
        + "Number of bedrooms: "+ this.bedroomNum +"\n"
        + "Number of bathrooms: "+ this.bathroomNum +"\n"
        + "Floor number: "+ this.floor +"\n"
        + "Rent: "+ this.rent; 
  }

  public static void main(String[] args) {
    // Create an apartment object with the following parameters
    Apartment myApt1 = new Apartment (
      2035,
      6,
      7,
      8,
      900);
      System.out.println("My first apartment is:");
      System.out.print(myApt1+"\n");
  }
}
