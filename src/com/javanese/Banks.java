package com.javanese;

public class Banks {
    public static void main(String [] args) {
        private String accountNumber;
        private double accountBalance;
        private String customerName;
        private String customerEmailAddress;
        private String customerPhoneNumber;

        public void deposit(double depositAmount) {
            this.balance += depositAmount;
        }

        public void withdrawal(double withdrawalAmount) {
            if(this.balance - withdrawal <0) {
                System.out.println("No Mana!");
            } else {
                this.balance -= withdrawalAmount;
                System.out.println("Withdrawal of" + withdrawalAmount + "Denied");
            }
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance (double balance) {
            this.balance = balance;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        
    }
}
