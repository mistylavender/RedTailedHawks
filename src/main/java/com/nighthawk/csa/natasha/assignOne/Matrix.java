package com.nighthawk.csa.natasha.assignOne;

 public class Matrix {
        private final int[][] matrix;

        // store matrix
        public Matrix(int[][] matrix) {
            this.matrix = matrix;
        }

        // overriding toString method to display matrix
        public String toString(){
            String matrx = "";
            for (int i = 0; i < matrix.length; i++) { // rows forward
                for (int j = 0; j < matrix[i].length; j++) { // columns forward
                    if (matrix[i][j] > 9) { // converting to hexadecimal string
                        matrx = matrx + "  " + Integer.toHexString(matrix[i][j]);
                    } else if (matrix[i][j] >= 0){
                        matrx = matrx + "  " + matrix[i][j];
                    } else { // excluding -1
                        matrx = matrx + "   ";
                    }
                }
                matrx = matrx + "\n";
            }

            matrx = matrx + "\n";

            for (int h = matrix.length - 1; h >= 0; h--) { // reverse of matrix from length - 1 to 0
                for (int g = matrix[h].length - 1; g >= 0; g--) {
                    if (matrix[h][g] > 9) {
                        matrx = matrx + "  " + Integer.toHexString(matrix[h][g]);
                    } else if (matrix[h][g] >= 0){
                        matrx = matrx + "  " + matrix[h][g];
                    } else {
                        matrx = matrx + "   ";
                    }
                }
                matrx = matrx + "\n";
            }

            return matrx;
        }


        // declare and initialize a matrix for a keypad
        static int[][] keypad() {
            return new int[][]{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, {-1, 0, -1} };
        }

        // declare and initialize a random length arrays
        static int[][] numbers() {
            return new int[][]{ { 0, 1 },
                    { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                    { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 } };
        }

        // tester method for matrix formatting
        public static void main(String[] args) {
            Matrix m0 = new Matrix(keypad());
            System.out.println("Keypad:");
            System.out.println(m0);

            Matrix m1 = new Matrix(numbers());
            System.out.println("Numbers Systems:");
            System.out.println(m1);
        }
}
