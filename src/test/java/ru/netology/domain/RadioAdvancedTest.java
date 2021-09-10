package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {

    @Test // зависимость номера максимальной станции от количества станций
    public void shouldSetMaxStation() {
        RadioAdvanced radio = new RadioAdvanced(15);

        assertEquals(14, radio.getMaxStation());
    }

    @Test // установка количества радиостанций через конструктор
    public void shouldCurrentNumberStation() {
        RadioAdvanced radio = new RadioAdvanced(10);

        assertEquals(10, radio.getCurrentNumberStation());
    }

    @Test // количество радиостанций по умолчанию
    public void shouldCurrentNumberStationDefault() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentNumberStation(10);

        assertEquals(10, radio.getCurrentNumberStation());
    }

    @Test // сеттер громкость больше 100 = 100
    public void shouldNotSetVolAboveMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(radio.getMaxVolume() + 1);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // сеттер границы громкость 100 = 100
    public void shouldCurrentVolumeMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(radio.getMaxVolume());

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // сеттер границы громкость 0 = 0
    public void shouldCurrentVolumeMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(radio.getMinVolume());

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // сеттер громкость не ниже нуля
    public void shouldStopZeroVolume() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(radio.getMinVolume() - 1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // метод увеличение громкости +1
    public void shouldVolumePlusOne() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(5);

        int expected = 6;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // метод громкость больше 100 = 100
    public void shouldVolumeStopMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(100);

        int expected = 100;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // метод уменьшение громкости -1
    public void shouldVolumeMinusOne() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(55);

        int expected = 54;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // метод громкость не ниже нуля
    public void shouldVolumeStopMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(0);

        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // сеттер после станции 9 - станция 0
    public void shouldSetStationAfterMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(radio.getMaxStation() + 1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test // сеттер границы станций 9 = 9
    public void shouldCurrentStationMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(radio.getMaxStation());

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test // сеттер границы станций 0 = 0
    public void shouldCurrentStationMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(radio.getMinStation());

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test // сеттер после станции 0 - станция 9
    public void shouldSetStationAfterMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(radio.getMinStation() - 1);

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test // метод выбор станции +1
    public void shouldStationPlusOne() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(5);

        int expected = 6;
        radio.increaseStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test // метод станция после максимальной
    public void shouldStationNextMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(9);

        int expected = 0;
        radio.increaseStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test // метод выбор станции -1
    public void shouldStationMinusOne() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(5);

        int expected = 4;
        radio.decreaseStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test // метод станция после минимальной
    public void shouldStationNextMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(0);

        int expected = 9;
        radio.decreaseStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
}






