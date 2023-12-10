import java.util.Scanner;

public class MosaicTester{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int mosaic[][]=new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                mosaic[i][j]=sc.nextInt();
            }
        }
    }

}