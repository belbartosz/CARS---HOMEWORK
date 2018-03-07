import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
        List<Car> wszystkieCZTERYxCZTERY = getLista().stream()
                .filter(car -> car.getNaped() == DriveType.CZTERYxCZTERY)
                .collect(Collectors.toList());
        return wszystkieCZTERYxCZTERY;
    }


    @Override
    public String toString() {
        return marka + " / " + nazwa + " / " + typ + " / " + spalanie + "l/100km / silnik: " + pojSilnika + " / " +
                iloscMiejsc + "-miejscowy / " + mocSilnika + "KM / prod: " + dataProdukcji + " / automat: " + czyAutomat +
                " / naped: " + naped;
    }
}
