package ru.netology.Dz_9_Java_oop;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;
    private int numberOfStations;


    public Radio(int numberOfStations) {

        this.numberOfStations = numberOfStations;
    }

    public Radio() {

        numberOfStations = 10;
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
        if (newCurrentStation > numberOfStations -1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setToMaxStation() {
        currentStation = maxStation;
    }

    public void StationUp() {  //цикличное повышение
        if (currentStation >= numberOfStations -1) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void StationDown() {   //цикличное понижение
        if (currentStation <= minStation) {
            currentStation = numberOfStations -1;
            return;
        }
        if (currentStation >= numberOfStations -1) {
            currentStation = numberOfStations -1;
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
