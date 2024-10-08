package nav;

public class Farenheit extends grado
{
    public Farenheit parse(Celsius celsius)
    {
        Double valor = (celsius.getValor()-32) * 5.0/9.0;
        Celsius Celsius = new Celsius();
        Celsius.setValor(valor);
        Celsius.setUnidad("K");

        return this;

    }
    public Farenheit parse(Kelvin kelvin)
    {
        Double valor = (kelvin.getValor()-32) * 5.0/9.0 + 273.15;
        Kelvin Kelvin = new Kelvin();
        Kelvin.setValor(valor);
        Kelvin.setUnidad("K");

        return this;

    }


}
