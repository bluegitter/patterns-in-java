package im.dashen.patterns.proxy;

/**
 * @author dash.sd
 * @date 6/30/17
 */
public class LabDoor implements Door {
    @Override
    public void open() {
        System.out.println("Open lab door");
    }

    @Override
    public void close() {
        System.out.println("Close lab door");
    }
}
