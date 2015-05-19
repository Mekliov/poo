package PixelTask;

public class MainPixel {

    public static void main(String[] args) {
        Matrix mat= new Matrix();
        GreyScale gs= new GreyScale();
        Brightness b= new Brightness();
        mat.operate(gs);
        mat.matrixToString();
        mat.operate(b);
        mat.matrixToString();
        
        
      
        
       
      
    }

}
