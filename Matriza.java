package foo;

import java.util.*;

public class Matriza{
    final int COLUMNS;
    final int ROW;
    int[][] Mc;
    // private CheckR check = null;
    static Scanner reader = new Scanner(System.in);
    CheckR check;

    public Matriza(int r, int c){
        COLUMNS = c;
        ROW = r;
        Mc = new int[ROW][COLUMNS];
        check = CheckR.NRIBOA;
        asked();
    }

    public Matriza(int r){
        ROW = r;
        COLUMNS = 0;
        Mc = new int[ROW][ROW];
        check = CheckR.RIBOA;
        asked();
    }

    public static void asked(){
        System.out.println("you wont to init?");
        System.out.println("yes or not?");
        String che = reader.nextLine();
        switch(che){
            case "yes":
                break;
            case "not":
                System.out.println("you need to init else you canot run the mathod");
                break;
        }
    }

    public static void init(int[][] Ma){
        int z = 1;
        for(int x = 0; x < Ma.length; x++){
            for(int j = 0; j < Ma[x].length; j++){
                Ma[x][j] = z;
            }
        }
    }


    public int getLenAboveProption(){
        int sherd = Mc[0].length -1, sum = 0;
        for(int x = sherd; x > 0; x--){
            sum += x;
        }
        return sum;
    }

    public int getAboveProption(int len){
        int maxC = Mc[0].length -1;
        int maxR = maxC -1;
        int col = Mc[0].length - maxC;
        int line = 0;
        int mDF = col;
        int sumG = 0;
        for(int x = 0; x < len; x++){
            if(col == maxC){
                mDF++;
                col = mDF;
                line++;
            };
            if(line == maxR){
                break;
            };
            sumG += Mc[line][col];
            col++;
        }
        return sumG;
    }

    public int getCrossProption(int len){
        int sum = 0;
        for(int i = 0; i < len; i++){
            sum += Mc[i][i];
        }
        return sum;

    }

    public int getSeconedCrossProption(int len){
        int sum = 0, n = Mc[0].length;
        for(int i = 0; i < len; i++){
            sum += Mc[i][n -i -1];
        }
        return sum;
    }
}
//,