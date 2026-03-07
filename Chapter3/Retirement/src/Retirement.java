public class Retirement {
    /**
     * This program demostrates a <code>while</code> loop.
     */
    void main(){
        // read inputs
        double goal = Double.parseDouble(IO.readln("How much money do you need to retire? "));
        double payment
            = Double.parseDouble(IO.readln("How much money will contribute every year? "));
        double interestRate = Double.parseDouble(IO.readln("Interest rate in %: "));

        double balance = 0;
        int years = 0;

        //update account balance while goal isnt reached
        while (balance < goal) {
            //add this years payment and interest

            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        IO.println("You can retire in " + years + " years");

    }
    
}
