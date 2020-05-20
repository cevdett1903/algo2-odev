
package bmw;

import java.util.Scanner;

public class Bmw {

    
    private String renk;
    private int uretimyili;
    private String model;
    private int hiz;
    
    
    
    
    public void tumBilgileriGoster(){
        System.out.println("Renk: "+renk);
        System.out.println("Üretim Yılı: "+uretimyili);
        System.out.println("Model: "+model);
        System.out.println("Hiz: "+hiz);
        
    }
    
    
    
    

    

    public Bmw(String renk, int uretimyili, String model) {
        this.renk = renk;
        this.uretimyili = uretimyili;
        this.model = model;
        
    }

    public String getRenk() {
        return renk;
    }

    public int getUretimyili() {
        return uretimyili;
    }

    public String getModel() {
        return model;
    }

   

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setUretimyili(int uretimyili) {
        this.uretimyili = uretimyili;
    }

    public void setModel(String model) {
        this.model = model;
    }

        public static void arabaEkle(String a,int b, String c){
        Bmw k= new Bmw(a,b,c);
    }
 
        
        public static boolean arabaCalistir(boolean durum){
            
            
            if(durum==true){
                System.out.println("Araba zaten çalışıyıror...");
                return durum;
            }
            
            else{
            System.out.println("Araba çalışıtırıldı...");
            durum=true;
            return durum;
            }
            
        }
    
    
    public static void main(String[]args){
    Scanner k= new Scanner(System.in);
    Bmw bmw= new Bmw("Mavi",2018,"320");
    boolean durum=false;
    
        for (; ;) {
             System.out.println("Programa hoşgeldiniz, ne yapmak istersiniz?");
        System.out.println("1=arabaEkle");
        System.out.println("2=arabaCalistir");
        System.out.println("3=tumBilgileriGoster");
        
            int a1=k.nextInt();
            if(a1==1){
                String a=k.next();
                int b =k.nextInt();
                String c=k.next();
    
                arabaEkle(a,b,c);
            
            }
            else if(a1==2){
            
                arabaCalistir(durum);
                
                    durum=true;
            }
            else{
            
                bmw.tumBilgileriGoster();
            }
        
    
        }
        
       
    
    }
    
}



