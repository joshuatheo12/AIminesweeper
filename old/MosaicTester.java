// import java.util.Scanner;

// public class MosaicTester{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int mosaic[][]=new int[5][5];
//         for(int i=0;i<5;i++){
//             for(int j=0;j<5;j++){
//                 mosaic[i][j]=sc.nextInt();
//             }
//         }
//         int populasiMax=sc.nextInt();
//         GeneticAlg ga=new GeneticAlg();
//         Populasi po=new Populasi();
//         po.inisialisasiPopulasi(populasiMax, 25);
//         Kromosom[] initpo=po.kromosom;
//         int mutateRate=sc.nextInt();
//         int crossoverRate=sc.nextInt();
//         ga.getSolution(initpo, crossoverRate, mutateRate,mosaic);
//         System.out.println("crossoverRate (%): "+crossoverRate );
//         System.out.println("mutationRate (%): "+mutateRate );
//         System.out.println("maxPopulation: "+populasiMax);
//         Kromosom res= ga.kromTerbaik;
//         System.out.println("jumlah generasi: "+ga.generationCount);
//         int counter=0;
//         for(int i=0;i<5;i++){
//             for(int j=0;j<5;j++){
//                 System.out.print(res.kromosom[counter]);
//                 counter++;
//             }
//             System.out.println();
//         }
//     }

// }