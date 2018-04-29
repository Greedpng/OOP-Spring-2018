import java.util.Scanner;
public class GameOfLife {
    static int[][] nextGeneration(int grid[][], int size) {
        int[][] future = new int[size][size];
 
        for (int x = 1; x < size - 1; x++) {
            for (int y = 1; y < size - 1; y++) {
                int aliveNeighbours = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        aliveNeighbours += grid[x + i][y + j];
                    }
                }
                aliveNeighbours -= grid[x][y];
 
                if ((grid[x][y] == 1) && (aliveNeighbours < 2)) {
                    future[x][y] = 0;
                } else if ((grid[x][y] == 1) && (aliveNeighbours > 3)) {
                    future[x][y] = 0;
                } else if ((grid[x][y] == 0) && (aliveNeighbours == 3)) {
                    future[x][y] = 1;
                } else {
                    future[x][y] = grid[x][y];
                }
            }
        }
        return future;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("The Game of Life.");

        System.out.print("How many steps in time? ");
        int steps = sc.nextInt();

        System.out.print("What size is the grid? ");
        int size = sc.nextInt();

        String trash = sc.nextLine();

        String[] grid = new String[size];
        System.out.println("Enter the initial grid layout:");
        for (int g = 0; g < size; g++) {
            grid[g] = sc.nextLine();
        }
        System.out.println();

        int cells[][] = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i].charAt(j) == 'O') {
                    cells[i][j] = 1;
                } else {
                    cells[i][j] = 0;
                }
            }
        }

        int[][] future = nextGeneration(cells, size);

        System.out.println("After " + steps + " steps:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
            {
                if (future[i][j] == 0) {
                    System.out.print("-");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }
}