import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        System.out.print("ENTER WORDS: ");
        String words = scanner.nextLine().toLowerCase();
        String[] dizi = words.split(" ");

        HashMap<String,Integer> map = new HashMap<>();

        Arrays.sort(dizi);

        //  dizi değeri, daha önceden map dizisinde bulunduğuna dair sorgu yapar, ilk sorguda false döndüğü için countA 1 den başlatıp arttırıyoruz
        for (int i = 0; i < dizi.length; i++) {
            if(map.containsKey(dizi[i])){
                map.put(dizi[i],count);
                count++;
            }
            else{
                map.put(dizi[i],1);
                count = 1;
                count++;
            }
        }

        // tekrar etme durumu
        for (Map.Entry<String,Integer> ent : map.entrySet()){
            System.out.println("KELİME : " + ent.getKey());
            System.out.println("GEÇTİĞİ ADET : " + ent.getValue());
            System.out.println("----------------------------");
        }
        int loopWords = 0;
        String loopWord = "";
        for (Map.Entry<String,Integer> ent : map.entrySet()){
            if(ent.getValue() > loopWords){
                loopWord = ent.getKey();
                loopWords = ent.getValue();
            }
        }
        System.out.println("EN COK GECEN GELİME : " + loopWord +"\n" + "ADEDİ : " + loopWords);



    }
}