public class Train {

    private int speed = 0;
    private int accelerationStep=0;
    private int maxSpeed;
    private static final int MIN_SPEED = 0;
    private static final int MAX_SPEED = 300;
    private static final int ACCELERATION_MIN_STEP = 1;
    private static final int ACCELERATION_MAX_STEP = 10;
    private String number;
    private String source;
    private String destination;
    private int lineNr;
    private String arrivalTime;
    //private int arrivalMin;
    private String departTime;
  //  private int departMin;

    public Train(int speed, int accelerationStep, int maxSpeed, String number, String source, String destination, int lineNr, String arrivalTime, String departTime) {
        this.number = number;
        this.source = source;
        this.destination = destination;
        this.lineNr = lineNr;
        this.arrivalTime = arrivalTime;
        this.departTime = departTime;
        //this.arrivalMin = arrivalMin;
        //this.departMin = departMin;
        if (maxSpeed < 0) {
            this.maxSpeed = MIN_SPEED;
        } else {
            if (maxSpeed < MAX_SPEED)
                this.maxSpeed = maxSpeed;
        }
        if (accelerationStep > ACCELERATION_MAX_STEP) {
            this.accelerationStep = ACCELERATION_MIN_STEP;
        } else {
            this.accelerationStep = accelerationStep;
        }
    }

    public int accelerate() {
        int newSpeed = speed + getAcceleration();
        if (newSpeed <= getMaxSpeed()) {
            speed = newSpeed;
        } else {
            speed = getMaxSpeed();
        }
        return speed;
    }

    public int decelerate() {
        if (speed > MIN_SPEED) {
            speed--;
        }
        return speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return MAX_SPEED;
    }

    public int getAcceleration() {
        return accelerationStep;
    }

    String getNumber()
    {
        return number;
    }

    String getSource()
    {
        return source;
    }

    String getDestination()
    {
        return destination;
    }

    int getLineNr()
    {
        return lineNr;
    }

    String getarrivalTime()
    {
        return arrivalTime;
    }

   /* int getArrivalMin()
    {
        return arrivalMin;
    }*/

    String getDepartTime()
    {
        return departTime;
    }

    /*int getDepartMin()
    {
        return departMin;
    }*/
}
