package ebobbulma;
public class EbobBulma {
    
    
public static void ebob(int sayi1,int sayi2){
int min=sayi1;
int eboblar=1;
if(sayi2<sayi1){
    min=sayi2;
}
for(int i=2;i<min;i++){

if(sayi1%i==0){
    if(sayi2%i==0){
        eboblar*=i;
}
}
    
}System.out.println(eboblar);   
}



    public static void main(String[] args) {
        ebob(13,17);
    }
    
}
