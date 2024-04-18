package i_single_responsibility_principle;
/* 
  “a class should have only one reason to change” 
 */

/*  class BankService performs following operations:

* Withdraw
* Deposit
* Print Pass Book
* Get Loan Info
* Send OTP

*/

public class BankService{
    public long deposit(long amt, String accNo){
        // deposit amt
        return 0;
    }
    public long withdraw(long amt, String accNo){
        // withdraw amt
        return 0;
    }
    public void printpassbook(){
        //update transaction info in passbook
    }
    public void getLoanInterestInfo(String loanType){
        if(loanType.equals("homeLoan")){
            //do some job
        }
        if(loanType.equals("personalLoan")){
            //do some job
        }
        if(loanType.equals("car")){
            //do some job
        }
    }
    public void sendOTP(String medium){
        if(medium.equals("email")){
            //write email related logic
            // use JavaMailSenderAPI
        }
    }
}

/*This class does not follow SRP as it can change due to many reasons:
 
 *  getLoanInterestInfo() method : let’s say in future bank people want to provide
        some other loan feature like gold loan and 
        study loan then again you need to modify this class implementation.
 
 * sendOTP() method: let’s assume BankService support send OTP medium as a email 
        but in future they might want to introduced send OTP medium as Phone
        then again you need to change its implementation
   
  ************* To make it follow SRP we must make separate classes for
        Loans, Notifications and PrinterService.  *************


 */