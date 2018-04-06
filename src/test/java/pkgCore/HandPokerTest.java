package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class HandPokerTest {


	@Test
	public void FourOfAKindTest1() {
		System.out.println("Four of a Kind");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.TWO));
		hp.AddCard(new Card(eSuit.SPADES,eRank.TWO));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.ScoreHand();
		assertEquals(hp.isFourOfAKind(),true);
	}
	@Test
	public void FourOfAKindTest2() {
		System.out.println("Four of a Kind");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.FOUR));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.THREE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FOUR));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.FOUR));
		hp.ScoreHand();
		assertEquals(hp.isFourOfAKind(),false);
	}
	
	@Test
	public void ThreeOfAKindTest1() {
		System.out.println("Three of a Kind");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.TWO));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.ScoreHand();
		assertEquals(hp.isThreeOfAKind(),true);
	}
	@Test
	public void ThreeOfAKindTest2() {
		System.out.println("Three of a Kind");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.FOUR));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.TWO));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.ScoreHand();
		assertEquals(hp.isThreeOfAKind(),false);
	}
	@Test
	public void TwoPairTest1() {
		System.out.println("Two Pair");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.ScoreHand();
		assertEquals(hp.isTwoPair(),true);
	}
	@Test
	public void TwoPairTest2() {
		System.out.println("Two Pair");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FOUR));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.ScoreHand();
		assertEquals(hp.isTwoPair(),false);
	}
	@Test
	public void TwoPairTest3() {
		System.out.println("Two Pair");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.ACE));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.THREE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.ScoreHand();
		assertEquals(hp.isTwoPair(),true);
	}
	
	@Test
	public void FullHouseTest1() {
		System.out.println("Full House");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.FIVE));
		hp.ScoreHand();
		
		assertEquals(hp.isFullHouse(),true);
	}
	@Test
	public void FullHouseTest2() {
		System.out.println("Full House");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.SEVEN));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.EIGHT));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.NINE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.TEN));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.JACK));
		hp.ScoreHand();
		
		assertEquals(hp.isFullHouse(),false);
	}
	@Test
	public void FullHouseTest3() {
		System.out.println("Full House");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.ACE));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.FIVE));
		hp.ScoreHand();
		
		assertEquals(hp.isFullHouse(),true);
	}
	@Test
	public void HighCardTest1() {
		System.out.println("High Card");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.THREE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.SIX));
		hp.ScoreHand();
		
		assertEquals(hp.isHighCard(),true);
	}
	@Test
	public void HighCardTest2() {
		System.out.println("High Card");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.THREE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.SIX));
		hp.ScoreHand();
		
		assertEquals(hp.isHighCard(),true);
	}
	@Test
	public void HighCardTest3() {
		System.out.println("High Card");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.THREE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.SIX));
		hp.ScoreHand();
		
		assertEquals(hp.isHighCard(),true);
	}
	@Test
	public void HighCardTest4() {
		System.out.println("High Card");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.THREE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.SIX));
		hp.ScoreHand();
		
		assertEquals(hp.isHighCard(),true);
	}
	@Test
	public void HighCardTest5() {
		System.out.println("High Card");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.THREE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.SIX));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.ScoreHand();
		
		assertEquals(hp.isHighCard(),true);
	}
	@Test
	public void PairTest1() {
		System.out.println("Pair");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.TWO));
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.SIX));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.ScoreHand();
		
		assertEquals(hp.isPair(),true);
	}
	@Test
	public void PairTest2() {
		System.out.println("Pair");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.TWO));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.SIX));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.ScoreHand();
		
		assertEquals(hp.isPair(),true);
	}
	@Test
	public void PairTest3() {
		System.out.println("Pair");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.SIX));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.TWO));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.ScoreHand();
		
		assertEquals(hp.isPair(),true);
	}
	@Test
	public void PairTest4() {
		System.out.println("Pair");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.SPADES,eRank.FIVE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.SIX));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.TWO));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.TWO));
		hp.ScoreHand();
		
		assertEquals(hp.isPair(),true);
	}

	@Test
	public void StraightTest1() {
		System.out.println("Straight");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.THREE));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.FOUR));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.FIVE));
		hp.AddCard(new Card(eSuit.SPADES,eRank.SIX));
		hp.ScoreHand();
		
		assertEquals(hp.isStraight(),true);
	}
	@Test
	public void StraightTest2() {
		System.out.println("Straight");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TEN));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.JACK));
		hp.AddCard(new Card(eSuit.HEARTS,eRank.KING));
		hp.AddCard(new Card(eSuit.DIAMONDS,eRank.QUEEN));
		hp.AddCard(new Card(eSuit.SPADES,eRank.ACE));
		hp.ScoreHand();
		
		assertEquals(hp.isStraight(),true);
	}
	@Test
	public void FlushTest() {
		System.out.println("Flush");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TEN));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.JACK));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.KING));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.QUEEN));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.ScoreHand();
		
		assertEquals(hp.isFlush(),false);
	}
	@Test
	public void FlushTest2() {
		System.out.println("Flush");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TEN));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.JACK));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.KING));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.QUEEN));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.ScoreHand();
		
		assertEquals(hp.isFlush(),false);
	}
	@Test
	public void RoyalFlushTest() {
		System.out.println("Royal Flush");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TEN));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.JACK));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.QUEEN));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.KING));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.ScoreHand();
		
		assertEquals(hp.isRoyalFlush(),true);
	}
	@Test
	public void RoyalFlushTest2() {
		System.out.println("Royal Flush");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TEN));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TWO));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.QUEEN));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.KING));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.ScoreHand();
		
		assertEquals(hp.isRoyalFlush(),false);
	}
	@Test
	public void StraightFlushTest() {
		System.out.println("Straight Flush");
		System.out.println("");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.NINE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TEN));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.JACK));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.KING));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.QUEEN));
		hp.ScoreHand();
		
		assertEquals(hp.isStraightFlush(),true);
	}
	@Test
	public void StraightFlushTest2() {
		System.out.println("Straight Flush");
		HandPoker hp = new HandPoker();
		hp.AddCard(new Card(eSuit.CLUBS,eRank.ACE));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.TEN));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.JACK));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.KING));
		hp.AddCard(new Card(eSuit.CLUBS,eRank.QUEEN));
		hp.ScoreHand();
		
		assertEquals(hp.isStraightFlush(),false);
	}
}
