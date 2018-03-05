import java.time.LocalDate;

public class Car {

    CarBrand marka;
    String nazwa;
    CarType typ;
    double spalanie;
    double pojSilnika;
    int iloscMiejsc;
    int mocSilnika;
    LocalDate dataProdukcji;
    boolean czyAutomat;
    DriveType naped;

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

    @Override
    public String toString() {
        return "Car{" +
                "marka=" + marka +
                ", nazwa='" + nazwa + '\'' +
                ", typ=" + typ +
                ", spalanie=" + spalanie +
                ", pojSilnika=" + pojSilnika +
                ", iloscMiejsc=" + iloscMiejsc +
                ", mocSilnika=" + mocSilnika +
                ", dataProdukcji=" + dataProdukcji +
                ", czyAutomat=" + czyAutomat +
                ", naped=" + naped +
                '}';
    }
}
