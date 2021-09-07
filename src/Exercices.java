import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercices {
    public List exercice1(List<String> liste){
        liste = liste.stream().map((s) -> s.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une nouvelle liste
        dont tous les éléments sont en majuscules
         */
        return liste;
    }

    public List exercice2(List<String> liste){
        liste = liste.stream().filter(s -> !s.equals("INUTILE")).collect(Collectors.toList());
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une nouvelle liste
        dont les string "INUTILE" ont été retirées
         */
        return liste;
    }

    public String exercice3(List<String> liste){
        String s = " ";
        s = liste.stream().map(Objects::toString).collect(Collectors.joining(""));
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une string composée
        de toutes les string de la liste concaténées
         */
        return s;
    }


    public String exercice4(List<String> liste){
        String y = " ";
        y = liste.stream().map(s -> s.toUpperCase(Locale.ROOT)).collect(Collectors.toList()).stream().filter(s -> !s.equals("AAA")).collect(Collectors.toList()).stream().map(Object::toString).collect(Collectors.joining(""));
        /*
        Utilisez les streams pour transformer la liste en paramètre de la façon suivante:
        1. Mettre tous les éléments de la liste en majuscule
        2. Retirer tous les éléments "AAA"
        3. Concaténer tous les éléments de la liste pour former une string
         */
        return y;
    }

    public List exercice5(List<Integer> liste){
        liste = liste.stream().map(integer -> integer*2).collect(Collectors.toList());
        /*
        Utilisez les streams sur la liste en paramètre afin de retourner une nouvelle liste
        dont les éléments ont été doublés
         */
        return liste;
    }

    public Integer exercice6(List<Integer> liste){
        Integer x;
        x = liste.stream().reduce((acc,nouveau) -> acc * nouveau).get();
        /*
        Utilisez les streams sur la liste en paramètre afin de retourner le produit des éléments de la liste.
         */
        return x;
    }

    public List exercice7(List<Integer> liste){
        liste = liste.stream().filter((n) -> !(n*n < 50)).collect(Collectors.toList());
        /*
        Utilisez les streams pour trouver tous les éléments dont le carré est supérieur à 50. Retournez une liste.
         */
        return liste;
    }

    public List exercice8(List<Integer> liste){
        liste = liste.stream().map(integer -> integer*9).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        /*
        Utilisez les streams pour trouver le premier chiffre des nombres de la liste passée en paramètre lorsqu'on
         les multiplie par 9.
         */
        return liste;
    }

    public List exercice9(){
        List<Integer>listeInteger;
        listeInteger = IntStream.iterate(0, (n)->n+1).filter((n)->n%3 == 0).filter((n)->n%7 == 0).filter((n)->!(n==0)).limit(10).boxed().collect(Collectors.toList());
        /*
        Créez un stream infini d'entiers et utilisez le pour trouver les 10 premiers nombres divisibles par 3 et par 7.
         */
        return listeInteger;
    }

    public List exercice10(){
        List<Integer>integerList;
        integerList = IntStream.iterate(0,(n)->n+1).map((n)->n*n).filter((n)->!(n==0)).limit(20).boxed().collect(Collectors.toList());
        /*
        Générez la liste des 20 premiers carrés parfaits grâce à un stream infini.
         */
        return integerList;
    }
}
