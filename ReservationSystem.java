import java.util.Scanner;
public class ReservationSystem {
    Reservation[] reservations = new Reservation[10];
    Reservation[] waitlist = new Reservation[10];
    int reservationsMade;


    public static void main(String[] args) {
        ReservationSystem Jarvis = new ReservationSystem();


    }


    public ReservationSystem() {
//        Reservation Gavin = new Reservation(4,10.00,800,1);
//        Gavin.makeString();
//
//
//
//
//        printReservations();

        addReservation(10, 10, 8, 80000000, "Jerry", true);


        addReservation(10, 10, 8, 80000000, "Tim", true);
        addReservation(10, 10, 8, 80000000, "Test", true);
        addReservation(10, 10, 5, 80000000, "Jill", true);
        addReservation(10, 10, 9, 80000000, "Tom", true);
        addReservation(10, 10, 8, 80000000, "Tim", true);
        addReservation(10, 10, 8, 80000000, "Test", true);
        addReservation(10, 10, 5, 80000000, "Jill", true);
        addReservation(10, 10, 9, 80000000, "Tom", true);


        boolean contiunueeee = true;
        while (contiunueeee == true) {
            Scanner starter = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter 1 for sort reservation, 2 for print reservation, 3 for add reservation, 4 for print waitlist");

            int response = Integer.parseInt(starter.nextLine());
            if (response > 4 || response < 1) {
                System.out.println("You entered a non valid choice! Defaulting to print reservations...");
                response = 2;
            }
            if (response == 1) {
                sortReservations();
            }
            if (response == 2) {
                printReservations();
            }
            if (response == 3) {
                addUserReservation();
            }
            if (response == 4) {
                printWaitlist();
            }


            Scanner stopper = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter 1 to end program, 2 for continue");

            int response2 = Integer.parseInt(starter.nextLine());
            if (response2 == 1) {
                contiunueeee = false;
            }


        }

        sortReservations();
        printReservations();


    }

    public void selectionSort() {
        int[] waffles = new int[40];
        for (int x = 0; x < waffles.length; x++) {
            waffles[x] = (int) (Math.random() * 100);
            System.out.print(waffles[x] + ", ");
        }

        int n = waffles.length;

        for (int i = 0; i < n - 1; i++) {
            int min_int = i;
            //find min int location
            for (int j = i + 1; j < n; j++) {
                if (waffles[j] < waffles[min_int])
                    min_int = j;


                //swap values
                int temp = waffles[min_int];
                waffles[min_int] = waffles[i];
                waffles[i] = temp;


            }


        }
        System.out.println();
        for (int x = 0; x < waffles.length; x++) {

            System.out.print(waffles[x] + ", ");
        }


    }


//    public void addReservation(int pNumPeople, double pTime, int pPriority, long pTimeMade) {
//        reservations[reservationsMade] = new Reservation(pNumPeople, pTime, pTimeMade, pPriority);
//        reservationsMade++;
//
//
//    }

    public void printReservations() {
        for (int i = 0; i < reservations.length; i++) {
            if (reservations[i] == null) {
                System.out.println("empty res");

            } else {
                reservations[i].makeString();
            }

        }
//
//
//
//
//
    }

    public void printWaitlist() {
        for (int i = 0; i < waitlist.length; i++) {
            if (waitlist[i] == null) {
                //System.out.println("empty res");

            } else {
                waitlist[i].makeString();
            }

        }
//
//
//
//
//
    }

    public void sortReservations() {
        int n = reservations.length;

        for (int i = 0; i < n - 1; i++) {
            int min_int = i;
            //find min int location

            for (int j = i + 1; j < n; j++) {
                if (reservations[j] != null)

                    if (reservations[j].priority < reservations[min_int].priority)
                        min_int = j;


                //swap values
                if (reservations[j] != null) {
                    int temp = reservations[min_int].priority;
                    reservations[min_int].priority = reservations[i].priority;
                    reservations[i].priority = temp;

                }


            }


        }
    }


    public void addReservation(int pNumPeople, double pTime, int pPriority, long pTimeMade, String pName, Boolean pHightop) {
        boolean needWaitlist = false;


        Reservation chair = new Reservation(pNumPeople, pTime, pTimeMade, pPriority, pName, pHightop);


        for (int x = 0; x < reservations.length; x++) {
            if (reservations[x] == null) {
                // System.out.println("empty");
                reservations[x] = chair;
                //reservations[x].makeString();
                if (reservations[reservations.length - 1] != null) {
                    needWaitlist = true;
                }

                break;


            }


        }
        if (needWaitlist == true) {
            for (int z = 0; z < waitlist.length; z++) {
                if (waitlist[z] == null) {
                    // System.out.println("empty");
                    waitlist[z] = chair;
                    System.out.println("Put in a waitlist spot!");
                    //reservations[x].makeString();
                    break;


                }


            }


        }
    }


    public void changeReservationTime(String cancelname) {

    }

    public void addUserReservation() {
        boolean needWaitlist = false;
        if (reservations[reservations.length - 1] != null) {
            needWaitlist = true;
        }


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String inputname = myObj.nextLine();


        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number of people");

        int numP = Integer.parseInt(myObj2.nextLine());
        Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter time of reservation");

        double userTime = (myObj3.nextDouble());


        long timeMade = System.currentTimeMillis();

        int Priority = (int) (Math.random() * 10);
        Scanner myObj4 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Is it true you want a hightop? Answer true or false");
        String boolResponse = myObj4.nextLine();
        boolean wantHightop = false;
        if ("false".equals(boolResponse) || "true".equals(boolResponse)) {
            wantHightop = Boolean.parseBoolean(boolResponse);


        } else {
            System.out.println("You didn't enter a boolean! Defaulting to no hightop...");
            wantHightop = false;
        }


        Reservation tom = new Reservation(numP, userTime, timeMade, Priority, inputname, wantHightop);
        for (int x = 0; x < reservations.length; x++) {
            if (reservations[x] == null) {
                // System.out.println("empty");
                reservations[x] = tom;
                if (x >= reservations.length) {
                    System.out.println("Array is full!");
                }
                //reservations[x].makeString();
                break;

            }
        }
        if (needWaitlist == true) {
            for (int z = 0; z < waitlist.length; z++) {
                if (waitlist[z] == null) {
                    // System.out.println("empty");
                    waitlist[z] = tom;
                    System.out.println("Put in a waitlist spot!");
                    //reservations[x].makeString();
                    break;


                }


            }
        }
    }
}








