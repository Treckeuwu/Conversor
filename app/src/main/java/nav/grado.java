package nav;

public class grado
{

    private String unidad;
    private Double valor;
    public String Medida;

    public grado(String unidadDeMedida, double valor)
    {
        this.Medida = unidadDeMedida;
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setUnidad(String unidadDeMedida)
    {
        this.unidad = unidadDeMedida;
    }
}
