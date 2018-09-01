package com.example.todoapp.functions;

import com.opencsv.bean.CsvBindByName;

public class db {

    @CsvBindByName
    private   String Date;

    @CsvBindByName
    private double EUR_USD_Close;
    
    @CsvBindByName
    private String results;
    
    
	@CsvBindByName
    private double EUR_USD_High;
	
	@CsvBindByName
    private double EUR_USD_Low;

	@CsvBindByName
    private Double USD_JPY_Close;
    
    @CsvBindByName
    private Double USD_JPY_High;

    @CsvBindByName
    private Double USD_JPY_Low;
    
    @CsvBindByName
    private Double USD_CHF_Close;
    
    @CsvBindByName
    private Double USD_CHF_High;
    
    @CsvBindByName
    private Double USD_CHF_Low;
    
    @CsvBindByName
    private Double GBP_USD_Close;
    
    @CsvBindByName
    private Double GBP_USD_High;
    
    @CsvBindByName
    private Double GBP_USD_Low;
    
    @CsvBindByName
    private Double USD_CAD_Close;
    
    @CsvBindByName
    private Double USD_CAD_High;
    
    @CsvBindByName
    private Double USD_CAD_Low;
    
    @CsvBindByName
    private Double EUR_GBP_Close;
    
    @CsvBindByName
    private Double EUR_GBP_High;
    
    @CsvBindByName
    private Double EUR_GBP_Low;
    
    @CsvBindByName
    private Double EUR_JPY_Close;
    
    @CsvBindByName
    private Double EUR_JPY_High;
    
    @CsvBindByName
    private Double EUR_JPY_Low;
    
    @CsvBindByName
    private Double EUR_CHF_Close;
    
    @CsvBindByName
    private Double EUR_CHF_High;
    
    @CsvBindByName
    private Double EUR_CHF_Low;
    
    @CsvBindByName
    private Double AUD_USD_Close;
    
    @CsvBindByName
    private Double AUD_USD_High;
    
    @CsvBindByName
    private Double AUD_USD_Low;
    
    @CsvBindByName
    private Double GBP_JPY_Close;
    
    @CsvBindByName
    private Double GBP_JPY_High;
    
    @CsvBindByName
    private Double GBP_JPY_Low;
    
    @CsvBindByName
    private Double CHF_JPY_Close;
    
    @CsvBindByName
    private Double CHF_JPY_High;
    
    @CsvBindByName
    private Double CHF_JPY_Low;
    
    @CsvBindByName
    private Double GBP_CHF_Close;

	@CsvBindByName
    private Double GBP_CHF_High;
    
    @CsvBindByName
    private Double GBP_CHF_Low;
    
    @CsvBindByName
    private Double NZD_USD_Close;
    
    @CsvBindByName
    private Double NZD_USD_High;
    
    @CsvBindByName
    private Double NZD_USD_Low;

	public  String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public double getEUR_USD_Close() {
		return EUR_USD_Close;
	}

	public void setEUR_USD_Close(double eUR_USD_Close) {
		EUR_USD_Close = eUR_USD_Close;
	}

	public String getResults() {
		return results;
	}

	public void setResults(String results) {
		this.results = results;
	}

	public double getEUR_USD_High() {
		return EUR_USD_High;
	}

	public void setEUR_USD_High(double eUR_USD_High) {
		EUR_USD_High = eUR_USD_High;
	}

	public double getEUR_USD_Low() {
		return EUR_USD_Low;
	}

	public void setEUR_USD_Low(double eUR_USD_Low) {
		EUR_USD_Low = eUR_USD_Low;
	}

	public Double getUSD_JPY_Close() {
		return USD_JPY_Close;
	}

	public void setUSD_JPY_Close(Double uSD_JPY_Close) {
		USD_JPY_Close = uSD_JPY_Close;
	}

	public Double getUSD_JPY_High() {
		return USD_JPY_High;
	}

	public void setUSD_JPY_High(Double uSD_JPY_High) {
		USD_JPY_High = uSD_JPY_High;
	}

	public Double getUSD_JPY_Low() {
		return USD_JPY_Low;
	}

	public void setUSD_JPY_Low(Double uSD_JPY_Low) {
		USD_JPY_Low = uSD_JPY_Low;
	}

	public Double getUSD_CHF_Close() {
		return USD_CHF_Close;
	}

	public void setUSD_CHF_Close(Double uSD_CHF_Close) {
		USD_CHF_Close = uSD_CHF_Close;
	}

	public Double getUSD_CHF_High() {
		return USD_CHF_High;
	}

	public void setUSD_CHF_High(Double uSD_CHF_High) {
		USD_CHF_High = uSD_CHF_High;
	}

	public Double getUSD_CHF_Low() {
		return USD_CHF_Low;
	}

	public void setUSD_CHF_Low(Double uSD_CHF_Low) {
		USD_CHF_Low = uSD_CHF_Low;
	}

	public Double getGBP_USD_Close() {
		return GBP_USD_Close;
	}

	public void setGBP_USD_Close(Double gBP_USD_Close) {
		GBP_USD_Close = gBP_USD_Close;
	}

	public Double getGBP_USD_High() {
		return GBP_USD_High;
	}

	public void setGBP_USD_High(Double gBP_USD_High) {
		GBP_USD_High = gBP_USD_High;
	}

	public Double getGBP_USD_Low() {
		return GBP_USD_Low;
	}

	public void setGBP_USD_Low(Double gBP_USD_Low) {
		GBP_USD_Low = gBP_USD_Low;
	}

	public Double getUSD_CAD_Close() {
		return USD_CAD_Close;
	}

	public void setUSD_CAD_Close(Double uSD_CAD_Close) {
		USD_CAD_Close = uSD_CAD_Close;
	}

	public Double getUSD_CAD_High() {
		return USD_CAD_High;
	}

	public void setUSD_CAD_High(Double uSD_CAD_High) {
		USD_CAD_High = uSD_CAD_High;
	}

	public Double getUSD_CAD_Low() {
		return USD_CAD_Low;
	}

	public void setUSD_CAD_Low(Double uSD_CAD_Low) {
		USD_CAD_Low = uSD_CAD_Low;
	}

	public Double getEUR_GBP_Close() {
		return EUR_GBP_Close;
	}

	public void setEUR_GBP_Close(Double eUR_GBP_Close) {
		EUR_GBP_Close = eUR_GBP_Close;
	}

	public Double getEUR_GBP_High() {
		return EUR_GBP_High;
	}

	public void setEUR_GBP_High(Double eUR_GBP_High) {
		EUR_GBP_High = eUR_GBP_High;
	}

	public Double getEUR_GBP_Low() {
		return EUR_GBP_Low;
	}

	public void setEUR_GBP_Low(Double eUR_GBP_Low) {
		EUR_GBP_Low = eUR_GBP_Low;
	}

	public Double getEUR_JPY_Close() {
		return EUR_JPY_Close;
	}

	public void setEUR_JPY_Close(Double eUR_JPY_Close) {
		EUR_JPY_Close = eUR_JPY_Close;
	}

	public Double getEUR_JPY_High() {
		return EUR_JPY_High;
	}

	public void setEUR_JPY_High(Double eUR_JPY_High) {
		EUR_JPY_High = eUR_JPY_High;
	}

	public Double getEUR_JPY_Low() {
		return EUR_JPY_Low;
	}

	public void setEUR_JPY_Low(Double eUR_JPY_Low) {
		EUR_JPY_Low = eUR_JPY_Low;
	}

	public Double getEUR_CHF_Close() {
		return EUR_CHF_Close;
	}

	public void setEUR_CHF_Close(Double eUR_CHF_Close) {
		EUR_CHF_Close = eUR_CHF_Close;
	}

	public Double getEUR_CHF_High() {
		return EUR_CHF_High;
	}

	public void setEUR_CHF_High(Double eUR_CHF_High) {
		EUR_CHF_High = eUR_CHF_High;
	}

	public Double getEUR_CHF_Low() {
		return EUR_CHF_Low;
	}

	public void setEUR_CHF_Low(Double eUR_CHF_Low) {
		EUR_CHF_Low = eUR_CHF_Low;
	}

	public Double getAUD_USD_Close() {
		return AUD_USD_Close;
	}

	public void setAUD_USD_Close(Double aUD_USD_Close) {
		AUD_USD_Close = aUD_USD_Close;
	}

	public Double getAUD_USD_High() {
		return AUD_USD_High;
	}

	public void setAUD_USD_High(Double aUD_USD_High) {
		AUD_USD_High = aUD_USD_High;
	}

	public Double getAUD_USD_Low() {
		return AUD_USD_Low;
	}

	public void setAUD_USD_Low(Double aUD_USD_Low) {
		AUD_USD_Low = aUD_USD_Low;
	}

	public Double getGBP_JPY_Close() {
		return GBP_JPY_Close;
	}

	public void setGBP_JPY_Close(Double gBP_JPY_Close) {
		GBP_JPY_Close = gBP_JPY_Close;
	}

	public Double getGBP_JPY_High() {
		return GBP_JPY_High;
	}

	public void setGBP_JPY_High(Double gBP_JPY_High) {
		GBP_JPY_High = gBP_JPY_High;
	}

	public Double getGBP_JPY_Low() {
		return GBP_JPY_Low;
	}

	public void setGBP_JPY_Low(Double gBP_JPY_Low) {
		GBP_JPY_Low = gBP_JPY_Low;
	}

	public Double getCHF_JPY_Close() {
		return CHF_JPY_Close;
	}

	public void setCHF_JPY_Close(Double cHF_JPY_Close) {
		CHF_JPY_Close = cHF_JPY_Close;
	}

	public Double getCHF_JPY_High() {
		return CHF_JPY_High;
	}

	public void setCHF_JPY_High(Double cHF_JPY_High) {
		CHF_JPY_High = cHF_JPY_High;
	}

	public Double getCHF_JPY_Low() {
		return CHF_JPY_Low;
	}

	public void setCHF_JPY_Low(Double cHF_JPY_Low) {
		CHF_JPY_Low = cHF_JPY_Low;
	}

	public Double getGBP_CHF_Close() {
		return GBP_CHF_Close;
	}

	public void setGBP_CHF_Close(Double gBP_CHF_Close) {
		GBP_CHF_Close = gBP_CHF_Close;
	}

	public Double getGBP_CHF_High() {
		return GBP_CHF_High;
	}

	public void setGBP_CHF_High(Double gBP_CHF_High) {
		GBP_CHF_High = gBP_CHF_High;
	}

	public Double getGBP_CHF_Low() {
		return GBP_CHF_Low;
	}

	public void setGBP_CHF_Low(Double gBP_CHF_Low) {
		GBP_CHF_Low = gBP_CHF_Low;
	}

	public Double getNZD_USD_Close() {
		return NZD_USD_Close;
	}

	public void setNZD_USD_Close(Double nZD_USD_Close) {
		NZD_USD_Close = nZD_USD_Close;
	}

	public Double getNZD_USD_High() {
		return NZD_USD_High;
	}

	public void setNZD_USD_High(Double nZD_USD_High) {
		NZD_USD_High = nZD_USD_High;
	}

	public Double getNZD_USD_Low() {
		return NZD_USD_Low;
	}

	public void setNZD_USD_Low(Double nZD_USD_Low) {
		NZD_USD_Low = nZD_USD_Low;
	}

	
    
    // Getters and setters go here.
    
}

