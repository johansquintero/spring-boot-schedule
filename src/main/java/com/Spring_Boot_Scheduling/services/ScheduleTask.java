package com.Spring_Boot_Scheduling.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.ZoneId;

@Component
public class ScheduleTask {

    /*
 - fixedRate: Ejecuta a intervalos fijos desde el inicio de cada ejecución.
 - fixedDelay: Ejecuta a intervalos fijos desde el final de cada ejecución.
 - initialDelay: Retrasa la primera ejecución.
 - cron: Ejecuta según una expresión CRON.
 - zone: Especifica la zona horaria para una expresión CRON.
    */
//    @Scheduled(fixedDelay = 1000,initialDelay = 10000)
//    public void scheduleMessage() throws InterruptedException {
//        System.out.println("Hola mundo");
//        Thread.sleep(5000);
//        System.out.println("termino");
//    }
    @Scheduled(cron = "0 35 13 * * 2", zone = "America/Bogota")
    public void scheduleMessage() {
        System.out.println("Hola mundo");
    }

    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
    }
}
