package app.model;

import jdk.jfr.Timespan;
import jdk.jfr.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component

public class Timer {

    private Long nanoTime = System.nanoTime();


    public Long getTime() {
        return nanoTime;
    }
}
