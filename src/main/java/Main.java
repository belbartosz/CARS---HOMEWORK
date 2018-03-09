import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

//        WIEM, ZE NAZWY METOD NIE POWINNY BYC TAK DLUGIE, ALE CHCIALEM ABY BYLO "PRZEJRZYSCIE"

        Car car1 = new Car(CarBrand.BMW, "X6", CarType.SUV, 12.0, 3.0, 5, 245, LocalDate.of(2014, 4, 1), true, DriveType.CZTERYxCZTERY);
        Car car2 = new Car(CarBrand.AUDI, "QUATTRO", CarType.SEDAN, 9.2, 2.2, 2, 220, LocalDate.of(1988, 2, 22), false, DriveType.CZTERYxCZTERY);
        Car car3 = new Car(CarBrand.MERCEDES, "GLS", CarType.SUV, 16.0, 4.6, 5, 215, LocalDate.of(2008, 12, 12), true, DriveType.TYL);
        Car car4 = new Car(CarBrand.HONDA, "CONCERTO", CarType.HATCHBACK, 6.1, 1.6, 5, 130, LocalDate.of(1991, 9, 9), true, DriveType.PRZOD);
        Car car5 = new Car(CarBrand.MAZDA, "3", CarType.HATCHBACK, 5.8, 2.0, 5, 150, LocalDate.of(2006, 6, 6), false, DriveType.PRZOD);
        Car car6 = new Car(CarBrand.FORD, "T", CarType.SEDAN, 12.5, 2.9, 2, 23, LocalDate.of(1927, 3, 29), false, DriveType.TYL);
        Car car7 = new Car(CarBrand.FIAT, "126p", CarType.CABRIO, 4.2, 0.6, 4, 24, LocalDate.of(1979, 12, 28), false, DriveType.TYL);
        Car car8 = new Car(CarBrand.VW, "Passat", CarType.KOMBI, 6.6, 1.8, 5, 180, LocalDate.of(2016, 10, 10), true, DriveType.CZTERYxCZTERY);
        Car car9 = new Car(CarBrand.TESLA, "S", CarType.HATCHBACK, 0.0, 0, 5, 360, LocalDate.of(2018, 1, 1), true, DriveType.CZTERYxCZTERY);
        Car car10 = new Car(CarBrand.MITSUBISHI, "COLT", CarType.HATCHBACK, 5.2, 1.3, 5, 77, LocalDate.of(2002, 5, 1), false, DriveType.PRZOD);
        List<Car> listaWszystkichSamochodow = Arrays.asList(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10);

        CarOffer oferta1 = new CarOffer(car1, 160000, 4000);
        CarOffer oferta2 = new CarOffer(car2, 130000, 3500);
        CarOffer oferta3 = new CarOffer(car3, 210000, 7200);
        CarOffer oferta4 = new CarOffer(car4, 6000, 900);
        CarOffer oferta5 = new CarOffer(car5, 55000, 1300);
        CarOffer oferta6 = new CarOffer(car6, 500000, 11000);
        CarOffer oferta7 = new CarOffer(car7, 800, 120);
        CarOffer oferta8 = new CarOffer(car8, 110000, 2800);
        CarOffer oferta9 = new CarOffer(car9, 280000, 8800);
        CarOffer oferta10 = new CarOffer(car10, 1600, 300);
        List<CarOffer> listaWszystkichOfert = Arrays.asList(oferta1, oferta2, oferta3, oferta4, oferta5, oferta6, oferta7, oferta8, oferta9, oferta10);

        CarShop sklep1 = new CarShop("SALON U ZENKA", new ArrayList<>());
        CarShop sklep2 = new CarShop("DE LUXE SALOON", new ArrayList<>());
        CarShop sklep3 = new CarShop("OLD SCHOOL - RARYTASY", new ArrayList<>());

        sklep1.addOffer(oferta4, oferta5, oferta10);
        sklep2.addOffer(oferta1, oferta3, oferta9);
        sklep3.addOffer(oferta2, oferta6, oferta7);

        Car carr = new Car();
        carr.setLista(listaWszystkichSamochodow);
        System.out.println(carr.wszystkieMarki(sklep1));
        System.out.println(carr.wszystkie4x4());
        System.out.println(carr.samochodyNieStarszeNiz(LocalDate.of(2000,02,02)));
        System.out.println(carr.samochodyNieStarszeNizParse());
        System.out.println(carr.wsztskieSamochodyPodanejMarki());
        System.out.println(carr.najmniejszeSpalanie());
        carr.najwiekszaMoc();

        CarOffer carOffer = new CarOffer();
        carOffer.setListaOfert(listaWszystkichOfert);
        System.out.println(carOffer.listaSamochodowOferty());
        System.out.println(carOffer.listaNajtanszychOfertNajmu());
        System.out.println(carOffer.listaWsztkichSamochodowOferty());
        System.out.println(carOffer.listaNajmocniejszychSamochodowONajnizszejCenie());

    }


}
