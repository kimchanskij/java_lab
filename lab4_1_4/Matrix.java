package lab4_1_4;

public class Matrix {
    private double[][] array;
    private int lines;
    private int columns;

    public Matrix(int lines, int columns){
        this.lines = lines;
        this.columns = columns;
        this.array = new double[lines][columns];
    }
    public Matrix(double[][] x) {
        array = x;
        for (double[] q: array) {
            lines += 1;
        }
        for (double q: array[0]) {
            columns += 1;
        }
    }
    public Matrix Sum(Matrix obj) {
        if (obj.lines == lines) {
            if (obj.columns == columns) {
                for (int i = 0; i < lines; i++) {
                    for (int j = 0; j < columns; j++) {
                        array[i][j] += obj.array[i][j];
                    }
                }
                return this;
            }
        }
        System.out.println("Размеры различаются");
        return null;
    }

    public Matrix MultInt(double num) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] *= num;
            }
        }
        return this;
    }

    public Matrix Mult(Matrix obj) {
        if (columns == obj.lines) {
            Matrix res = new Matrix(lines, obj.columns);
            for (int i = 0; i < lines; i++) {
                for (int z = 0; z < obj.columns; z++) {
                    for (int j = 0; j < columns; j++) {
                        res.array[i][z] += array[i][j] * obj.array[j][z];
                    }
                }
            }
            return res;
        }
        return null;
    }

    @Override
    public String toString() {
        String x = "";
        for (double[] q: array) {
            for (double qq: q) {
                x += qq + "  ";
            }
            x += "\n";
        }
        return x + "\nСтрок: " + lines + "\nСтолбцов: " + columns;
    }
}