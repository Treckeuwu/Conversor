package nav;

public class Kelvin extends grado
{
    public Kelvin parse(Celsius celsius)
    {
        Double valor = celsius.getValor()+273.15;
        Kelvin Kelvin = new Kelvin();
        Kelvin.setValor(valor);
        Kelvin.setUnidad("K");

        return this;

    }
    public Kelvin parse(Farenheit farenheit)
    {

        Double valor = (farenheit.getValor() - 273.15) * 9.0/5.0 + 32;
        Kelvin Kelvin = new Kelvin();
        Kelvin.setValor(valor);
        Kelvin.setUnidad("F");

        return this;

    }
}
