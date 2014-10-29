package com.pranav.enumtest;

enum Currency {
	// You can assign value to it, but for that you need to create private constructor
	RUPEE(1){
		@Override
		void country() {
			System.out.println("India");
		}
	}, 
	DOLLER(60){
		@Override
		void country() {
			System.out.println("United States");
		}
	}, EURO(90){
		@Override
		void country() {
			System.out.println("United Kingdom");
		}
	};

	private int value;

	// Private constructor to set the value
	private Currency(int value) {
		this.value = value;
	}

	// Method to get the value
	public int getValue() {
		return value;
	}

	// Method to set the value
	public void setValue(int value) {
		this.value = value;
	}
	
	
	//You can define abstract method and then override it into enum val
	abstract void country();
};

public class EnumTest {
	public static void main(String[] args) {
		System.out.println(Currency.RUPEE);
		Currency coin = Currency.DOLLER;
		// coin = 10; // Type- safe - can not assign any other value then
		// Currency.

		int newCoin = Currency.DOLLER.getValue();
		System.out.println(newCoin);
		Currency dollerCur = Currency.DOLLER;
		System.out.println(dollerCur);
		dollerCur.setValue(40);
		System.out.println(dollerCur.getValue());
		
		
		// You can use switch block with enum
		System.out.println("------------------------");
		System.out.println("Currency type");
		Currency usCoin = Currency.EURO;
	    switch (usCoin) {
	            case RUPEE:
	                    System.out.println("Rupee coin");
	                    break;
	            case DOLLER:
	                    System.out.println("Doller coin");
	                    break;
	            case EURO:
	                    System.out.println("Euro coin");
	                    break;
	    }
	    
	    // You can have get all the values of currency by 'Currency.values()'
	    System.out.println("-------------------------");
	    for (Currency val : Currency.values()) {
			System.out.println("Currency: "+ val);
		}
	    
	    System.out.println("Country");
	    System.out.println("--------------------------");
	    Currency.RUPEE.country();
	    Currency.DOLLER.country();
	    Currency.EURO.country();

	//Read more: http://javarevisited.blogspot.com/2011/08/enum-in-java-example-tutorial.html#ixzz3E6IpOven
	}
}
