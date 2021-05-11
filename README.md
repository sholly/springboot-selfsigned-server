Generate server and client keystores: 

```shell
keytool -genkey -alias localhost -keyalg RSA -keystore server.jks -keysize 2048 
keytool -export -alias localhost -file localhost.crt -keystore server.jks 
keytool -import -trustcacerts -alias localhost -file localhost.crt -keystore client.jks
```

Then build and run locally.

