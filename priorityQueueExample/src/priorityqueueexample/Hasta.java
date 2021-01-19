package priorityqueueexample;

class Hasta implements Comparable<Hasta>{
    private String isim;
    private String sikayet;
    private int oncelik;

    public Hasta(String isim, String sikayet) {
        this.isim = isim;
        this.sikayet = sikayet;
        if(sikayet.equals("apandist")){
            this.oncelik=3;
        }
        else if(sikayet.equals("yanık")){
            this.oncelik=2;
        }
        else {
            this.oncelik=1;
        }
    }

    @Override
    public int compareTo(Hasta hasta) {
       if(this.oncelik>hasta.oncelik){
           return -1;
       }
       else if(this.oncelik<hasta.oncelik){
           return 1;
       }
       else return 0;
    }

    @Override
    public String toString() {
       String bilgiler="Hasta adı: "+isim+"\nŞikayet: "+sikayet+"\nÖncelik: "+oncelik;
       return bilgiler;
    }
    
}
