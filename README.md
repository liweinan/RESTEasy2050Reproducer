启动`jetty`服务器：

```bash
$ mvn jetty:run
```

测试请求：

```bash
$ http localhost:8080/foo
HTTP/1.1 200 OK
Content-Length: 13
Content-Type: application/octet-stream
Date: Thu, 12 Sep 2019 03:07:40 GMT
Server: Jetty(9.4.17.v20190418)

Hello, world!

$
```

## Reproducer

```bash
$ http POST localhost:8080/foo/cool
HTTP/1.1 500 Server Error
Content-Length: 4
Content-Type: application/octet-stream
Date: Wed, 17 Jun 2020 10:32:41 GMT
Server: Jetty(9.4.17.v20190418)

COOL
```

```bash
$ http POST localhost:8080/foo/boom
HTTP/1.1 500 Server Error
Content-Length: 0
Date: Wed, 17 Jun 2020 10:34:05 GMT
Server: Jetty(9.4.17.v20190418)



$
```

