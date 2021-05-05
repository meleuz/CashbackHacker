package ru.netology.unit;

public class CashbackHackerService {

    public int remain(int amount) {
        int boundary = 1000;
        return boundary - amount % boundary;
    }
}