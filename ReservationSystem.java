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

        selectionSort();





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
            

           // reservations[i].makeString();


        }





    }
    public void selectionSort(){
        int[] waffles = new int[40];
        for(int x=0;x<waffles.length;x++){
            waffles[x]=(int)(Math.random()*100);
            System.out.print(waffles[x]+", ");
        }

        int n =waffles.length;

        for(int i=0; i<n-1;i++){
            int min_int = i;
            //find min int location
            for(int j=i+1;j<n;j++){
                if(waffles[j]<waffles[min_int])
                    min_int=j;


                //swap values
                int temp = waffles[min_int];
                waffles[min_int]=waffles[i];
                waffles[i]=temp;


            }



        }
        System.out.println();
        for(int x=0;x<waffles.length;x++){

            System.out.print(waffles[x]+", ");
        }


    }    public void addReservation(int pNumPeople, double pTime, int pPriority, long pTimeMade){
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
