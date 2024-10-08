package nav;

public class Celsius extends grado
{
    // un numero no es un celsius, faren, kelvin
    public Celsius parse(Kelvin kelvin)
    {
        Double valor = kelvin.getValor()-273.15;
        Celsius celcius = new Celsius();
        celcius.setValor(valor);
        celcius.setUnidad("K");

        return this;

    }
    public Celsius parse(Farenheit farenheit)
    {
        Double valor = farenheit.getValor()-273.15;
        Celsius celcius = new Celsius();
        celcius.setValor(valor);
        celcius.setUnidad("F");

        return this;

    }

}
