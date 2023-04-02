# 자바를 공부하기 전에 알아두면 좋을 것들 #1 

컴파일: 인간이 이해하기 쉬운 언어를 기계어로 번역하는 과정
컴파일러: 컴파일을 하는 프로그램
바이트 코드: 0과 1로 이루어진 코드, 컴퓨터가 이해할 수 있다. 

## JVM(Java Virtual Machine) - JAVA 바이트 코드를 OS에 맞게 번역
- 원래는 운영체제마다 다른 컴파일러가 필요하지만 JAVA는 JVM이 0과 1을 운영체제에 맞게 번역해준다. 
- 이 JVM은 JAVA외에 다른 언어에서도 사용하고 있다.

## JRE(Java Runtime Environment) - JAVA 실행 환경 
- JVM + 자바 프로그램 실행에 필요한 라이브러리 파일 등 
- JVM의 실행환경을 구현

## JDK(Java Development Kit) - JAVA 개발 도구
- JRE + 개발에 필요한 도구들
- 컴파일러, 디버그 도구 등이 포함 

JVM < JRE < JDK 순서로 포함관계이며 JDK를 설치하면 JRE와 JVM도 함께 설치된다. 
따라서 JAVA의 버전 = JDK의 버전이 된다. 

OracleJDK : Oracle에서 제공하는 JDK, 개인에게 무료, 기업용은 유료
OpenJDK : OracleJDK와 비슷한 성능, 무료

# 자바를 공부하기 전에 알아두면 좋을 것들 #2

build: 소스 코드 파일을 컴퓨터에서 실행할 수 있는 독립 SW 가공물로 변환시키는 과정
* 독립 SW 가공물 = Artifact
run: 내가 작성한 코드를 컴파일을 거쳐, 작동시켜 보는 것 
* 주의: 인터프리터 언어는 컴파일이 필요 없다. 
build tool
1. 소스코드의 빌드 과정을 자동으로 처리해주는 프로그램
2. 외부 소스 코드(외부 라이브러리) 자동 추가, 관리 

## Ant
- 설정을 위해 xml을 사용
- 간단하고 사용하기 쉬움
- 복잡한 처리를 위해서 빌드 스크립트 작성이 어려움
- 외부 라이브러리를 관리하는 구조가 없음 

## Maven
- 설정을 위해 xml을 사용
- 외부 라이브러리 관리
- 빌드 스크립트 문제 해결
- xml 자체의 한계

## Gradle
- 설정을 위해 Groovy 언어를 사용
- 외부 라이브러리 관리
- 유연한 빌드 스크립트 작성
- 뛰어난 성능