
package penny ;

public class Saltos extends Sapatos{

    private Double tamanho;

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }
     public String resumosaltos ()
    {

        return  this.getModelo() + ":" + this.getCor() + " ," + this.getNumeracao() + "salto: " + this.tamanho;


    }

}
