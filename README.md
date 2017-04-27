# 1. RemoteRetrofit


## 출력 화면 

![](http://i.imgur.com/5tQ9UgW.png)

## 1.1 라이브러리 추가

안드로이드 App module에 retrofit 라이브러리를 추가합니다.

					compile 'com.squareup.retrofit2:retrofit:2.2.0'

그 다음으로 gson 라이브러리를 추가합니다.(gson은 json 파일을 자바 객체로 변환시키기 위해 사용합니다.)

					
   				   compile 'com.squareup.retrofit2:converter-gson:2.2.0'

## 1.2 json to class(pojo 사이트)


![](http://i.imgur.com/bkwlfG7.png) 

--> week9-1과는 달리 json에 대응되는 객체를 생성해야 합니다. pojo 사이트는 데이터 구조가 계층 구조에 맞게 설계되도록 객체를 만들어줍니다.


![](http://i.imgur.com/h2uWOZS.png)

--> pojo 사이트에서 만들어진 4개의 클래문을 안드로이드에 클래스로 복사/붙이기 합니다.

## 1.3 인터페이스 선언하기

<SeoulOpenService.interface>

![](http://i.imgur.com/goCZZz3.png)

--> retrofit은 사용자가 접속할 서버 주소(HTTP API)를 자바 인터페이스로 바꿔줍니다.

			@GET : 접속할 서버 URL 주소

			Call <'주고받을 객체'> '함수명' (@Query ('변수 이름') '자료형' '변수 이름')  ==> 여기서는 @Query에 Path를 넣어서 url에 들어갈 주소값을 동적으로 할당하였습니다.

## 1.4 GSON 라이브러리 사용

json 형식으로 된 api의 샘플 코드를 객체 형식으로 사용하기 위해서 GSON 라이브러리를 사용합니다. 

#####MapsActivity는 API의 샘플코드를 Retrofit 형식의 객체로 받아온 다음 객체에 들어있는 데이터들을 구글맵에 마커로 표시해줍니다.

<MapsActivity.java>

![](http://i.imgur.com/rTN7OHc.png)




(1) Retrofit을 초기화합니다. 

서버에서 json으로 주는 응답을 간단하게 변환할 수 있도록 Retrofit에서 Converter를 제공합니다. 

Converter를 사용하기 위해서 build.gradle 파일에 다음을 추가하고

		compile 'com.squareup.retrofit2:converter-gson:(insert latest version)'

retrofit 초기화 코드에 "addConverterFactory"를 사용하면 interface로 정의된 

SeoulOpenService를 사용할 수 있습니다.

(2) SeoulOpenService 참조변수를 Retrofit으로 생성합니다.


(3) 이후 service을 통해서 Retrofit을 사용하게 됩니다. 여기서 Data는 json 으로 받은 객체를 담을 형식을 정의한 클래스입니다. 



( 출처 : [http://thdev.tech/androiddev/2016/11/13/Android-Retrofit-Intro.html](http://thdev.tech/androiddev/2016/11/13/Android-Retrofit-Intro.html) )




![](http://i.imgur.com/dHZwUql.png)

 Retrofit에서 GSON을 SeoulOpenService 변환한 결과를 받아옵니다.

이후 과정은 이전에 사용한 구글맵 프로젝트와 같습니다.