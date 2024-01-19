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


## 4. JdbcTemplate null 에러
- 원인
> JdbcTemplate을 빈으로 등록하지않아 생긴 문제이다.
- 해결방법
>@Autowired 선언해줌

## 인텔리제이 커뮤니티 사용후기
1. 스프링을 지원하지않는다  
스프링부트 프로젝트 생성시 스프링을 지원하지않아서 import하는거 말고는 프로젝트를 생성 할 수 없다.
2. 고급기능 지원 X  
인텔리제이는 미사용 Import를 자동으로 정리해주는 기능이 있는데,
아쉽게 커뮤니티버전에서는 사용 불가능하다.
3. 스프링 관련 에러확인  
고급기능에 해당되는지는 잘 모르겠다. 예를들어 Service에서 Repositroy를 객체주입받는데, Repositroy에서 @Repositroy어노테이션을 지웟다.
유료버전에서는 프로젝트를 컴파일하지 않아도 코드에 빨간줄로 표시가 되나, 커뮤니티에선 이런 기능이 없는거 같다.  
4. 유료전환
결국 유료로 전환했다. 너무 좋다. 이걸 쓰다가 이클립스를 다시 써봣더니 불편해서 못쓰겟다..