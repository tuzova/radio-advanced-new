package ru.netology.domain;

public class RadioAdvanced {
    private int currentNumberStation = 10; // по умолчанию
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;
    private int minStation = 0;
    private int maxStation = currentNumberStation - 1;
    private int currentStation;

    // конструкторы
    public RadioAdvanced(int currentNumberStation) {
        this.currentNumberStation = currentNumberStation;
        this.maxStation = currentNumberStation - 1; // выставление поля кол-ва станций должно влиять на поле макс. станции
    }

    public RadioAdvanced() {
    }

    // геттеры
    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    // радиостанции
    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseStation() {
        if (currentStation < maxStation) {
            this.currentStation = currentStation + 1;
        } else {
            this.currentStation = minStation;
        }
    }

    public void decreaseStation() {
        if (currentStation > minStation) {
            this.currentStation = currentStation - 1;
        } else {
            this.currentStation = maxStation;
        }
    }

    // звук
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
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
}
