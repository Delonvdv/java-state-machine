package com.company;

enum Direction {FORWARD, REVERSE}
enum Speed {OFF, SLOW, MEDIUM, FAST}

/**
 * Class to control a fan speed and direction
 * Implemented as a Finite State Machine
 */
public class FanController {

    Direction currentDirection = Direction.FORWARD;
    Speed currentSpeed = Speed.OFF;

    /**
     * Gets current fan direction
     * @return currentDirection
     */
    public Direction getCurrentDirection() {
        return currentDirection;
    }

    /**
     * Gets current fan speed
     * @return currentSpeed
     */
    public Speed getCurrentSpeed() {
        return currentSpeed;
    }

    /**
     * Checks current direction and toggles between forward and reverse
     * @return currentDirection
     */
    public Direction changeDirection() {
        currentDirection = (currentDirection == Direction.FORWARD) ? Direction.REVERSE : Direction.FORWARD;
        return currentDirection;
    }

    /**
     * Checks current fan speed and increases it by one step
     * @return currentSpeed
     */
    public Speed changeFanSpeed() {
        switch (currentSpeed) {
            case OFF:
                currentSpeed = Speed.SLOW;
                break;
            case SLOW:
                currentSpeed = Speed.MEDIUM;
                break;
            case MEDIUM:
                currentSpeed = Speed.FAST;
                break;
            default:
                currentSpeed = Speed.OFF;
        }
        return currentSpeed;
    }

    /**
     * Converts currentSpeed and currentDirection toString()
     * @return String value of the above
     */
    public String toString(){
        return currentDirection.toString() +" "+currentSpeed.toString();
    }

}
