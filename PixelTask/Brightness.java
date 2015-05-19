package PixelTask;

public class Brightness implements MatrixOperation {

    public Pixel withPixel(int x, int y, Pixel[][] matrix) {

        float r = matrix[x][y].r;
        float g = matrix[x][y].g;
        float b = matrix[x][y].b;
        float reduce = (r / 2) + (g / 2) + (b / 2);

        return new Pixel(reduce, reduce, reduce);
    }
}
