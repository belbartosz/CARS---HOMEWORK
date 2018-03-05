public class CarOffer {

    Car car;
    int ofertaZakupu;
    int ofertaNajmu;

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

    @Override
    public String toString() {
        return "samochod " + car + ", oferta zakupu: " + ofertaZakupu + "pln, oferta najmu: " + ofertaNajmu + "pln";
    }
}
