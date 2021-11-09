package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class radioTest {

    @Test
    public void shouldIncreaseRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setRadioStation(4);
        radioStation.increaseRadioStation();
        int actual = radioStation.getCurrentRadioStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationAboveMax() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(10);
        radioStation.increaseRadioStation();
        int actual = radioStation.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationAboveMin() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(0);
        radioStation.increaseRadioStation();
        int actual = radioStation.getCurrentRadioStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationFromAboveMax() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(9);
        radioStation.increaseRadioStation();
        int actual = radioStation.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationUnderMin() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(-1);
        radioStation.increaseRadioStation();
        int actual = radioStation.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(8);
        radioStation.decreaseRadioStation();

        int actual = radioStation.getCurrentRadioStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationBelowMax() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(9);
        radioStation.decreaseRadioStation();
        int actual = radioStation.getCurrentRadioStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationUnderMin() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(0);
        radioStation.decreaseRadioStation();
        int actual = radioStation.getCurrentRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationBelowMin() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(-1);
        radioStation.decreaseRadioStation();
        int actual = radioStation.getCurrentRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationAboveMax() {
        Radio radioStation = new Radio();
        radioStation.setCurrentRadioStation(10);
        radioStation.decreaseRadioStation();
        int actual = radioStation.getCurrentRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation() {
        Radio radioStation = new Radio();
        radioStation.setRadioStation(3);
        int actual = radioStation.getRadioStation();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationAboveMax() {
        Radio radioStation = new Radio();
        radioStation.setRadioStation(10);
        int actual = radioStation.getRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationBelowMin() {
        Radio radioStation = new Radio();
        radioStation.setRadioStation(-1);
        int actual = radioStation.getRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(4);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(11);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeFromMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeFromBelowMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(8);
        volume.decreaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeUnderMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        volume.decreaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeUnderMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        volume.decreaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeFromAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(11);
        volume.decreaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeFromUnderMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.decreaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}