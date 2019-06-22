package test;

/**
 * @author junhi
 * @date 2019/6/21 13:58
 */
public class SellTickets implements Runnable {

    Ticket ticket;

    public SellTickets(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (ticket){
            if(ticket.number <= 0 || ticket.number > 10){
                try {
                    ticket.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("卖出第 "+ticket.number+" 张票");

            ticket.number--;
            ticket.notify();
        }

    }
}
