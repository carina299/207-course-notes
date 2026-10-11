/**
 * Represents a rectangle.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle.
   *
   * @param w the width of the rectangle
   * @param h the height of the rectangle
  */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * calculate the area of the rectangle.
   *
   * @return the area of the rectangle
   * */
  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle.
   *
   * @param factor the scale of the rectangle
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * compare the area of two rectangles.
   *
   * @param other other rectangle
   * @return if the rectangle is larger than the other
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}
