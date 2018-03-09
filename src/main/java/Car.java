import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Car {

    private CarBrand marka;
    private String nazwa;
    private CarType typ;
    private double spalanie;
    private double pojSilnika;
    private int iloscMiejsc;
    private int mocSilnika;
    private LocalDate dataProdukcji;
    private boolean czyAutomat;
    private DriveType naped;
    private List<Car> lista;

    public Car() {
    }

    public Car(CarBrand marka, String nazwa, CarType typ, double spalanie, double pojSilnika,
               int iloscMiejsc, int mocSilnika, LocalDate dataProdukcji, boolean czyAutomat, DriveType naped) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.typ = typ;
        this.spalanie = spalanie;
        this.pojSilnika = pojSilnika;
        this.iloscMiejsc = iloscMiejsc;
        this.mocSilnika = mocSilnika;
        this.dataProdukcji = dataProdukcji;
        this.czyAutomat = czyAutomat;
        this.naped = naped;
    }


    public CarBrand getMarka() {
        return marka;
    }

    public void setMarka(CarBrand marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public CarType getTyp() {
        return typ;
    }

    public void setTyp(CarType typ) {
        this.typ = typ;
    }

    public double getSpalanie() {
        return spalanie;
    }

    public void setSpalanie(double spalanie) {
        this.spalanie = spalanie;
    }

    public double getPojSilnika() {
        return pojSilnika;
    }

    public void setPojSilnika(double pojSilnika) {
        this.pojSilnika = pojSilnika;
    }

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }

    public void setIloscMiejsc(int iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }

    public int getMocSilnika() {
        return mocSilnika;
    }

    public void setMocSilnika(int mocSilnika) {
        this.mocSilnika = mocSilnika;
    }

    public LocalDate getDataProdukcji() {
        return dataProdukcji;
    }

    public void setDataProdukcji(LocalDate dataProdukcji) {
        this.dataProdukcji = dataProdukcji;
    }

    public boolean isCzyAutomat() {
        return czyAutomat;
    }

    public void setCzyAutomat(boolean czyAutomat) {
        this.czyAutomat = czyAutomat;
    }

    public DriveType getNaped() {
        return naped;
    }

    public void setNaped(DriveType naped) {
        this.naped = naped;
    }

    public List<Car> getLista() {
        return lista;
    }

    public void setLista(List<Car> lista) {
        this.lista = lista;
    }

    //    lista wszystkich marek warsztatu
    public List<CarBrand> wszystkieMarki(CarShop warsztat) {
        List<CarBrand> marki = warsztat.getListaOfert().stream()
                .map(car -> car.getCar().getMarka())
                .collect(Collectors.toList());
        return marki;
    }

    //    lista wszystkich samochodow z napedem 4x4
    public List<Car> wszystkie4x4() {
        List<Car> samochody = getLista().stream()
                .filter(car -> car.getNaped() == DriveType.CZTERYxCZTERY)
                .collect(Collectors.toList());
        return samochody;
    }

    //    samochody nie starsze niz - bez parsowania
    public List<Car> samochodyNieStarszeNiz(LocalDate data) {
        List<Car> samochody = getLista().stream()
                .filter(car -> car.getDataProdukcji().isAfter(data))
                .collect(Collectors.toList());
        return samochody;
    }

    //    samochody nie starsze niz - z parsowaniem
    Scanner scanner = new Scanner(System.in);

    public List<Car> samochodyNieStarszeNizParse() {
        System.out.println("podaj date w formacie yyyy/MM/dd");
        String mojaData = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.parse(mojaData, formatter);
        List<Car> samochody = getLista().stream()
                .filter(car -> car.getDataProdukcji().isAfter(localDate))
                .collect(Collectors.toList());
        return samochody;
    }

    //    wszystkie samochody podanej marki
    public List<Car> wsztskieSamochodyPodanejMarki() {
        System.out.println("podaj marke");
        String marka = scanner.nextLine().toUpperCase();
        List<Car> samochody = getLista().stream()
                .filter(car -> car.getMarka().equals(CarBrand.valueOf(marka)))
                .collect(Collectors.toList());
        return samochody;
    }

    //    sortowanie samochodow po najnizszym spalaniu
    public List<Car> najmniejszeSpalanie() {
        List<Car> samochody = getLista().stream()
                .sorted(Comparator.comparing(Car::getSpalanie))
                .collect(Collectors.toList());
        return samochody;
    }

    //    sortowanie po nawiekszej mocy i zwrocenie
    public void najwiekszaMoc() {
        List<Car> samochody = getLista().stream()
                .sorted(Comparator.comparing(Car::getMocSilnika).reversed())
                .collect(Collectors.toList());
        samochody.stream().forEach(System.out::println);
    }


    @Override
    public String toString() {
        return marka + " / " + nazwa + " / " + typ + " / " + spalanie + "l/100km / silnik: " + pojSilnika + " / " +
                iloscMiejsc + "-miejscowy / " + mocSilnika + "KM / prod: " + dataProdukcji + " / automat: " + czyAutomat +
                " / naped: " + naped;
    }
}
