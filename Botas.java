/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penny;


public class Botas extends Sapatos {

    private String tiposolado;
    private Double alturadocano;

    public String getTiposolado() {
        return tiposolado;
    }

    public void setTiposolado(String tiposolado) {
        this.tiposolado = tiposolado;
    }

    public Double getAlturadocano() {
        return alturadocano;
    }

    public void setAlturadocano(Double alturadocano) {
        this.alturadocano = alturadocano;
    }

        public String resumob ()
        {

            return this.modelo + ":" + this.cor + "," + this.numeracao
             + "- Solado de " + this.tiposolado + ", cano " +
             this.alturadocano;

        }


