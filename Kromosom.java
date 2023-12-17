import java.util.Random;

public class Kromosom {
    public int gagal,delay;
    public int[] kromosom;

    public int[][] urutan;
    public int[] tempMasuk;
    // public int[] idTipe;
    public Kromosom(int total /*,int[] prodPerTipe*/) {
        this.kromosom = new int[total];
        // this.idTipe = new int[total];

        // int counter = 0;
        // for (int i = 0; i < prodPerTipe.length; i++) {
        //     for (int j = 0; j < prodPerTipe[i]; j++) {
        //         // this.kromosom[counter] = this.tipeMobil[i];
        //         this.kromosom[counter] = counter;
        //         // this.idTipe[counter] = i;
        //         counter++;
        //     }
        // }
        Random rn = new Random();
        for (int i = this.kromosom.length - 1; i > 0; i--) {
            int index = rn.nextInt(i + 1);
            int a = this.kromosom[index];
            this.kromosom[index] = this.kromosom[i];
            this.kromosom[i] = a;
        }
    }
    public void hitungFitnessKromosom(){

    }


}
