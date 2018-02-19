// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output


public class Matrix {
    public static void main(String [] args){
        int [][] matrix = new int[6][6];
        for (int column = 0; column < matrix.length; column++) {
            for (int row = 0; row < matrix[column].length; row++) {
                if (row == column)
                    matrix[column][row] = 1;
                System.out.print(matrix[column][row] + " ");
            }
            System.out.println();
        }
    }
}
/*

5
down vote
int [][] twoDim = new int [5][5];

int a = (twoDim.length);//5
int b = (twoDim[0].length);//5

for(int i = 0; i < a; i++){ // 1 2 3 4 5
    for(int j = 0; j <b; j++) { // 1 2 3 4 5
        int x = (i+1)*(j+1);
        twoDim[i][j] = x;
        if (x<10) {
            System.out.print(" " + x + " ");
        } else {
            System.out.print(x + " ");
        }
    }//end of for J
    System.out.println();
}//end of for i
 */