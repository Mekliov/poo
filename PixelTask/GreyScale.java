package PixelTask;


public class GreyScale implements MatrixOperation {

   
    @Override
    public Pixel withPixel(int x, int y, Pixel[][] matrix) {

        float r = matrix[x][y].r;
        float g = matrix[x][y].g;
        float b = matrix[x][y].b;
        float grey = (r+g+b)/3;
       
        return new Pixel(grey,grey,grey);
    }

}
