package v_dependency_inversion_principle;

/*

 * The principle states that we must use abstraction (abstract classes and interfaces)
   instead of concrete implementations. 
   
 * DIP:  "High-level modules should not depend on the low-level module
        but both should depend on the abstraction."

 */

public class ShoppingMall {
    
    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {

       // DebitCard debitCard=new DebitCard();
       // CreditCard creditCard=new CreditCard();
        BankCard bankCard=new CreditCard();
        ShoppingMall shoppingMall=new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}


/*
 
 * You go to a local store to buy something, and you decide to pay for it by using your card. 
   So, when you give your card to the clerk for making the payment, 
   the clerk doesn’t bother to check what kind of card you have given.
 
 * Even if you have given a debit card or credit card it not even matter, they will simply swipe it.
   This is what the abstraction between clerk and you to relay on Card processing
 
*/