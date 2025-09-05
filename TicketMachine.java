/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int total;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int price;
    
    private int status;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     * question 44 this effect makes it so when you get price it would say 1000
     * no matter what.
     */
    public TicketMachine(int cost)
    {
        price = 1000;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
         return price;
    }
    public void prompt()
    { 
        System.out.println("please insert the correct amount of money");
    } 
    /**this is question 38 ^
    
    
    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getbalance()
    {
        return balance;
    }
    public void showPrice()
    {
        System.out.println("The price of a ticket is 50 cents");
    }
    /**this is question 41 ^
    public int getTotal()
    {
        return total;
    }
    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     * question 43 %d = integer and %n is new line
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.printf("# %d cents.%n", price); 
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
}
