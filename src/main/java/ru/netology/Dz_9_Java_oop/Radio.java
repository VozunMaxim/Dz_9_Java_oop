package ru.netology.Dz_9_Java_oop;

public class Radio {
    private int maxStation;
    private int minStation;
    private int currentStation;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private int numberOfStations;

    public Radio() {
        numberOfStations = 10;
        maxStation = 9;
        minStation = 0;
        currentStation = minStation;
        maxVolume = 100;
        minVolume = 0;
        currentVolume = minVolume;
    }

    public int numberOfStations() {
        return numberOfStations;
    }

    public int getCurrentStation() {     // ПАРАМЕТРЫ СТАНЦИЙ
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setToMaxStation() {
        currentStation = maxStation;
    }

    public void StationUp() {  //цикличное повышение
        if (currentStation >= maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void StationDown() {   //цикличное понижение
        if (currentStation <= minStation) {
            currentStation = maxStation;
            return;
        }
        if (currentStation >= maxStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {     // ПАРАМЕТРЫ ГРОМКОСТИ
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }

    public void volumeUp() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume++;
        }
    }

    public void volumeDown() {

        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
            return;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume--;
        }
    }
}
