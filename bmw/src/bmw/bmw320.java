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
public class bmw320 extends Bmw {
    private String navigasyon;
    private int hiz;
    
    
    public bmw320(String renk, int uretimyili, String model) {
        super(renk, uretimyili, model);
   
       this.hiz=240;
    
    }

    public void setNavigasyon(String navigasyon) {
        this.navigasyon = navigasyon;
    }

    public int getHiz() {
        return hiz;
    }

    public String getNavigasyon() {
        return navigasyon;
    }
    
}
