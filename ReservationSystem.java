public class ReservationSystem {
    public static void main(String[] args) {
        ReservationSystem Jarvis = new ReservationSystem();
    }
    public ReservationSystem(){
        Reservation Gavin = new Reservation(4,10.00,800,1);
        Gavin.makeString();
        printReservations();


        makeReservation();





        }
        int numReservation;
        public void makeReservation(){
            for(int i = 0; i<numReservation; i++){
                reservations[i]=new Reservation(i*2,i*.5,System.currentTimeMillis(),i);


            }





    }
    public void printReservations(){
        for(int i=0;i<numReservation;i++){
            reservations[i].makeString();


        }


    Reservation[] reservations = new Reservation[numReservation];


}
