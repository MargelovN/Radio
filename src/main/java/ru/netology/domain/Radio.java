package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;

    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        if (currentRadioStation < minRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseRadioStation() {
        if (currentRadioStation < 9 && currentRadioStation >= 0) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }
    public void decreaseRadioStation(){
        if (currentRadioStation > 0 && currentRadioStation <= 9) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }
    public int getRadioStation() {
        return currentRadioStation;
    }
    public void setRadioStation(int actualRadioStation) {
        if (actualRadioStation <= 0) {
            return;
        }
        if (actualRadioStation > 9) {
            return;
        }
        currentRadioStation = actualRadioStation;
    }

    public void increaseVolume() {
        if (currentVolume < 10 && currentVolume >= 0) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0 && currentVolume <= 10) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}
