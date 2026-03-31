package BridgeLabz_Day36_FutureLogistic;

abstract class GoodsTransport {
    protected String transportId;
    protected String transportDate;
    protected int transportRating;

    public GoodsTransport(String transportId, String transportDate, int transportRating) {
        this.transportId = transportId;
        this.transportDate = transportDate;
        this.transportRating = transportRating;
    }
    public String getTransportId() {
        return transportId;
    }
    public String getTransportDate() {
        return transportDate;
    }
    public int getTransportRating() {
        return transportRating;
    }
    public abstract String vehicleSelection();
    public abstract float calculateTotalCharge();
}

// --------------------------------------------------

class BrickTransport extends GoodsTransport {

    private float brickSize;
    private int brickQuantity;
    private float brickPrice;

    public BrickTransport(String transportId, String transportDate, int transportRating,
                          float brickSize, int brickQuantity, float brickPrice) {
        super(transportId, transportDate, transportRating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }
    public String vehicleSelection() {
        if (brickQuantity < 300) {
            return "Truck";
        }
        else if (brickQuantity <= 500) {
            return "Lorry";
        }
        else {
            return "MonsterLorry";
        }
    }

    public float calculateTotalCharge() {
        float price = brickPrice * brickQuantity;
        float tax = price * 0.3f;
        float discount = 0;
        if (transportRating == 5) {
            discount = price * 0.20f;
        }
        else if (transportRating >= 3) {
            discount = price * 0.10f;
        }
        int vehiclePrice;
        if (vehicleSelection().equalsIgnoreCase("Truck")) {
            vehiclePrice = 1000;
        }
        else if (vehicleSelection().equalsIgnoreCase("Lorry")) {
            vehiclePrice = 1700;
        }
        else {
            vehiclePrice = 3000;
        }
        return price + tax + vehiclePrice - discount;
    }

    public int getBrickQuantity() {
        return brickQuantity;
    }

    public float getBrickPrice() {
        return brickPrice;
    }
}

// --------------------------------------------------

class TimberTransport extends GoodsTransport {

    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;

    public TimberTransport(String transportId, String transportDate, int transportRating,
                           float timberLength, float timberRadius,
                           String timberType, float timberPrice) {
        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }

    public String vehicleSelection() {
        float area = 2 * 3.147f * timberRadius * timberLength;
        if (area < 250) {
            return "Truck";
        }
        else if (area <= 400) {
            return "Lorry";
        }
        else {
            return "MonsterLorry";
        }
    }

    public float calculateTotalCharge() {
        float volume = 3.147f * timberRadius * timberRadius * timberLength;
        float rate;
        if (timberType.equalsIgnoreCase("Premium")) {
            rate = 0.25f;
        }
        else {
            rate = 0.15f;
        }
        float price = volume * timberPrice * rate;
        float tax = price * 0.3f;
        float discount = 0;
        if (transportRating == 5) {
            discount = price * 0.20f;
        }
        else if (transportRating >= 3) {
            discount = price * 0.10f;
        }
        int vehiclePrice;
        if (vehicleSelection().equalsIgnoreCase("Truck")) {
            vehiclePrice = 1000;
        }
        else if (vehicleSelection().equalsIgnoreCase("Lorry")) {
            vehiclePrice = 1700;
        }
        else {
            vehiclePrice = 3000;
        }
        return price + tax + vehiclePrice - discount;
    }

    public String getTimberType() {
        return timberType;
    }

    public float getTimberPrice() {
        return timberPrice;
    }
}

// --------------------------------------------------

class Utility {

    public boolean validateTransportId(String transportId) {
        if (!transportId.matches("RTS\\d{3}[A-Z]")) {
            System.out.println("Transport id " + transportId + " is invalid");
            System.out.println("Please provide a valid record");
            return false;
        }
        return true;
    }

    public GoodsTransport parseDetails(String input) {

        String[] data = input.split(":");

        if (!validateTransportId(data[0])) {
            return null;
        }

        if (data[3].equalsIgnoreCase("BrickTransport")) {
            return new BrickTransport(
                    data[0], data[1], Integer.parseInt(data[2]),
                    Float.parseFloat(data[4]),
                    Integer.parseInt(data[5]),
                    Float.parseFloat(data[6])
            );
        }
        else {
            return new TimberTransport(
                    data[0], data[1], Integer.parseInt(data[2]),
                    Float.parseFloat(data[4]),
                    Float.parseFloat(data[5]),
                    data[6],
                    Float.parseFloat(data[7])
            );
        }
    }

    public String findObjectType(GoodsTransport goodsTransport) {
        if (goodsTransport instanceof TimberTransport) {
            return "TimberTransport";
        }
        else {
            return "BrickTransport";
        }
    }
}
