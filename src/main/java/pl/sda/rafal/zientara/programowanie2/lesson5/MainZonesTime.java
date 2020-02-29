package pl.sda.rafal.zientara.programowanie2.lesson5;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Set;

public class MainZonesTime {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        Set<String> avaiableZones = ZoneId.getAvailableZoneIds();

        for (String zone: avaiableZones
             ) {
            ZoneId zoneId = ZoneId.of(zone);
            System.out.println(localDateTime);

        }


    }
}
