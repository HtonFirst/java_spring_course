package com.kwazart.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SimpleCamera {

    private SimpleCameraRoll cameraRoll;

    @Autowired
    @Qualifier("simpleBlackAndWhiteRoll")
    public void setSimpleCameraRoll(SimpleCameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhoto() {
        System.out.println("Clic!");
        cameraRoll.processing();
    }

}
