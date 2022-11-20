public class Drzewo {
    Galaz korzen = new Galaz(14);

    class Galaz {
        Galaz lewa;
        Galaz prawa;
        int wartosc;

       public Galaz(int wartosc) {
            this.wartosc = wartosc;
            this.lewa = null;
            this.prawa = null;
       }
        public String toString() {
           return String.valueOf(wartosc) + " ";
        }

        public void dodajGalaz(int wartosc) {
            System.out.println("szukam miejsca dla " + wartosc);
            if (this.lewa == null) {
                this.lewa = new Galaz(wartosc);
                System.out.println("Dodano wartość: " + wartosc + " w lewym nodzie");
            } else if (this.prawa == null) {
                this.prawa = new Galaz(wartosc);
                System.out.println("Dodano wartość: " + wartosc + " w prawym nodzie");
            } else {
                if (this.lewa.wartosc <= wartosc) {
                    System.out.println("Tworze noda po lewej");
                    this.lewa.dodajGalaz(wartosc);
                } else {
                    System.out.println("Tworze noda po prawej");
                    this.prawa.dodajGalaz(wartosc);
                }
            }

        }
        /*boolean contains (int wartosc) {
            if (wartosc == this.wartosc) {
                return true;
            }
            if (wartosc <)


            return false;
        }*/
    }
}
