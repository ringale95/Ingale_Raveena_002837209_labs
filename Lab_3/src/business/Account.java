
package business;

import java.util.Date;


/**
 *
 * @author ingale.r
 */
public class Account {
   private String routingNumber; 
    private String accountNumber;
    private String bankName;
    private int balance;
    private Date createdOn;

    //Create constructor:Similar to method but name is same as classname 
    //No return type
    //Whenever we create object of class a default constructor is called. No need to specify default constructor
    //Important: Always specify default value of above variable in default constructor
    public Account() {
        this.createdOn = new Date(); //As we have set the date for new date we will not explicitly set it but we will only create getter
    } // We will not create new for other variables as primitive data type
 
    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getCreatedOn() {
        return createdOn;
    }
    
    
    public String toString(){
        return bankName;
    }
    
}
