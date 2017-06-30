🎱 代理(Proxy)
-------------------

现实案例
> 你有用过门禁卡开过门吗？打开门有多种方式，比如使用门禁门或者使用密码锁等。门的主要功能是打门，但在此之上还加了个代理，它增加了额外的一些功能。让我们使用以下的代码示例来更好地解释。

简单来说
> 使用代理模式，一个类可以代表其它类的功能。

Wikipedia 上描述为
> 一个代理，其最一般的形式，就是作为其它类的接口的一个类。代理就是一个包装或中介对象，客户通过调用它来访问幕后真正提供服务的对象。使用代理可以简单地转发到真实对象，也可以提供额外的逻辑。代理可以提供这些额外的功能，例如当在真实对象上的操作需要大量资源时进行缓存，或者对真实对象调用操作时先检查先决条件等。

**编程示例**

使用以上的安全门的例子。首先定义门的接口并实现门的类

```java
public interface Door {
    void open();

    void close();
}

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
```

然后定义代理，为门提供安全措施

```java
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
```

这里是如何使用

```
Door door = new LabDoor();
Security security = new Security(door);

security.open("invalid");
security.open("secret");
security.close();
```