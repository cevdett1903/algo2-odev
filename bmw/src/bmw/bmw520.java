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
public class bmw520 extends Bmw {
    private String deridoseme;
    private int hiz;
    
    public bmw520(String renk, int uretimyili, String model, int hiz) {
        super(renk, uretimyili, model);
   
        this.hiz=260;
        
    }

    public void setDeridoseme(String deridoseme) {
        this.deridoseme = deridoseme;
    }

    public String getDeridoseme() {
        return deridoseme;
    }

    public int getHiz() {
        return hiz;
    }
    
}
