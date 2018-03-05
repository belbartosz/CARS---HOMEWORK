import java.time.LocalDate;


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


    @Override
    public String toString() {
        return marka + " / " + nazwa + " / " + typ + " / " + spalanie + "l/100km / silnik: " + pojSilnika + " / " +
                iloscMiejsc + "-miejscowy / " + mocSilnika + "KM / prod: " + dataProdukcji + " / automat: " + czyAutomat +
                " / naped: " + naped;
    }
}
