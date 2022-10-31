package com.kwazart.simple;

import com.kwazart.CameraRoll;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SimpleBlackAndWhiteRoll implements SimpleCameraRoll{
    @Value("${frames.count.bw}")
    public int count;

//    public SimpleBlackAndWhiteRoll(int count) {
//        this.count = count;
//    }

    @Override
    public void processing() {
        count--;
        System.out.println("   -1 b/w frame");
        System.out.printf("Roll has %d frame(s)\n", count);
    }
}
