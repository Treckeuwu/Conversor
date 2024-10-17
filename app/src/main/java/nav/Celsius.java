package nav;

public class Celsius extends grado
{
    public Celsius(String unidadDeMedida, double valor) {
        super(unidadDeMedida, valor);
    }

    // un numero no es un celsius, faren, kelvin
    public Celsius parse(Kelvin kelvin)
    {
        Double valor = kelvin.getValor()-273.15;

        return new Celsius("K", valor);




    }
    public Celsius parse(Farenheit farenheit)
    {
        Double valor = (farenheit.getValor() * 9 / 5) + 32;
        return new Celsius("F", valor);


    }

}
