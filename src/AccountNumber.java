import java.util.List;
import java.util.ArrayList;

public class AccountNumber 
{
    private int AccountNumber;
    private double Balance;
    private int Pin;
    private List<String>transactionHistory;
    public AccountNumber() 
    {
        super();
    }
    public AccountNumber(int AccountNumber,int Pin,double initialBalance)
    {
        this.AccountNumber=AccountNumber;
        this.Pin=Pin;
        this.Balance=initialBalance;
        this.transactionHistory=new ArrayList<>();
         System.out.println("");
    }
    
    
}
