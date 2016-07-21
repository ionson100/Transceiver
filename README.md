# Transceiver for android

Listener registration:
```java
 Transceiver.subscribe("1", new Transceiver.ITransceiver() {
            @Override
            public void action(Object o) {
                System.out.println(o.toString());
            }
        });
      //  where "1" - key word
```
where else in the code
```java
   Transceiver.send("1","2");
      //  where "1" - key word,"2" - object (parcel)
```
cancellation one of the listener
```java
   Transceiver.cancelSubscribe("1");
      //  where "1" - key word
```
cancellation all of the listeners 
```java
  Transceiver.cancelAll();
```
