/*
* This class holds information about a vehicle.
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-05-25
*/

public class Vehicle {
  /**
   * initializing the colour.
   */
  String colour;
  /**
   * initializing the doors.
   */
  private int numberOfDoors;
  /**
   * initializing the speed.
   */
  private float speed;
  /**
   * initializing the max speed.
   */
  private int maximumSpeed;
  /**
   * initializing the max speed.
   */
  private final int doors = 4;
  /**
   * initializing the max speed.
   */
  private final int maxSpeed = 200;

  /**
   * Setting field values with a constructor.
   *
   * @param colourInput
   */
  public Vehicle(final String colourInput) {
    this.colour = colourInput;
    this.numberOfDoors = doors;
    this.speed = 0;
    this.maximumSpeed = maxSpeed;
  }

  /**
   * Setter for the colour.
   *
   * @param userColour
   */
  public void setColour(final String userColour) {
    colour = userColour;
  }

  /**
   * Getter for the colour.
   *
   * @return colour
   */
  public String getColour() {
    return colour;
  }

  /**
   * Getter for the speed.
   *
   * @return speed
   */
  public Float getSpeed() {
    return this.speed;
  }

  /**
   * Method that accelerates the car.
   *
   * @param userIncrease
   * @return speed
   */
  public float accelerate(final float userIncrease) throws Exception {
    // Checking to see if speed exceeds maximum then increasing the speed
    if (this.speed + userIncrease > this.maximumSpeed) {
      throw null;
    } else {
      this.speed = this.speed + userIncrease;
    }

    // Returning the new speed to the user
    return this.speed;
  }

  /**
   * Method that deccelerates the car.
   *
   * @param userDecrease
   * @return speed
   */
  public float deccelerate(final float userDecrease) throws Exception {
    // Checking to see if speed exceeds maximum then increasing the speed
    if (this.speed - userDecrease < 0) {
      throw null;
    } else {
      this.speed = this.speed - userDecrease;
    }

    // Returning the new speed to the user
    return this.speed;
  }
}
