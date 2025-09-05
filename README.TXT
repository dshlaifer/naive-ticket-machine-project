Lab 2


2. What value is returned if you get the machine’s balance after it has printed a ticket?

The value that was returned is 0.

3. What happens if you insert too much money into the machine –
do you receive any refund? What happens if you do not insert enough and then try to print a ticket?

4. yes I found something strange about the machines behavior, 
when I put more money than the required amount I get a ticket but no refund.
when I put less money than required I dont get a refund and I dont get a Ticket.

5. Create another ticket machine for tickets of a different price; remember that you have to supply this value
when you create the machine object. Buy a ticket from that machine. Does the printed ticket look any
different from those printed by the first machine? If so, what is different?

There is only one difference which is that the money for the ticket was different.

7. Does it matter whether we write public class TicketMachine or class public TicketMachine in the outer
wrapper of a class?

Yes! it does matter, because when the you dont put the class before the name it
would not let the code go through because the identifier is expected.

8. Nothing really changed

9. when removing class there are issues with the code.

10.  list of the names of the fields, constructors, and methods in the TicketMachine class

Field: price,balance and total
constructor: public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }
    
Method: Ticket Machine, getPrice,getBalance,insertMoney,printTicket


11. What are the two features of the constructor that make it look significantly different from the methods
of the class?

The two features are esuring the cost and making the price greater than 0

12. what do you think is the type of each of the following fields?

private int count;  int
private Student representative; string
private Server host; string

13. What are the names of the following fields?
private boolean alive; Alive
private Person tutor; Tutor
private Game game; Game

14.

15. Yes it matters because of how the way it looks
 it also shows the error indicator which helps me figure out the ptoblem.
 
 16. Yes the semicolon is important, if you dont put it you cant compile.

18. To what class does the following constructor belong? public Student(String name)

it would belong to 

public class Student

19. public Book(String title,double price)

the types are String and double. For parameters I think there is 2


20. Contructors parameters are not stored persistent they should
be store temporarily

the types of the Book class's field might be String, double for title and price.
The names of the field can be Title and Price.

21.

public pet (String petsName)

{
    name = petsName;
}

22.

public Date(String month, int day, int year)

23. The only difference for both header and body of the getBalance and getPrice are
the names everything else looks the same.

24. I would characterize a call to getBalance
would be "what is the balance"

25. When I changed the name to getAmount instead of getBalance
I dont need to change the body method, but when I call for it shows get Amount.

27. After removing the return statement it says that its not a statement.

28. The Comparison between the getPrice and printTicket are, in getPrice int is used
and in printTicket void is used.

29. insertMoney and printTicket doesnt have a return statement because they use public void
which is a return type.

31.
public void increaseScore(int points)
{
    Score = score + points;
}

32.
public void addCredits(int additionalPoints)
{
    credits += additionalPoints;
}

this is a mutator Student example

Student s1 = new student(string name):
system.out.prinln(s1.getCredits());
s1.addCredits(10);
system.out.println(s1.getCredits());

33.
public void discount(int amount)
{
    price = price - amount;
}
34.
public void setAge(int currentAge)
{
    age = currentage
}

35.
public void setAlive(boolean aliveStatus)
{
    alive = aliveStatus;
}

36.
After modifying the TicketMachine after changing the name
of the parameter the results doesnt show any values I put.

37. The statement would say "My cat has green eyes"

39. It would print # price cents.

40. it would print the same thing # price cents.

42. both machines show the same output I think it might be because the method does not have
parameter or values.

45. for the two costructors it wasnt able to work this was my code

public class TicketMachine
{
    private int price;
    
    
    public TicketMachine (int ticket price)
    {
        price = ticketPrice;
    }
}

46. I dont know.
