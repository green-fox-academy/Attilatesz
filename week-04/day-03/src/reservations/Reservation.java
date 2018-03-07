package reservations;


import java.util.Random;

public class Reservation implements Reservationy {


  @Override
  public String getDowBooking() {
    int r = (int) (Math.random()*7);
    String name = new String [] {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"}[r];
    return name;
  }

  @Override
  public String getCodeBooking() {
    String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";
    StringBuffer randStr = new StringBuffer();
    for(int i=0; i<8; i++){
      Random random = new Random();
      int r = random.nextInt(37);
      char ch = characters.charAt(r);
      randStr.append(ch);
    }
    return randStr.toString();

  }
}
