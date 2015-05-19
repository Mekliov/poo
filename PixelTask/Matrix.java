package PixelTask;


import java.util.Random;

public class Matrix {
    int x;
    int y;
    Pixel matrix[][] = new Pixel[5][5];

    public Matrix() {

        Random rnd = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int t = 0; t < matrix[0].length; t++) {
                Pixel pixel = new Pixel(rnd.nextFloat(), rnd.nextFloat(), rnd.nextFloat());
                matrix[i][t] = pixel;

            }
        }
    }

    public void operate(MatrixOperation op) {

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix.length; y++) {

               Pixel pi = op.withPixel(x, y, matrix);
                this.matrix[x][y]=pi;
               
            }

        }

    }

    public void matrixToString() {
        for (int i = 0; i < matrix.length; i++) {
            for (int t = 0; t < matrix.length; t++) {
                float res = matrix[i][t].r + matrix[i][t].g + matrix[i][t].b;
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }

}
