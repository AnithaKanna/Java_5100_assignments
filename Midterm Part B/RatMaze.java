public class RatMaze {
      final int N = 4;


        void printSolution(int sol[][])
        {
            System.out.print("[");
            int i=0,j=0;
            while(!(i==sol.length-1&&j==sol.length-1))
            {
                if(sol[i][j]==1)
                {
                    System.out.print("["+i+","+j+"],");
                    if(i!=sol.length-1) {
                        if (sol[i + 1][j] == 1)
                            i++;
                        else
                            j++;
                    }
                    else
                        j++;
                }
            }
            System.out.println("["+i+","+j+"]]");
        }


        boolean isSafe(int maze[][], int x, int y)
        {

            return (x >= 0 && x < N && y >= 0 &&
                    y < N && maze[x][y] == 1);
        }


        boolean solveMaze(int maze[][])
        {
            int sol[][] = {{0, 0, 0, 0},
                    {0, 0, 0, 0},
                    {0, 0, 0, 0},
                    {0, 0, 0, 0}
            };

            if (solver(maze, 0, 0, sol) == false)
            {
                System.out.print("Solution doesn't exist");
                return false;
            }

            printSolution(sol);
            return true;
        }


        boolean solver(int maze[][], int x, int y,
                              int sol[][])
        {

            if (x == N - 1 && y == N - 1)
            {
                sol[x][y] = 1;
                return true;
            }


            if (isSafe(maze, x, y) == true)
            {
                sol[x][y] = 1;


                if (solver(maze, x + 1, y, sol))
                    return true;


                if (solver(maze, x, y + 1, sol))
                    return true;


                sol[x][y] = 0;
                return false;
            }

            return false;
        }

        public static void main(String args[])
        {
            RatMaze rat = new RatMaze();
            int maze[][] = {{1, 0, 0, 0},
                    {1, 1, 0, 1},
                    {0, 1, 0, 0},
                    {1, 1, 1, 1}
            };
            rat.solveMaze(maze);
        }
    }

