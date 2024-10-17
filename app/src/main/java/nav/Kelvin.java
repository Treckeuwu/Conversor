package nav;

public class Kelvin extends grado
{
    public Kelvin(String unidadDeMedida, double valor) {
        super(unidadDeMedida, valor);
    }

    public Kelvin parse(Celsius celsius)
    {
        Double valor = celsius.getValor()-273.15;

        return new Kelvin("K", valor);

    }
    public Kelvin parse(Farenheit farenheit)
    {

        Double valor = (farenheit.getValor() - 273.15) * 9.0/5.0 + 32;
        return new Kelvin("F", valor);


    }
}
