package sample;

import sample.mvc.controlleur.LecteurDeFichier;
import sample.mvc.controlleur.Operation;
import sample.mvc.modele.Matrice;

import java.io.IOException;
import java.util.List;

public class Main2 {

    public static void main(String[] args) throws IOException {

        /*Matrice test = new Matrice(2,2);
        System.out.println(test.toString());
        System.out.println(test.estValide());*/
        /*Matrice a = GenererMatrice.genererMatrice(3,3);
        System.out.println(a.getElements().toString());
        System.out.println(a.toString());
        System.out.println(Operation.determinantOp(a));*/
        /*System.out.println(a.estValide());
        System.out.println(Operation.listeFraction(a).toString());
        System.out.println(Operation.transposition(a).toString());
        Matrice b = GenererMatrice.genererMatrice(1,1);
        System.out.println(b.toString());*/
        /*Matrice c = Operation.addition(a,b);
        if (c != null)
            System.out.println(c.toString());
        Matrice d = Operation.soustraction(a,b);
        if (d != null)
            System.out.println(d.toString());
        Matrice e = Operation.multiplication(a, 2);
        System.out.println(e.toString());
        Matrice g = Operation.produitMatriciel(a,b );
        if (g != null)
            System.out.println(g.toString());
        Matrice h = Operation.inverse(a);
        System.out.println(h);
        Matrice i = Operation.produitTensoriel(a,b );
        System.out.println(i);

        Matrice j = Operation.inverse(a);
        System.out.println(j);*/

        //DecimalFormat df = new DecimalFormat("#,##0.##");

        //System.out.println(df.format(1244550.0512));

        LecteurDeFichier test = new LecteurDeFichier();
        Matrice a = LecteurDeFichier.stringtoMatrice(test.getliste().get(0));
        List<String> liste = LecteurDeFichier.stringToOperation(test.getliste().get(1));
        System.out.println(a);
        liste.forEach(System.out::println);

    }
}
