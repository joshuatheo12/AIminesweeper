// import java.util.Random;

// public class Kromosom {
//     public int[] kromosom;
//     public int fitness;
//     public Kromosom(int size) {
//         this.kromosom = new int[size];
//         Random rn = new Random();
//         for (int i = this.kromosom.length - 1; i > 0; i--) {
//             int index = rn.nextInt(i + 1);
//             int a = this.kromosom[index];
//             this.kromosom[index] = this.kromosom[i];
//             this.kromosom[i] = a;
//         }
//     }
//     public void hitungFitnessKromosom(int[][] mosaic){
//         int[][] kromosomRep=new int[5][5];
//         int counterKrom=0;
//         int tempFitness=0;
//         int temp;
//         for(int i=0;i<5;i++){
//             for(int j=0;j<5;j++){
//                 kromosomRep[i][j]=this.kromosom[counterKrom];
//                 counterKrom++;
//             }
//         }

//         for(int i=0;i<5;i++){
//             for(int j=0;j<5;j++){
//                 if(mosaic[i][j]!=-1){
//                     temp=0;
//                     if(i-1>=0){
//                         if(j-1>=0 && kromosomRep[i-1][j-1]==1){
//                             temp++;
//                         }
//                         if(kromosomRep[i-1][j]==1) temp++;
//                         if(j+1<5 && kromosomRep[i-1][j+1]==1){
//                             temp++;
//                         }
//                     }

//                     if(j-1>=0 && kromosomRep[i][j-1]==1)temp++;
//                     if(kromosomRep[i][j]==1)temp++;
//                     if(j+1<5 && kromosomRep[i][j+1]==1)temp++;    
                        
//                     if(i+1<5){
//                         if(j-1>=0 && kromosomRep[i+1][j-1]==1){
//                             temp++;
//                         }
//                         if(kromosomRep[i+1][j]==1) temp++;
//                         if(j+1<5 && kromosomRep[i+1][j+1]==1){
//                             temp++;
//                         }
//                     }

//                     if(mosaic[i][j]>=temp) tempFitness+=temp;
//                     else tempFitness+= mosaic[i][j]-(temp-mosaic[i][j]);
//                 }
                
//             }
//         }
//         this.fitness=tempFitness;

//     }
// }
