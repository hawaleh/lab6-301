package com.example.listycityy;


/**
 * this is a class that defines a city
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    String getCityName() {
        return this.city;
    }

    String getProvinceName() {
        return this.province;
    }

    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }


    /**
     *
     * @param o
     * checks if 2 cities are equal based on city and province
     * @return
     * returns true if it matches (same city and province) false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()){
            return false;
        }

        City city1 = (City) o;
        return city.equals(city1.city)
                && province.equals(city1.province);
    }

    /**
     * makes hashcode for using the city and province names
     * @return
     */
    @Override
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }
}

