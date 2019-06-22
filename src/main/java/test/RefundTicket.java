package test;

/**
 * @author junhi
 * @date 2019/6/21 13:50
 */
public class RefundTicket implements Runnable {

    Ticket ticket;

    public RefundTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (ticket){
                if(ticket.number == 10 || ticket.number <0){
                    try {
                        ticket.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                ticket.number++;

                System.out.println("收到第 " + ticket.number + " 张退票");

                ticket.notify();
            }
        }
    }
}
