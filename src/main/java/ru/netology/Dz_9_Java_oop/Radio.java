package ru.netology.Dz_9_Java_oop;

public class Radio {

    private int currentStation; // ПАРАМЕТРЫ СТАНЦИЙ

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setToMaxStation() {

        currentStation = 9;
    }

    public void StationUp() {  //цикличное повышение
        if (currentStation >= 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void StationDown() {   //цикличное понижение
        if (currentStation <= 0) {
            currentStation = 9;
            return;
        }
        if (currentStation >= 9) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    private int currentVolume;  // ПАРАМЕТРЫ ГРОМКОСТИ

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {

        currentVolume = 10;
    }

    public void volumeUp() {
        if (currentVolume >= 10) {
            currentVolume = 10;
        } else {
            currentVolume++;
        }
    }

    public void volumeDown() {

        if (currentVolume <= 0) {
            currentVolume = 0;
            return;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        } else {
            currentVolume--;
        }
    }
}