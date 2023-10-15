public class ReservationSystem {
    Reservation[] reservations = new Reservation[10];
    int reservationsMade;



    public static void main(String[] args) {
        ReservationSystem Jarvis = new ReservationSystem();





    }



    public ReservationSystem(){
//        Reservation Gavin = new Reservation(4,10.00,800,1);
//        Gavin.makeString();
//
//
//
//
//        printReservations();

            addReservation(10,10,8,80000000);



        printReservations();





        }

//        public void addReservation(int pNumPeople, double pTime, int pPriority, long pTimeMade){
//            reservations[reservationsMade]=new Reservation(pNumPeople,pTime,pTimeMade,pPriority);
//            reservationsMade++;
//
//
//
//
//
//
//
//
//    }
    public void printReservations() {
        for (int i = 0; i < reservations.length; i++) {
            if(reservations[i]==null) {
                System.out.println("empty res");

            }
            

            reservations[i].makeString();


        }





    }
    public void addReservation(int pNumPeople, double pTime, int pPriority, long pTimeMade){
        Reservation chair = new Reservation(pNumPeople,pTime,pTimeMade,pPriority);
        for(int x =0; x<reservations.length;x++){
            if(reservations[x]==null){
                System.out.println("empty");
                reservations[x]=chair;
                reservations[x].makeString();
                break;

            }
        }
    }



}
