import static org.junit.Assert.assertEquals;
import org.junit.*;
import static org.junit.Assert.assertNotNull;

public class BearTest{
  Bear bear;
  Salmon salmon;
  Human human;
  Chicken chicken;

  @Before
  public void before() {
    bear = new Bear("Baloo");
    salmon = new Salmon();
    human = new Human();
    chicken = new Chicken();
  }

  @Test
  public void hasName(){
    assertEquals("Baloo", bear.getName());
  }

  @Test
  public void bellyStartsEmpty(){
    assertEquals(0, bear.foodCount());
  }

  @Test
  public void canEatSalmon(){
    bear.eat(salmon);
    assertEquals(1, bear.foodCount());
  }

  @Test public void canEatChicken(){
    bear.eat(chicken);
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void canEatHuman() {
    bear.eat(human);
    assertEquals(1, bear.foodCount());
  }

  // @Test
  // public void bellyIsFull(){
  //   for(int i = 0; i<5; i++){
  //     bear.eat(salmon);
  //   }
  //   assertEquals(bear.isBellyFull(), true);
  // }

  // @Test
  // public void canNotEatSalmonWhenBellyFull(){
  //   for(int i = 0; i<10; i++){
  //     bear.eat(salmon);
  //   }
  //   assertEquals(5, bear.foodCount());
  // }

  @Test
  public void shouldEmptyBellyAfterSleeping(){
    bear.eat(salmon);
    bear.eat(human);
    bear.sleep();
    assertEquals(0, bear.foodCount());
  }

  @Test
  public void canThrowUp() {
    bear.eat(salmon);
    Edible food = bear.throwUp();
    assertNotNull(food);
  }

  @Test
  public void canThrowUpHuman() {
    bear.eat(human);
    Edible food = bear.throwUp();
    Human original = (Human) food;
    assertEquals("speaking", original.speak());
  }

  @Test
  public void chickenCanCluck() {
    assertEquals("clucking", chicken.cluck());
  }

  @Test
  public void canThrowUpChicken() {
    bear.eat(chicken);
    Edible food = bear.throwUp();
    Chicken original = (Chicken) food;
    assertEquals("clucking", original.cluck());
  }

  @Test
  public void canDisplayTotalCalories() {
    bear.eat(chicken);
    bear.eat(human);
    bear.eat(salmon);
    assertEquals(600, bear.calories());
  }

  @Test
  public void canDisplayTotalCaloriesDifferent() {
    bear.eat(chicken);
    bear.eat(chicken);
    bear.eat(chicken);
    assertEquals(900, bear.calories());
  }

}
