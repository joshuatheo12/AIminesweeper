// public class Populasi {
//     public Kromosom kromTerbaik, kromTerbaik2;
//     public Kromosom[] kromosom;
//     public void inisialisasiPopulasi(int banyakKromosom, int size) {
//         this.kromosom = new Kromosom[banyakKromosom];
//         for (int i = 0; i < this.kromosom.length; i++) {
//             this.kromosom[i] = new Kromosom(size);
//         }
//     }
//     public void cariDuaKromosomTerbaik() {
//         int terbaikIndex = this.kromosom.length - 1;
//         int terbaikKeduaIndex = this.kromosom.length - 1;
//         for (int i = 0; i < this.kromosom.length; i++) {
//             if (this.kromosom[i].fitness > this.kromosom[terbaikIndex].fitness) {
//                 terbaikKeduaIndex = terbaikIndex;
//                 terbaikIndex = i;
//             } else if (this.kromosom[i].fitness > this.kromosom[terbaikKeduaIndex].fitness) {
//                 terbaikKeduaIndex = i;
//             }
//         }
//         this.kromTerbaik = this.kromosom[terbaikIndex];
//         this.kromTerbaik2 = this.kromosom[terbaikKeduaIndex];
//     }
//     public int cariIndexKromosomTerburuk(){
//         int terburuk=Integer.MIN_VALUE;
//         int indexTerburuk=0;
//         for(int i=0;i<this.kromosom.length;i++){
//             if(terburuk<= this.kromosom[i].fitness){
//                 terburuk=this.kromosom[i].fitness;
//                 indexTerburuk=i;
//             }
//         }
//         return indexTerburuk;
//     }
//     public void hitungFitness(int[][] mosaic){
//         for(Kromosom krom : this.kromosom){
//             krom.hitungFitnessKromosom(mosaic);
//         }
//         cariDuaKromosomTerbaik();
//     }
// }
