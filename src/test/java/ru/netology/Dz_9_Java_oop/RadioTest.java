package ru.netology.Dz_9_Java_oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test                                        //ТЕСТЫ ПЕРЕКЛЮЧЕНИЯ СТАНЦИЙ
    public void shouldSetStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);

        int expected = 9;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationBelowMin() {
        Radio cond = new Radio();
        cond.setCurrentStation(-1);

        int expected = 0;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetStationAboveMax() {
        Radio cond = new Radio();
        cond.setCurrentStation(50);

        int expected = 0;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test //
    public void shouldSetToMaxStation() {
        Radio cond = new Radio();

        cond.setToMaxStation();

        int expected = 9;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationUp() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);
        cond.StationUp();

        int expected = 0;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldStationUpNegativeNumberMax() {
        Radio cond = new Radio();
        cond.setCurrentStation(10);
        cond.StationUp();

        int expected = 1;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test //
    public void shouldStationDown() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);
        cond.StationDown();

        int expected = 9;
        int actual = cond.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test                                    //ТЕСТЫ ПЕРЕКЛЮЧЕНИЯ ГРОМКОСТИ
    public void shouldSetVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(10);

        int expected = 10;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeBelowMin() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-1);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test //
    public void shouldNotSetVolumeAboveMax() {
        Radio cond = new Radio();
        cond.setCurrentVolume(15);

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio cond = new Radio();

        cond.setToMaxVolume();

        int expected = 10;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //
    public void shouldVolumeUp() {
        Radio cond = new Radio();
        cond.setCurrentVolume(7);
        cond.volumeUp();

        int expected = 8;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test //
    public void shouldVolumeDown() {
        Radio cond = new Radio();
        cond.setCurrentVolume(9);
        cond.volumeDown();

        int expected = 8;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
