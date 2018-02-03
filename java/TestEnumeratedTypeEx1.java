package tw.leonchen.myproject.oop.enumeratedtype;

enum Poker{
	spade, heart, diamond, club
}

public class TestEnumeratedTypeEx1 {

	public static void main(String[] args) {
		Poker suit = Poker.club;
		
		switch(suit) {
		   case spade:
			   System.out.println(Poker.spade);
			   break;
		   case heart:
			   System.out.println(Poker.heart);
			   break;
		   case diamond:
			   System.out.println(Poker.diamond);
			   break;
		   case club:
			   System.out.println(Poker.club);
			   break;
		   default:
			   assert false: "impossible";
			   break;
		}
		
		Poker[] suitName = Poker.values();
		
		for(Poker name: suitName) {
			System.out.println(name + ":" + name.ordinal());
		}

	}

}
