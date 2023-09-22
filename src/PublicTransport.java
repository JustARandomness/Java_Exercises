public abstract class PublicTransport implements Vehicle {
    protected int passangerCapacity;

    protected boolean isGoingBackwards = false;

    protected int currentStop;

    protected String[] stopList;

    public void announceRoute() {
        if (this.isGoingBackwards) {
            System.out.print(stopList[-1]);
            for (int i = this.stopList.length - 2; i >= 0; --i) {
                System.out.print(" -> " + stopList[i]);
            }
        }
        else {
            System.out.print(stopList[0]);
            for (int i = 1; i < stopList.length; ++i) {
                System.out.print(stopList[i]);
            }
        }
    }

    public PublicTransport(int passangerCapacity) {
        this.currentStop = 0;
        isGoingBackwards = false;
        this.passangerCapacity = passangerCapacity;
    }

    public String getCurrentStop() {
        return this.stopList[currentStop];
    }
}
