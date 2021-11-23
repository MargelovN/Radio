package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int radioStationQuantity = 10;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int radioStationQuantity) {
        this.radioStationQuantity = radioStationQuantity;
        this.maxRadioStation = radioStationQuantity - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public int getMinRadioStation() {
        return minRadioStation;
    }
    public int getRadioStationQuantity() {
        return radioStationQuantity;
    }
    public void setRadioStationQuantity(int radioStationQuantity) {
        this.radioStationQuantity = radioStationQuantity;
    }
    public int getMaxRadioStation() {
        return maxRadioStation;
    }
    public int getMaxVolume() {
        return maxVolume;
    }
    public int getMinVolume() {
        return minVolume;
    }
    public int increaseRadioStation() {
        currentRadioStation = currentRadioStation < maxRadioStation ? currentRadioStation + 1 : minRadioStation;
        return currentRadioStation;
    }
    public int decreaseRadioStation() {
        currentRadioStation = currentRadioStation > minRadioStation ? currentRadioStation - 1 : maxRadioStation;
        return currentRadioStation;
    }
    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        return currentVolume;
    }
}

