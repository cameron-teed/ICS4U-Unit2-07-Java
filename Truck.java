/*
* This class holds information about a vehicle.
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-05-25
*/

public class Truck extends Vehicle {

  /**
   * This creates the licensePlate.
   */
  private String licensePlate;
  /**
   * This creates the air break..
   */
  private float airBreak;
  /**
   * This creates the air break..
   */
  private float stopConstant;

  /**
   * Constructor for the Bike.
   *
   * @param carColour
   */
  public Truck(final String carColour) {
    super(carColour);
    colour = carColour;
    licensePlate = null;
    stopConstant = 2;
    airBreak = 0;
  }

  /**
   * This sets the license plate.
   *
   * @param plateNum
   */
  public void setLicensePlate(final String plateNum) {
    this.licensePlate = plateNum;
  }

  /**
   * This is the getter for the license plate.
   *
   * @return licensePlate
   */
  public String getLicensePlate() {
    return this.licensePlate;
  }

  /**
   * This returns how much braking force their truck has.
   *
   * @param airAmount
   * @return airBreak
   */
  public float provideAir(final float airAmount) {

    this.airBreak = getSpeed() - (this.stopConstant * airAmount);

    return airBreak;
  }
}
