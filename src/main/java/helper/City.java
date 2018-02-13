package helper;

import java.util.Comparator;

public class City implements Comparable<City> {

    private String cityName;
    private int population;


    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public City(String cityName) {
        this.cityName = cityName;
    }

    public City(String cityName, int population) {
        this.cityName = cityName;
        this.population = population;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    @Override
    public int hashCode() {
        return this.cityName.hashCode();
    }


    // This method not allow add the same object
    @Override
    public boolean equals(Object obj) {

        if (obj != null && obj instanceof City) {
            String cityName = ((City) obj).getCityName();
            if (cityName != null && cityName.equals(this.cityName)) {
                return true;
            }

        }

        return false;
    }

    @Override
    public String toString() {
        return this.cityName;
    }

    //This method allow
    @Override
    public int compareTo(City o) {
        if (this.getPopulation() > o.getPopulation()) {
            return 1;
        } else if (this.getPopulation() < o.getPopulation()) {
            return -1;
        }

        return 0;
    }


}
