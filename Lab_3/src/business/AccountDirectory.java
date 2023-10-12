
package business;

import java.util.ArrayList;


/**
 *
 * @author ingale.r
 */
public class AccountDirectory {
   private ArrayList<Account> accountList;

    public AccountDirectory(){
        this.accountList = new ArrayList<Account>(); //As ArrayList is primitive type so we use 'new' to use the ArrayList
        //this keyword will makesure the accountList is of class level and not constructor
    }
    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList; 
    }
   
    //Add account:
    public Account addAccount(){
        Account account = new Account();
        accountList.add(account);
        return account; //here we will already have reference to account which is already in a list
    }
    
    //Delete account:
    public void deleteAccount(Account account){
        accountList.remove(account);
    }
    
    //Search account:
    public Account searchAccount(String accountNumber){
      for(Account account : accountList){
          if(account.getAccountNumber().equals(accountNumber))
              return account;
      } return null;
    }
    
}
