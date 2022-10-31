package com.kwazart.simple;

import com.kwazart.CameraRoll;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class SimpleColorRoll implements SimpleCameraRoll{

    @Value("${frames.count.rgb}")
    private int count;



    @Override
    public void processing() {
        count--;
        System.out.println("   -1 color frame");
        System.out.printf("Roll has %d frame(s)\n", count);
    }
}
