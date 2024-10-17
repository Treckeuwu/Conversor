package nav;

public class Farenheit extends grado
{
    public Farenheit(String unidadDeMedida, double valor) {
        super(unidadDeMedida, valor);
    }

    public Farenheit parse(Celsius celsius)
    {
        Double valor = (celsius.getValor()-32) * 5.0/9.0;
        return new Farenheit("F", valor);

    }
    public Farenheit parse(Kelvin kelvin)
    {
        Double valor = (kelvin.getValor()-32) * 5.0/9.0 + 273.15;
        return new Farenheit("F", valor);



    }


}
