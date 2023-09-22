public class Tram extends PublicTransport {
    public Tram(int passengerCapacity) {
        super(passengerCapacity);
        this.stopList = new String[]{"Нагатинская", "Хлебозаводский проезд", "МИФИ"};
    }


    @Override
    public void move() {
        if (this.isGoingBackwards && this.currentStop == 0) {
            this.isGoingBackwards = false;
        }
        if (!this.isGoingBackwards && this.currentStop == this.stopList.length - 1) {
            this.isGoingBackwards = true;
        }
        if (this.isGoingBackwards) {
            this.currentStop--;
            return;
        }
        this.currentStop++;
    }
}
