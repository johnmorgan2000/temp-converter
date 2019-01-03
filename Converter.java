public class Converter {
    Double magnitude;
    String unit;

    public Converter(Double magnitude, String unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    public Double toFahrenheit() {
        if (unit.equals("F")) {
            return magnitude;
        } else if (unit.equals("C")) {
            return magnitude * 9 / 5 + 32;
        } else if (unit.equals("K")) {
            return magnitude - 32 * 5 / 9 + 273.15;
        } else if (unit.equals("R")) {
            return magnitude - 459.67;

        } else {
            return null;
        }
    }

    public Double toCelsius() {
        if (unit.equals("F")) {
            return (magnitude - 32) * 5 / 9;
        } else if (unit.equals("C")) {
            return magnitude;
        } else if (unit.equals("K")) {
            return (magnitude + 273.15);
        } else if (unit.equals("R")) {
            return (magnitude - 491.67) * 5 / 9;
        }

        else {
            return null;
        }
    }

    public Double toKelvin() {
        if (unit.equals("F")) {
            return (magnitude + 459.67) * 5 / 9;
        } else if (unit.equals("C")) {
            return magnitude + 273.15;
        } else if (unit.equals("K")) {
            return magnitude;
        } else if (unit.equals("R")) {
            return magnitude * 5 / 9;
        } else {
            return null;
        }
    }

    public Double toRankine() {
        if (unit.equals("F")) {
            return (magnitude + 459.67);
        } else if (unit.equals("C")) {
            return (magnitude + 273.15) * 9 / 5;
        } else if (unit.equals("K")) {
            return magnitude * 9 / 5;
        } else if (unit.equals("R")) {
            return magnitude;
        } else {
            return null;
        }
    }
}
