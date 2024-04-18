package i_single_responsibility_principle;

public class NotificationService {
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
    }
}

// Now this class follows SRP as it will change only if any change for OTP notification