import javax.swing.*;

public class TestCreditCard {

	public static void main(String[] args) {
		
		CreditCard[] myCards = new CreditCard[3];
		
		// *******************
		// populate the array with 3 credit cards
		// this can be done because of the implicit casting when objects are created
		// and added to the array
		
		// create an instance of MasterCrook, set IDnum and service fee amount $19.20
		myCards[ 0 ] = new MasterCrook( "654321", new Money( "$19.20" ) );
		
		// create an instance of DishonestExpress, set IDnum and interest level value
		myCards[ 1 ] = new DishonestExpress( "233445", 3 );
		
		// create an instance of MasterCrook, set IDnum and service fee amount to $39.53
		myCards[ 2 ] = new MasterCrook( "988776", new Money( "$39.53" ) );
		
		
		// *******************
		// send array to printCards() method for printing
		System.out.println( "Printing all cards in array, first time\n" );
		printCards( myCards );
		
		
		// *******************
		// charge cards 0 and 1 with some money
		((MasterCrook)myCards[ 0 ]).chargeCard( new Money("$102.17") );
		((DishonestExpress)myCards[ 1 ]).chargeCard( new Money("$13.23") );


		// *******************
		// send array to printCards() method for printing
		System.out.println( "Printing all cards in array, second time\n" );
		printCards( myCards );


		// *******************
		// attempt to pay $40.00 to card 0
		// print card 0 toString() after payment attempt if successful
		// we will pay an amount less than the balance, so this will work
		if( myCards[ 0 ].payCard( new Money( "$40.00" ) ) == true )
			System.out.println( "Payment successful on card 0. New balance is " + myCards[ 0 ].getBalance() + "\n" );
		else 
			System.out.println( "Sorry, max payment can only be " + myCards[ 0 ].getBalance() + "\n" );
		
		
		// *******************
		// spend $197.62 on card 2
		((MasterCrook)myCards[ 2 ]).chargeCard( new Money("$197.62") );
		
		
		// *******************
		// send array to printCards() method for printing
		System.out.println( "Printing all cards in array, third time\n" );
		printCards( myCards );
		
		
		// *******************
		// attempt to pay $350.00 to card 1
		// print card 1 toString() after payment attempt if successful
		// we will pay an amount greater than the balance, so this will NOT work
		if( myCards[ 1 ].payCard( new Money( "$350.00" ) ) == true )
			System.out.println( "Payment successful on card 1. New balance is " + myCards[ 1 ].getBalance() + "\n" );
		else 
			System.out.println( "Sorry, max payment can only be " + myCards[ 1 ].getBalance() + "\n" );


		// *******************
		// send array to printCards() method for printing
		System.out.println( "Printing all cards in array, fourth time\n" );
		printCards( myCards );
	}

 // ends main() method
	
	
	public static void printCards( CreditCard[] cardarray ) {
	
		String msg = "";
		
		for( int i = 0; i < cardarray.length; i++ ) {
		
			// call toString() for each CreditCard object in array
			msg += cardarray[ i ] + "\n\n";
		}
		
		msg += "***************************\n";
		System.out.println( msg );
		
	} // ends printCards() method
	
} // ends class