import java.util.ArrayList;

class Player{
  private double balance;
  private String name;
  private ArrayList<String> cards = new ArrayList<String>();
  ArrayList<Integer> cardsValue = new ArrayList<Integer>();
  private int wins;
  private boolean isDealer;
  
  //Getters
  public double getBalance(){
    return this.balance;
    
  }
  public String getName(){
    return this.name;

  }
  public ArrayList<String> getCards(){
    return this.cards;

  } 
  public ArrayList<Integer> getCardsValue(){
    return this.cardsValue;

  }
  public int getWins(){
    return this.wins;

  }
  public boolean checkDealer(){
    return this.isDealer;
  }
  //Setters
  public void setBalance(double x){
    balance = x;

  }
  public void setName(String uname){
    name = uname;

  }
  public void addCard(String card){
    cards.add(card);

  }
  public void addCardsValue(int card){
    cardsValue.add(card);
    
  }
  //Dealer Privs
  public void makeDealer(){
    isDealer =true;

  }
  public void revokeDealer(){
    isDealer =false;
    
  }
  //Constructor
  public Player(String fname,double bal, boolean dealer) {
	  name = fname;
	  balance = bal;
	  isDealer = dealer;
  }
}