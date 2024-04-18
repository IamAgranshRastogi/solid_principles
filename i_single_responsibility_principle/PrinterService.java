package i_single_responsibility_principle;

public class PrinterService {
    public void printPassbook() {
        //update transaction info in passbook
    }
}

// Now this class follows SRP as it will change only if any change in Printing Service.