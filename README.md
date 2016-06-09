jceme
=====

Basic test that JCE extensions are installed

All you need to do is run this and confirm you don't get 128 as a result, which shows the strong JCE extensions are not installed. Instead you should get 2147483647.

```bash
$ mvn package
$ java -jar target/jceme-0.0.1-SNAPSHOT.jar
2147483647
```
