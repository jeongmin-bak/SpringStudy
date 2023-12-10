
## 제어의 역전 IoC(Inversion of Control)
객체를 내가 호출하는 것이 프레임워크 같은 것이 대신 호출해주는 것
제어권이 뒤바뀐다고해서 제어의 역전
OverServiceImpl creator에서 memberRepository을 사용하는 입장에서 memberRepository가 어떤것이 호출될지 모름
OrderServiceImpl은 memberRepository에 대한 제어권이 없는 것
new해서 객체를 만드는 것이 아닌 제어 흐름에 대한 권한이 AppConfig로 넘어갔기 때문에 MemberServiceImpl이 올지 모름

'프레임워크' vs '라이브러리'
#### 프레임워크가 내가 작성한 코드를 제어하고, 대신 실행하면 그것은 프레임워크가 맞다.(JUnit)
예를 들어 test코드 join메소드에 로직을 개발해놨다. 이것에 대한 실행과 제어권은 Junit이 테스트 프레임워크가 대신 제어권을 가져가서 실행해준다.
main에서 개발자가 직접 작성해서 돌리는 것은 개발자가 직접 제어하는 것

#### 반면에 내가 작성한 코드가 직접 제어의 흐름을 담당한다면 그것은 프레임워크가 아니라 라이브러리이다.
예시로 자바의 객체를 json, xml 바꿀때 개발자는 라이브러리르 불러서 직접 호출을 한다. 이런것은 라이브러리인것

