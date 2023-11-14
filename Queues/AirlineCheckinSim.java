import java.util.Scanner;
import java.util.Queue;
/** Simulate the check-in process of an airline.
 */
public class AirlineCheckinSim
{
    // Data Fields

    private Passenger passenger = new Passenger();
    /**
     * Queue of frequent flyers.
     */
    private PassengerQueue frequentFlyerQueue = new PassengerQueue("Frequent Flyer");
    /**
     * Queue of regular passengers.
     */
    private PassengerQueue regularPassengerQueue = new PassengerQueue("Regular Passenger");
    /**
     * Maximum number of frequent flyers to be served before a regular passenger
     * gets served.
     */
    private int frequentFlyerMax;
    /**
     * Maximum time to service a passenger.
     */
    private int maxProcessingTime;
    /**
     * Total simulated time.
     */
    private int totalTime;
    /**
     * If set true, print additional output.
     */
    private boolean showAll;
    /**
     * Simulated clock.
     */
    private int clock = 0;
    /**
     * Time that the agent will be done with the current passenger.
     */
    private int timeDone;
    /**
     * Number of frequent flyers served since the last regular passenger was
     * served.
     */
    private int frequentFlyersSinceRP;
    
    
    private void enterData() {
        Scanner scnr = new Scanner(System.in);
        
        System.out.print("Expected number of frequent flyer arrivals per hour: ");
        frequentFlyerQueue.arrivalRate(scnr.nextInt());
        
        System.out.print("Expected number of regular passenger arrivals per hour: ");
        regularPassengerQueue.arrivalRate(scnr.nextInt());
        
        System.out.print("The maximum number of frequent flyers served between regular passengers: ");
        frequentFlyerMax = scnr.nextInt();
        
        System.out.print("Maximum service time in minutes: ");
        maxProcessingTime = scnr.nextInt();
        passenger.setMaxProcessingTime(maxProcessingTime);
        
        System.out.print("The total simulation time in minutes: ");
        totalTime = scnr.nextInt();
        
        System.out.print("Display minute-by-minute trace of simulation(Y or N): ");
        String choice;
        choice = scnr.next();
        if(choice.equals("y")) {
            startServe();
        }
        else {
            System.out.println("Nothing");
        }
        
    }
   
    
    private void runSimulation()
    {
        for (clock = 0; clock < totalTime; clock++)
        {
            frequentFlyerQueue.checkNewArrival(clock, showAll);
            regularPassengerQueue.checkNewArrival(clock, showAll);
            if (clock >= timeDone)
            {
                startServe();
            }
        }
    }
    
    private void startServe()
    {
        if (!frequentFlyerQueue.isEmpty()
                && ((frequentFlyersSinceRP <= frequentFlyerMax)
                || regularPassengerQueue.isEmpty()))
        {
            // Serve the next frequent flyer.
            frequentFlyersSinceRP++;
            timeDone = frequentFlyerQueue.update(clock, showAll);
        } else if (!regularPassengerQueue.isEmpty())
        {
            // Serve the next regular passenger.
            frequentFlyersSinceRP = 0;
            timeDone = regularPassengerQueue.update(clock, showAll);
        } else if (showAll)
        {
            System.out.println("Time is " + clock
                    + " server is idle");
        }
    }
    
    /**
     * Method to show the statistics.
     */
    private void showStats()
    {
        System.out.println("\nThe number of regular passengers served was "
                + regularPassengerQueue.getNumServed());
        double averageWaitingTime
                = (double) regularPassengerQueue.getTotalWait()
                / (double) regularPassengerQueue.getNumServed();
        System.out.println(" with an average waiting time of "
                + averageWaitingTime);
        System.out.println("The number of frequent flyers served was "
                + frequentFlyerQueue.getNumServed());
        averageWaitingTime
                = (double) frequentFlyerQueue.getTotalWait()
                / (double) frequentFlyerQueue.getNumServed();
        System.out.println(" with an average waiting time of "
                + averageWaitingTime);
        System.out.println("Passengers in frequent flyer queue: "
                + frequentFlyerQueue.size());
        System.out.println("Passengers in regular passenger queue: "
                + regularPassengerQueue.size());
    }
    
    /**
     * Main method.
     *
     * @param args Not used
     */
    public static void main(String args[])
    {
        AirlineCheckinSim sim = new AirlineCheckinSim();
        sim.enterData();
        sim.runSimulation();
        sim.showStats();
        System.exit(0);
    }
}
