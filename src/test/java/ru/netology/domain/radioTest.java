package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class radioTest {

    @Test
    public void shouldIncreaseRadioStation() {
        radio radioStation = new radio();
        radioStation.setRadioStation(4);
        radioStation.increaseRadioStation();
        int actual = radioStation.getCurrentRadioStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationAboveMax() {
        radio radioStation = new radio();
        radioStation.setCurrentRadioStation(10);
        radioStation.increaseRadioStation();
        int actual = radioStation.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationAboveMin() {
        radio radioStation = new radio();
        radioStation.setCurrentRadioStation(0);
        radioStation.increaseRadioStation();
        int actual = radioStation.getCurrentRadioStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationFromAboveMax() {
        radio radioStation = new radio();
        radioStation.setCurrentRadioStation(9);
        radioStation.increaseRadioStation();
        int actual = radioStation.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationUnderMin() {
        radio radioStation = new radio();
        radioStation.setCurrentRadioStation(-1);
        radioStation.increaseRadioStation();
        int actual = radioStation.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStation() {
        radio radioStation = new radio();
        radioStation.setCurrentRadioStation(8);
        radioStation.decreaseRadioStation();

        int actual = radioStation.getCurrentRadioStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationBelowMax() {
        radio radioStation = new radio();
        radioStation.setCurrentRadioStation(9);
        radioStation.decreaseRadioStation();
        int actual = radioStation.getCurrentRadioStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationUnderMin() {
        radio radioStation = new radio();
        radioStation.setCurrentRadioStation(0);
        radioStation.decreaseRadioStation();
        int actual = radioStation.getCurrentRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationBelowMin() {
        radio radioStation = new radio();
        radioStation.setCurrentRadioStation(-1);
        radioStation.decreaseRadioStation();
        int actual = radioStation.getCurrentRadioStation();
                int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationAboveMax() {
        radio radioStation = new radio();
        radioStation.setCurrentRadioStation(10);
        radioStation.decreaseRadioStation();
        int actual = radioStation.getCurrentRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation() {
        radio radioStation = new radio();
        radioStation.setRadioStation(3);
        int actual = radioStation.getRadioStation();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationAboveMax() {
        radio radioStation = new radio();
        radioStation.setRadioStation(10);
        int actual = radioStation.getRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationBelowMin() {
        radio radioStation = new radio();
        radioStation.setRadioStation(-1);
        int actual = radioStation.getRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        radio volume = new radio();
        volume.setCurrentVolume(4);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        radio volume = new radio();
        volume.setCurrentVolume(11);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeFromMax() {
        radio volume = new radio();
        volume.setCurrentVolume(10);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeFromBelowMin() {
        radio volume = new radio();
        volume.setCurrentVolume(-1);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMin() {
        radio volume = new radio();
        volume.setCurrentVolume(0);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        radio volume = new radio();
        volume.setCurrentVolume(8);
        volume.decreaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void shoulsDecreaseVolumeUnderMin() {
        radio volume = new radio();
        volume.setCurrentVolume(-1);
        volume.decreaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shoulsDecreaseVolumeUnderMax() {
        radio volume = new radio();
        volume.setCurrentVolume(10);
        volume.decreaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shoulsDecreaseVolumeFromAboveMax() {
        radio volume = new radio();
        volume.setCurrentVolume(11);
        volume.decreaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shoulsDecreaseVolumeFromUnderMin() {
        radio volume = new radio();
        volume.setCurrentVolume(0);
        volume.decreaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}