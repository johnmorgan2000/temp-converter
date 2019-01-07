public class Converter {
    Double magnitude;
//    String unit;

    public Converter(Double magnitude, String unit) {
        this.magnitude = normalizeToCelsius(magnitude, unit);
//        this.unit = unit;
    }

    private Double normalizeToCelsius(Double magnitude, String unit) {
        switch (unit) {
            case "F":
                return (magnitude - 32) * 5 / 9;
            case "C":
                return magnitude;
            case "K":
                return  magnitude - 273.15;
            case "R":
                return (magnitude - 491.67) * 5 / 9;
            default:
                return null;
        }
    }

    public Double toFahrenheit() {
        return magnitude * 9 / 5 + 32;
    }

    public Double toCelsius() {
        return magnitude;
    }

    public Double toKelvin() {
        return magnitude + 273.15;
    }

    public Double toRankine() {
        return (magnitude + 273.15) * 9 / 5;
    }
}
