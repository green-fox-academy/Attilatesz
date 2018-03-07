package reservations;

public class Main extends Reservation {
  public static void main(String[] args) {

    Reservation one = new Reservation();
    Reservation two = new Reservation();
    Reservation third = new Reservation();
    Reservation four = new Reservation();
    Reservation five = new Reservation();
    Reservation six = new Reservation();
    Reservation seven = new Reservation();
    Reservation eight = new Reservation();
    Reservation nine = new Reservation();

    System.out.println("Booking# " + one.getCodeBooking() + " for " + one.getDowBooking());
    System.out.println("Booking# " + two.getCodeBooking() + " for " + two.getDowBooking());
    System.out.println("Booking# " + third.getCodeBooking() + " for " + third.getDowBooking());
    System.out.println("Booking# " + four.getCodeBooking() + " for " + four.getDowBooking());
    System.out.println("Booking# " + five.getCodeBooking() + " for " + five.getDowBooking());
    System.out.println("Booking# " + six.getCodeBooking() + " for " + six.getDowBooking());
    System.out.println("Booking# " + seven.getCodeBooking() + " for " + seven.getDowBooking());
    System.out.println("Booking# " + eight.getCodeBooking() + " for " + eight.getDowBooking());
    System.out.println("Booking# " + nine.getCodeBooking() + " for " + nine.getDowBooking());


  }
}
