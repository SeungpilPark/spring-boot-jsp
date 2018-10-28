## Session based and Token based

[https://dzone.com/articles/how-to-make-a-stateless-session-less-authenticatio](https://dzone.com/articles/how-to-make-a-stateless-session-less-authenticatio)

## redis cli session check 

```
$ docker run -it --rm redis redis-cli -h  172.30.1.4 -p 6379

172.30.1.4:6379> keys *
1) "spring:session:sessions:expires:8b17d457-c8ce-4a30-99e7-8ef777fd9f6d"
2) "spring:session:expirations:1540723560000"
3) "spring:session:sessions:8b17d457-c8ce-4a30-99e7-8ef777fd9f6d"

172.30.1.4:6379> hkeys spring:session:sessions:8b17d457-c8ce-4a30-99e7-8ef777fd9f6d
1) "sessionAttr:my-session"
2) "maxInactiveInterval"
3) "lastAccessedTime"
4) "creationTime"

172.30.1.4:6380> hget spring:session:sessions:4267b2ef-8c93-46d7-b02e-a7e0e423ab14 sessionAttr:my-session
"\xac\xed\x00\x05t\x00$2c428128-e816-4dea-83f7-a8bf26cfb284"
```

## Local redis 시작

```
docker run -p 6380:6379 -d redis
```

## AWS elastic cache 

동일한 vpc 내부에 있을 경우만 접속 가능. 초기 구성은 별도 접속 인증 없음. 

- elastic cache 클러스터 생성자와 EC2/ECS 생성자가 다를 경우 접속 가능한지 테스트
- 접속 불가일 경우 IAM 정책 구성 보기

**Cli 접속**

```
docker run -it --rm redis redis-cli -h  lg-session-redis.xumxac.ng.0001.apn2.cache.amazonaws.com -p 6379
```




