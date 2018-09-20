public class CtoFTester{
  public static double celsiusToFahrenheit(double c){
    return c * 1.8 + 32;
  }
  public static double fahrenheitToCelsius(double f){
    return (f - 32)/1.8;
  }
  public static void main(String[] args){
    System.out.println(celsiusToFahrenheit(0.0));
    System.out.println(fahrenheitToCelsius(32.0));
  }

}
