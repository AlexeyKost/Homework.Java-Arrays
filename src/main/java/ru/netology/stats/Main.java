package ru.netology.stats;


public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 18, 7, 14, 14, 16};
        long minAverageSales = service.minAverageSales(sales);


    }


}