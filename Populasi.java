public class Populasi {
    public int gagal=0;
    public Kromosom kromTerbaik, kromTerbaik2;
    public Kromosom[] kromosom;
    public void inisialisasiPopulasi(int banyakKromosom, int total, int[] prodPerTipe) {
        this.kromosom = new Kromosom[banyakKromosom];
        for (int i = 0; i < this.kromosom.length; i++) {
            this.kromosom[i] = new Kromosom(total /*,prodPerTipe*/);
        }
    }
    public void cariDuaKromosomTerbaik() {
        int terbaikIndex = this.kromosom.length - 1;
        int terbaikKeduaIndex = this.kromosom.length - 1;
        for (int i = 0; i < this.kromosom.length; i++) {
            if (this.kromosom[i].gagal < this.kromosom[terbaikIndex].gagal) {
                terbaikKeduaIndex = terbaikIndex;
                terbaikIndex = i;
            } else if (this.kromosom[i].gagal < this.kromosom[terbaikKeduaIndex].gagal) {
                terbaikKeduaIndex = i;
            }
        }
        this.gagal = this.kromosom[terbaikIndex].gagal;
        this.kromTerbaik = this.kromosom[terbaikIndex];
        this.kromTerbaik2 = this.kromosom[terbaikKeduaIndex];
    }
    public int cariIndexKromosomTerburuk(){
        int terburuk=Integer.MAX_VALUE;
        int indexTerburuk=0;
        for(int i=0;i<this.kromosom.length;i++){
            if(terburuk>= this.kromosom[i].gagal){
                terburuk=this.kromosom[i].gagal;
                indexTerburuk=i;
            }
        }
        return indexTerburuk;
    }
    public void hitungFitness(){
        for(Kromosom krom : this.kromosom){
            krom.hitungFitnessKromosom();
        }
        cariDuaKromosomTerbaik();
    }
}
