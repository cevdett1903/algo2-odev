/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmw;

/**
 *
 * @author CEVO
 */
public class bmw730 extends Bmw {
    private String camtavan;
    private int hiz;
    
    public bmw730(String renk, int uretimyili, String model, int hiz) {
        super(renk, uretimyili, model);
    
        this.hiz=280;
        
    }

    public void setCamtavan(String camtavan) {
        this.camtavan = camtavan;
    }

    public String getCamtavan() {
        return camtavan;
    }

    public int getHiz() {
        return hiz;
    }
    
}
