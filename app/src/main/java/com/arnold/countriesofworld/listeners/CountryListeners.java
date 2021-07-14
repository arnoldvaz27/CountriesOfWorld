package com.arnold.countriesofworld.listeners;

import com.arnold.countriesofworld.entites.Country;

public interface CountryListeners {

    void onItemClicked(Country country, int position); //event listener after clicking on the view

}
