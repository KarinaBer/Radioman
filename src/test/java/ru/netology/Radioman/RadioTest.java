package ru.netology.Radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNumberRadioStations() {
        Radio radio = new Radio(10);

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetLargeRangeStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetLessRangeStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(12);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingNextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingZeroStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingLastStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetSoundVolume() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(20);

        int expected = 20;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeLargeRange() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(101);

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeLessRange() {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(-2);

        int expected = 0;
        int actual = volume.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume () {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(99);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume () {
        Radio volume = new Radio();

        volume.setCurrentSoundVolume(100);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeReduction () {
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(1);

        volume.volumeReduction();

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotVolumeReduction () {
        Radio volume = new Radio();
        volume.setCurrentSoundVolume(0);

        volume.volumeReduction();

        int expected = 0;
        int actual = volume.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
