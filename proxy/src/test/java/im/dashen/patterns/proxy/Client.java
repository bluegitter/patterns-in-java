package im.dashen.patterns.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author dash.sd
 * @date 6/30/17
 */
public class Client {

    @Test
    public void operateDoor() throws Exception {
        Door door = new LabDoor();
        Security security = new Security(door);

        security.open("invalid");
        security.open("secret");
        security.close();
    }
}