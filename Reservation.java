public class Reservation {
    // this will help me make objects of type reservatiom
    public int numberPeople;
    public double time;
    public long timeMade;
    public int priority;
    public int numReservation;

    public Reservation(int pnumberPeople, double pTime, long ptimeMade, int pPriority){
        numberPeople=pnumberPeople;
        time=pTime;
        timeMade = ptimeMade;
        priority=pPriority;

    }

    public void makeString(){
        System.out.println("Reservation for "+numberPeople+" people at "+time+", made at "+timeMade+", with a priority of "+priority+".");

    }
}
