import java.util.ArrayList;

public class Cards{
  ArrayList<String> cardSuite = new ArrayList<String>();
  ArrayList<String> cardsPlayed = new ArrayList<String>();
  ArrayList<Integer> cardsPlayedValue = new ArrayList<Integer>();
  private int cardValue;
  private String card;
  private String cardSuiteVal;

  //Card Suite Pop
  public void makeSuites() {
	  cardSuite.add("Heart");
	  cardSuite.add("Diamond");
	  cardSuite.add("Spade");
	  cardSuite.add("Club");
  }
  //Generators
  public int generateCardValue(){
    cardValue =(int)(Math.random() *10) +1;
    return cardValue;
  }
  
  public String generateCard(){
    generateCardValue();
    String suite =getRandomSuite();
    if(cardValue ==1){
        card = "Ace of " + suite;
      }
     else if(cardValue == 10){
      String[] faces = {"Jack" ,"King", "Queen"};
      int randomFace =(int)(Math.random()*2)+0;
      card = faces[randomFace] + " of " + suite;
    }
    else{
       card = cardValue + " of  " + suite;
    }
    cardsPlayed.add(getCard());
    cardsPlayedValue.add(getCardValue());
    return card;
  }
  public String getRandomSuite()
    {
	  if(cardSuite.size() <=0) {
		  makeSuites();
	  }
       cardSuiteVal =cardSuite.get((int)(Math.random()*cardSuite.size()));
       return cardSuiteVal;
    }
  
  //Getters
  public String getCard() {
	  return card;
	  
  }
  
  public int getCardValue() {
	  return cardValue;
  }
}