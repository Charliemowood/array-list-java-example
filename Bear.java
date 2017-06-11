import java.util.*;

public class Bear{

  private String name;
  private ArrayList<Edible> belly;

  public Bear(String name){
    this.name = name;
    this.belly = new ArrayList<Edible>();
  }

  public String getName(){
    return this.name;
  }

  public int foodCount(){
    // int count = 0;
    // for(Salmon salmon : belly){
    //   if(salmon != null){
    //     count++;
    //   }
    // }
    // return count;
    return this.belly.size();
  }

 //  public void eat(Salmon salmon){
 //    this.bellySalmon.add(salmon);
 //  //  if (isBellyFull()) return;
 //  //  int foodCount = foodCount();
 //  //  belly[foodCount] = salmon;
 // }

  public void eat(Edible food){
    this.belly.add(food);
  }

 // public boolean isBellyFull(){
 //   return foodCount() == this.belly.length;
 // }

 public void sleep(){
   this.belly.clear();
  //  for(int i = 0; i < belly.length; i++){
  //    belly[i] = null;
  }

  public Edible throwUp() {
    if (foodCount() > 0) {
      return this.belly.remove(0);
    }
    return null;
  }

  public int calories() {
    int total = 0;
    for(Edible edible : this.belly) {
      total+= edible.nutritionalValue();
    }
    return total;
  }
 }
 //
 // for (int i = 0; i < this.belly.length.size()); i++) {
 //   Edible food = this.belly.get(i); (like [] brackets in ruby access at index)
 //   total += food.nutritionalValue();
 // }
 // return total;
 // }
