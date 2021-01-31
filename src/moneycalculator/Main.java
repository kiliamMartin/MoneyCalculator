package moneycalculator;

import moneycalculator.control.CalculateCommand;
import moneycalculator.persistence.CurrencyListLoader;
import moneycalculator.persistence.ExchangeRateLoader;
import moneycalculator.persistence.files.FileCurrencyListLoader;
import moneycalculator.persistence.rest.RestExchangeRateLoader;


public class Main {


    public static void main(String[] args) {
        CurrencyListLoader currencyLoader = new FileCurrencyListLoader("currencies");
        ExchangeRateLoader exchangeRateLoader = new RestExchangeRateLoader();
        MainFrame mainframe = new MainFrame(currencyLoader.currencies());
        mainframe.add(new CalculateCommand(mainframe.getMoneyDialog(), mainframe.getMoneyDisplay(),exchangeRateLoader));
    }

 
    

   
  
    
}
