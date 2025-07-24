class Task1{
    public static void main(String[] args) {
        String AccountholderName = "Ramya";
        int AccountBalance = 10000;
        int numberOfTransactions = 2;
        int depositAmount = 5000;
        int withdrawalAmount = 2000;
        boolean isAccountActive = true;

        double currentBalance = AccountBalance+ depositAmount- withdrawalAmount;
        boolean depositAmountAndAccountActive = depositAmount>0 && isAccountActive;
        boolean withdrawalAmountAndAccountActive = withdrawalAmount>0 && isAccountActive;
        numberOfTransactions++;

        //Displaying the account details
        System.out.println("Account Holder Name: " + AccountholderName);
        System.out.println("Final Balance: " + currentBalance);
        System.out.println("Number of Transactions: " + numberOfTransactions);
        
    }
}