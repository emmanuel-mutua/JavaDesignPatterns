package AdapterPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This is the Adapter class
 */

public class BankCustomer extends BankDetails implements CreditCard {

    @Override
    public void giveBankDetails() {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the account holder name:");
            String customerName = br.readLine();
            System.out.print("\n");

            System.out.print("Enter the account number:");
            long accno = Long.parseLong(br.readLine());
            System.out.print("\n");
            System.out.print("Enter the bank name :");
            String bankname=br.readLine();
            setAccHolderName(customerName);
            setAccNumber(accno);
            setBankName(bankname);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accNo = getAccNumber();
        String accountHolderName = getAccHolderName();
        String bankName = getBankName();
        return ("The Account number "+accNo+" of "+accountHolderName+" in "+bankName+ "bank is valid and authenticated for issuing the credit card. ");
    }
}
