import java.util.ArrayList;
import java.util.List;


class Main {
	List<Player> players =new ArrayList<Player>();
	Cards cards = new Cards();
	//Player Creation
	public void makePlayer(String username,double bal, boolean dealer) {
		Player user = new Player(username, bal, dealer);
		players.add(user);
		
		}
	//Game Functions
	public void hit(int user) {
		if(checkBust(user)>21) {
			System.out.println("Player Bust!");
		}else if(checkBust(user)<=21) {
			players.get(user).addCard(cards.generateCard());
			players.get(user).addCardsValue(cards.getCardValue());
			System.out.println("A "+ cards.getCard()+" has been drawn! \n"+players.get(user).getName()+" now has "+players.get(user).getCards()+ "\n They have " +checkBust(user));
		}	
	}
	
	public int checkBust(int user) {
		int total=0;
		for(int i =0; i< players.get(user).cardsValue.size();i++) {
			total += players.get(user).cardsValue.get(i);
		}
		return total;
	}

  public static void main(String[] args) {
	Main game = new Main();
	game.makePlayer("SteBo",6969.69,true);
	game.hit(0);
	game.hit(0);
	System.out.println(game.players.get(0).getCards());
  }
}