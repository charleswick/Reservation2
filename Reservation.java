public class Reservation {
    // this will help me make objects of type reservatiom
    public int numberPeople;
    public String name;
    public double time;
    public long timeMade;
    public int priority;
    public int numReservation;
    public boolean highTop;
    public boolean outdoor;
    //hightop limit is 4
    //make a waitlist, do you want to do standard?
    //special occaasion?


    public Reservation(int pnumberPeople, double pTime, long ptimeMade, int pPriority, String name){
        numberPeople=pnumberPeople;
        time=pTime;
        timeMade = ptimeMade;
        priority=pPriority;

    }

    public void makeString(){
        System.out.println("Reservation for "+name+","+numberPeople+" people at "+time+", made at "+timeMade+", with a priority of "+priority+".");

    }
}
