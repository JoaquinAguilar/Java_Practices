package dibujos;


public class Calcomania extends Lienzo{

public Calcomania(){
super(25,8);
}    
    public void importaString (String c){
     char [] sc= c.toCharArray();
     int maxAlto = this.getAlto()-1;
     int maxAncho = this.getAncho()-1;
     int y=maxAlto;
     int x=0;
     for(char ca : sc){
         if (ca=='\n'){
         x=0;
         y--;
         }
         if((x<maxAncho)&&(y>=0)&&(ca!='\n')){
         this.setPen(x,y,ca);
         x++;
         }
     }
    }
    
   
}
