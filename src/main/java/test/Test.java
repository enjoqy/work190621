package test;

/**
 * @author junhi
 * @date 2019/6/21 13:49
 */
public class Test {

    public static void main(String[] args) {
        Ticket ticket = new Ticket(10);

        SellTickets sellTickets = new SellTickets(ticket);
        RefundTicket refundTicket = new RefundTicket(ticket);

        Thread thread1 = new Thread(refundTicket);
        Thread thread = new Thread(sellTickets);
        thread.start();
        thread1.start();



    }
}
