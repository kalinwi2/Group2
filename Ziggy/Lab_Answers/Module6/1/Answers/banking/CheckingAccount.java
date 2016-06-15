package banking;

public class CheckingAccount extends Account {

   private static final double NO_PROTECTION = -1.0;

   public CheckingAccount(double bal, double protect) {
      super(bal);
      overdraftProtection = protect;
   }

   public CheckingAccount(double bal) {
      this(bal, NO_PROTECTION);
   }
   
   public boolean withdraw(double amount) {
      boolean result = true;

      if (balance < amount) {
         double overdraftNeeded = amount - balance;
         if ((overdraftProtection == NO_PROTECTION) || (overdraftProtection < overdraftNeeded)) {

            result = false;
         } else {

            balance = 0.0;
            overdraftProtection = overdraftProtection - overdraftNeeded;
         }

      } else {

         balance = balance - amount;
      }

      return result;
   }
}
