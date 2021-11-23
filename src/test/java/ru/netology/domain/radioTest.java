package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class radioTest {
    Radio radio = new Radio(13);

    @Test
    public void shouldSetCurrentRadioStation() {
        int expected = 11;
        radio.setCurrentRadioStation(expected);
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationAboveLimit() {
        radio.setCurrentRadioStation(19);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseRadioStation() {
        radio.setCurrentRadioStation(8);
        int currentRadioStation = radio.increaseRadioStation();
        radio.setCurrentRadioStation(currentRadioStation);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldDecreaseRadioStation() {
        radio.setCurrentRadioStation(6);
        int currentRadioStation = radio.decreaseRadioStation();
        radio.setCurrentRadioStation(currentRadioStation);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseRadioStationAboveMax() {
        radio.setCurrentRadioStation(12);
        int currentRadioStation = radio.increaseRadioStation();
        radio.setCurrentRadioStation(currentRadioStation);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldDecreaseRadioStationBelowMin() {
        radio.setCurrentRadioStation(0);
        int currentRadioStation = radio.decreaseRadioStation();
        radio.setCurrentRadioStation(currentRadioStation);
        assertEquals(12, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseRadioStationBeyondLimit() {
        radio.setCurrentRadioStation(14);
        int currentRadioStation = radio.increaseRadioStation();
        radio.setCurrentRadioStation(currentRadioStation);
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldDecreaseRadioStationBeyondLimit() {
        radio.setCurrentRadioStation(-1);
        int currentRadioStation = radio.decreaseRadioStation();
        radio.setCurrentRadioStation(currentRadioStation);
        assertEquals(12, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentVolume() {
        int expected = 84;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeAboveMax() {
        radio.setCurrentVolume(104);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(67);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(68, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(19);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(18, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        radio.setCurrentVolume(100);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeBelowMin() {
        radio.setCurrentVolume(0);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeAboveMaxLimit() {
        radio.setCurrentVolume(104);
        int currentVolume = radio.increaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeAboveMaxLimit() {
        radio.setCurrentVolume(-1);
        int currentVolume = radio.decreaseVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }
}