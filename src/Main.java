import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
       /* int apples = 0;
        int oranges = 0;
        int coins = 0;

        boolean flag = true;
        while (flag) {
            try {
                flag = false;
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Podaj liczbe jablek: ");
                apples = Integer.parseInt(br.readLine());
                System.out.println("Podaj liczbe pomaranczy: ");
                oranges = Integer.parseInt(br.readLine());
                System.out.println("Podaj liczbe zlotych monet: ");
                coins = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("Blad. Sprobuj ponownie");
                System.out.println();
                flag = true;
            }
        }
        System.out.println(13);
        goShopping(apples, oranges, coins);

    }

    public static void goShopping(int j, int p, int z) {
        for (; z > 0; z--) {
            if (j > p) {
                p++;
            } else {
                j++;
            }
        }
        // print result
        System.out.println("j: " + j);
        System.out.println("p: " + p);
        System.out.println("z: " + z);
        System.out.println("Minimalna roznica: " + Math.abs(j - p));

    }
*/

        Drzewo drzewo = new Drzewo();
        drzewo.korzen.dodajGalaz(2);
        drzewo.korzen.dodajGalaz(5);
        drzewo.korzen.dodajGalaz(4);
        drzewo.korzen.dodajGalaz(6);
        drzewo.korzen.dodajGalaz(3);
        drzewo.korzen.dodajGalaz(8);
        drzewo.korzen.dodajGalaz(42);
        drzewo.korzen.dodajGalaz(55);
        drzewo.korzen.dodajGalaz(4);
        drzewo.korzen.dodajGalaz(33);
        drzewo.korzen.dodajGalaz(4);
        drzewo.korzen.dodajGalaz(4);
        drzewo.korzen.dodajGalaz(22);
        drzewo.korzen.dodajGalaz(24);
        drzewo.korzen.dodajGalaz(4);
        drzewo.korzen.dodajGalaz(4);
        //drzewo.korzen.wyswietlDrzewo();
    }
}
