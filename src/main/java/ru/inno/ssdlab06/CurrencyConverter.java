package ru.inno.ssdlab06;

public class CurrencyConverter {
    private String currency1;
    private String currency2;
    private Double value;
    private int [][] allRelations = new int[10][10];

    CurrencyConverter(){

    }
    void swapCurrency(){
        String buff;
        buff = this.currency1;
        this.currency1 = this.currency2;
        this.currency2 = buff;
    }
    void changeCurrency(String newCurrency1, String newCurrency2){
        this.currency1 = newCurrency1;
        this.currency2 = newCurrency2;
    }

    Double convertCurrency(){

    }

    void inputData(String curr1, String curr2, Double value){
        this.currency1 = curr1;
        this.currency2 = curr2;
        this.value = value;
    }
}
