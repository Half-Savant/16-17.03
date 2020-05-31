package com.company;
//16-17.03
class KameraPozycja{
    int szerokość2; //max 500
    int wysokość2; //max 600
}
class Obraz{
    int szerokośćdocelowa2=500;
    int wysokośćdocelowa2=600;
}

public class Main {

    public static void main(String[] args) {
        int szerokość=0; int szerokośćdocelowa=500;
        int wysokość=0; int wysokośćdocelowa=600;
        int licznik =0;

        do{
            do {
                System.out.println("Zdjęcie - Pozycja pozioma: " + szerokość + " Pozycja pionowa: " + wysokość);
                szerokość += 40;
                licznik++;
            }while(szerokość <= szerokośćdocelowa);
            szerokość=0;
            wysokość+=40;
        }
        while(wysokość <= wysokośćdocelowa);
        System.out.println("Wynik kroku 1 - Ilość zdjęć wykonanych przez kamerę: " + licznik);

        KameraPozycja kamera = new KameraPozycja();
        Obraz obrazek = new Obraz();

        int licznik2 = 0;
        do {
            do
            {
                System.out.println("Pozycja - X: " + kamera.szerokość2 + " | Y: " + kamera.wysokość2);
                kamera.szerokość2 +=40;
                licznik2++;
            }
            while(kamera.szerokość2 <= obrazek.szerokośćdocelowa2);

            do{
                if (kamera.szerokość2 - obrazek.szerokośćdocelowa2 != 0)
                {
                    int roznica = kamera.szerokość2 - obrazek.szerokośćdocelowa2;
                    kamera.szerokość2 -=roznica;
                    System.out.println("Pozycja - X: " + kamera.szerokość2 + " | Y: " + kamera.wysokość2);
                }
            }
            while(kamera.szerokość2 <= obrazek.szerokośćdocelowa2);
        }
        while(kamera.wysokość2 <= obrazek.wysokośćdocelowa2);
        System.out.println("Wynik kroku 2 - Ilość zdjęć wykonanych przez kamerę: " + licznik2);
    }
}
