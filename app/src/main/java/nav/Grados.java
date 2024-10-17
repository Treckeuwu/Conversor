package nav;

public class Grados {
private String unidad;
public String Medida;
public double valor;

    public Grados(String unidadDeMedida, double valor)
    {
        this.Medida = unidadDeMedida;
        this.valor = valor;
    }
    public String getUnidadDeMedida()
    {
        return Medida;
    }

    public double getValor()
    {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setUnidadDeMedida(String unidadDeMedida)
    {
        this.Medida = unidadDeMedida;
    }


}
