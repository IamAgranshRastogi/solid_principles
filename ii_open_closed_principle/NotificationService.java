package ii_open_closed_principle;

/*

 * OCP: Software entities (classes, modules, functions, etc.) 
        should be open for extension, but closed for modification.
 
*/
public class NotificationService {
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
    }
}

/*

 * It open for Extension but close for modification hence its not recommended
   to modify Notification Service for each OTP Feature , it will violate OCP.
   
 * To overcome this we need to design our code in such a way that everyone can reuse
   our feature by just extending it and if they need any customization they can extend it
   and add their feature on top of it like a abstraction .  
 
 */