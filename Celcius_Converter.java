public class Celcius_Converter
{
public static void main(float celcius)
{
   float fahr;
   float kel;
   fahr = ((9 * celcius)/5) + 32;
   kel = (celcius + 273);
   System.out.println("Fahrenheit = " + fahr + "ºF");
   System.out.println("Kelvin = " + kel + "K");
}
}
    