// can use as type/class as Human or Edible
public class Human implements Edible {
  public String speak() {
    return "speaking";
  }
  public int nutritionalValue() {
    return 100;
  }
}
