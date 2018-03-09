import java.util.*;
import java.util.stream.Collectors;

public class CarOffer {

    private Car car;
    private int ofertaZakupu;
    private int ofertaNajmu;
    private List<CarOffer> listaOfert;

    public CarOffer() {
    }

    public CarOffer(Car car, int ofertaZakupu, int ofertaNajmu) {
        this.car = car;
        this.ofertaZakupu = ofertaZakupu;
        this.ofertaNajmu = ofertaNajmu;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getOfertaZakupu() {
        return ofertaZakupu;
    }

    public void setOfertaZakupu(int ofertaZakupu) {
        this.ofertaZakupu = ofertaZakupu;
    }

    public int getOfertaNajmu() {
        return ofertaNajmu;
    }

    public void setOfertaNajmu(int ofertaNajmu) {
        this.ofertaNajmu = ofertaNajmu;
    }

    public List<CarOffer> getListaOfert() {
        return listaOfert;
    }

    public void setListaOfert(List<CarOffer> listaOfert) {
        this.listaOfert = listaOfert;
    }

    //    lista samochodow posortowanych po cenie zakupu
    public List<Car> listaSamochodowOferty() {
        List<Car> samochody = getListaOfert().stream()
                .sorted(Comparator.comparing(CarOffer::getOfertaZakupu))
                .map(car -> car.getCar())
                .collect(Collectors.toList());
        return samochody;
    }

    //    lista 3 najtanszych ofert
    public List<CarOffer> listaNajtanszychOfertNajmu() {
        List<CarOffer> oferty = getListaOfert().stream()
                .sorted(Comparator.comparing(CarOffer::getOfertaNajmu)).limit(3)
                .collect(Collectors.toList());
        return oferty;
    }

    //    lista wszystkich samochodow w ofertach
    public List<Car> listaWsztkichSamochodowOferty() {
        List<Car> samochody = getListaOfert().stream()
                .map(car -> car.getCar())
                .collect(Collectors.toList());
        return samochody;
    }

    //    lista samochodow z nawieksza moca i najnizsza cena
//    - nie specjalnie wiedzialem o co chodzi w tym poleceniu
//    wiec wprowadzilem sortowanie odzwierciedlajace cene
//    1kM i wyciagnalem 5 samochodow o najwyzszej wartosci
    public List<Car> listaNajmocniejszychSamochodowONajnizszejCenie() {
        Map<Integer, CarOffer> mapa = new TreeMap<>();
        for (int i = 0; i < getListaOfert().size(); i++) {
            mapa.put(getListaOfert().get(i).getOfertaZakupu() / getListaOfert().get(i).getCar().getMocSilnika(), getListaOfert().get(i));
        }
        List<Car> samochody = mapa.entrySet().stream()
                .map(c -> c.getValue().getCar()).limit(5)
                .collect(Collectors.toList());
        return samochody;
    }

    @Override
    public String toString() {
        return "samochod " + car + ", oferta zakupu: " + ofertaZakupu + "pln, oferta najmu: " + ofertaNajmu + "pln";
    }
}
