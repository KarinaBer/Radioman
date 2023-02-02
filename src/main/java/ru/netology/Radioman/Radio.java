package ru.netology.Radioman;
public class Radio {

    private int currentRadioStation;
    private int maxRadioStation;
    private int currentSoundVolume;
    public Radio () {
        maxRadioStation = 9;
    }

    public Radio (int numberRadioStations) {
        maxRadioStation = numberRadioStations - 1;

    }
    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void next() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation ++;
        }else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation --;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < 0) {
            return;
        }
        if (currentSoundVolume > 100) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void increaseVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume++;
        }
    }

    public void volumeReduction() {
        if (currentSoundVolume > 0) {
            currentSoundVolume --;
        }
    }
}
