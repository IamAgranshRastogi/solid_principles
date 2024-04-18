package iv_interface_segregation_principle;
/*
  
 * ISP: do not force any client to implement an interface which is irrelevant to them“
  
*/


public interface UPIPayments {
    public void payMoney();
    public void getScratchCard();
}

/* 
Google Pay support these features so he can directly implement this UPIPayments 
but Paytm doesn’t support getCashBackAsCreditBalance() feature 
so here we shouldn’t force client paytm to override this method 
by implementing UPIPayments .
*/ 