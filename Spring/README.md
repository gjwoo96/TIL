# 스프링 & 스프링부트  & 에러 처리  내용정리


## 1. git 커밋 도중 gradle 권한에러 발생  
* 원인
> __gradle 권한 없음__
  
```
error: read error while indexing Spring/library-app/.gradle/7.5/checksums/checksums.lock: Permission denied
error: Spring/library-app/.gradle/7.5/checksums/checksums.lock: failed to insert into database
error: unable to index file 'Spring/library-app/.gradle/7.5/checksums/checksums.lock'
fatal: adding files failed

```  




    
> .gradle 디렉토리에 읽기 쓰기권한 부여 

```
chmod -R u+rw Spring/library-app/.gradle
```

>  후 gradle 클린 
(인텔리제이 터미널에서  .gradle 상위 디렉토리로 이동후 실행)

```
./gradlew clean build -x test
```  

    



## 2. 깃 커밋시 개행문자에러
- 원인  
> 오류의 원인은 Whitespace 에러로, CRLF 개행 문자 차이로 인한 문제다
보통 맥 또는 리눅스를 쓰는 개발자와 윈도우를 쓰는 개발자가 Git으로 협업할 때 발생하는 오류이다.
- 해결방법  
>CRLF를 자동 변환해주는 core.autocrlf 기능을 설정하면 된다.  

```
git config --global core.autocrlf true

```

## 3. 인텔리제이 DB 쿼리 실행 에러
- 원인 및 해결방법
> 명령어를 실행시킬때 해당명령어를 마우스로 드래그하고 Ctrl + enter로 실행
