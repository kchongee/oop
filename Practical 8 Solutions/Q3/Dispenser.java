public class Dispenser implements Comparable{
  private String drink;
  private int quantity;
  private double price;

  public Dispenser() {
  }

  public Dispenser(String drink, int quantity, double price){
  	this.drink = drink;
   	this.quantity = quantity;
   	this.price = price;
  }
  
  public String getDrink() {
  	return drink;
  }

  public int getQuantity(){
    	return quantity;
  }

  public double getPrice(){
   	return price;
  }
  
  public boolean soldOut() {
  	return quantity == 0;
  }

  public void makeSale(){
        quantity--;
  }

  public int compareTo(Object obj){
      
      Dispenser temp = (Dispenser)obj;

      return this.drink.compareTo(temp.drink);
      
  }

}