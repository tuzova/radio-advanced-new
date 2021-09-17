package ru.netology.domain;

public class RadioAdvanced {
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;
    private int currentNumberStation = 10;


    public RadioAdvanced(int currentNumberStation) {
        this.currentNumberStation = currentNumberStation;
    }

    public RadioAdvanced() {
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
        } else if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
        } else {
            this.currentVolume = currentVolume;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }

    public int getMinStation() {
        return minStation;
    }

    public int setMaxStation() {
        maxStation = currentNumberStation - 1;
        return maxStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = minStation;
        } else if (currentStation < minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = currentStation;
        }
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        this.currentNumberStation = currentNumberStation;
    }

    public void increaseStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }

    public void decreaseStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }
}


