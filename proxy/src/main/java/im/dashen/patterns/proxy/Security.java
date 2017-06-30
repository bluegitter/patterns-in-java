package im.dashen.patterns.proxy;


/**
 * @author dash.sd
 * @date 6/30/17
 */
public class Security {
    private Door door;

    public Security(Door door) {
        this.door = door;
    }


    public void open(String password) {
        if (authenticate(password)) {
            System.out.println("Wrong password");
            return;
        }
        door.open();
    }

    public void close() {
        door.close();
    }

    private boolean authenticate(String password) {
        return "secret".equals(password);
    }
}

