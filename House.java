/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building{
  boolean hasElevator;
  boolean hasDiningRoom;
  ArrayList <String> residents;


/**
 * 
 * @param name name of house
 * @param address adress of house
 * @param nFloors number of floor house has
 * @param hasElevator checks if the house has an elevator 
 * @param hasDiningRoom checks if the house has a dining room 
 */
  public House(String name, String address, int nFloors, boolean hasElevator, boolean hasDiningRoom) {
   // this is what "extends building" is refering to
    super(name, address, nFloors); // this is a Building
    //... with:
    this.hasElevator= hasElevator;
    this.hasDiningRoom= hasDiningRoom;
    this.residents= new ArrayList<String>();
  }

  /**
   * 
   * @param name name of house
   */
    public void moveIn(String name){
      if (this.residents.contains(name)){
        throw new RuntimeException(name + " is already a resident of the house. Please try a different name.");
      }
      else{
        this.residents.add(name); //adding resident to the house 
        System.out.println(name + " has successfully moved into the house.");
      }
    }

  /**
   * 
   * @param name name of house
   * @return recording/keeping track if resident has moved out of house
   */
    public String moveOut(String name){
      if (residents.contains(name)){
        this.residents.remove(name); //removing resident from the house 
        System.out.println("Resident " + person + " has successfully moved out.");
      }
      else{
        throw new RuntimeException(name + " is not a resident of the house and therefore cannot move out. Please try a different name.");
        return name;}
    }

  /**
   * 
   * @return recording/keeping track if the house has a dining room
   */
    public boolean hasDiningRoom(){
      if(house.contains(hasDiningRoom)){
        System.out.println(name + "has a Dining Room in this house.");
        return true;
      }
      else{
        System.out.println(name + "does not have a Dining Room in this house.");
        return false;
      }
    }

  /**
   * 
   * @return recording/keeping track if the house has an elevator
   */
  public boolean hasElevator(){
    if(house.contains(hasElevator)){
      System.out.println(name + "has a elevator in this house.");
      return true;
    }
    else{
      System.out.println(name + "does not have a elevator in this house.");
      return false;
    }
  }

  /**
   * 
   * @param person name of resident, 
   * @return checking if resident lives in the house
   */
  public boolean isResident(String person){
    if(this.residents.contains(name)){
      System.out.println(name + "is a resident in this house.");
      return true;
    }
    else{
      System.out.println(name + "is not a resident in this house.");
      return false;
    }
  }


  public static void main(String[] args) {
   House myHouse= new House("Comstock House", "1 Manning Rd", 3, true, true);
  myHouse.moveIn("Jo"); 
  myHouse.moveIn("Jade"); 
  myHouse.moveIn("Em"); 
  }

}