package ru.netology.Dz_9_Java_oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test                                        //ТЕСТЫ ПЕРЕКЛЮЧЕНИЯ СТАНЦИЙ
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(50);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //
    public void shouldSetToMaxStation() {
        Radio radio = new Radio();

        radio.setToMaxStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationUp() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.StationUp();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationUpAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        radio.StationUp();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationUpMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.StationUp();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationDownNegativeNumberMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.StationDown();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationDownAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        radio.StationDown();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationDownNumberMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.StationDown();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationDown() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.StationDown();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test                                    //ТЕСТЫ ПЕРЕКЛЮЧЕНИЯ ГРОМКОСТИ
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();

        radio.setToMaxVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.volumeUp();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeUpAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.volumeUp();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeUpNumberMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.volumeUp();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.volumeDown();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDownBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDownNumberMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.volumeDown();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}