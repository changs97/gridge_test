#그릿지 테스트

에그픽 외주 작업과 개인 사정으로 이번 그릿지 테스트는 시간 투자를 많이 하지 못했습니다.
그래서, 생산성을 포기하고 공부 위주로 프로젝트를 바라봤습니다.
워낙 개발한게 없다보니 평가 받기 힘들 것 같아서 
아래 내용들 같이 제가 고민하고 알아봤던 내용들을 정리해봤습니다.
-----------------------------------------------------------------------
#이슈
androidx AAR Error : androidx 메타 정보에서 minCompileSdk 31 이상으로 강제
compileSdk, targetSdk 모두 28로 지정해주고 싶었으나, AAR Error를 피하려면 androidx 버전을 낮추거나
compileSdk를 올려줘야 함.
compileSdk를 31 이상으로 변경, targetSdk를 28로 지정
[개인 공부 기록]:https://blog.naver.com/pck4949/222839482911
Android 12부터 도입된 Splash api는 기존 스플래시 화면과 중복될 수 있기 때문에 Compat splash api 적용
하지막 아래와 같은 이슈가 있음.
[issuetracke]:https://issuetracker.google.com/issues/194301890?pli=1
하단 브랜딩 이미지가 이전 버전에선 나타나지 않음
따라서 분기 처리를 해줘야 함. (적용 전)

#아키텍처 설계
##싱글 액티비티 다중 프래그먼트 아키텍처를 적용 
- Jetpack Navigation 사용
- 프래그먼트 전환, Safe args, 스택 관리 편의성
- 다만, 아직까지 이슈가 있으므로 유의점을 살펴가면서 사용해야 함
[개인 공부 기록]:https://blog.naver.com/pck4949/222835525436
##MVC
- 기본적으로 Activity/Fragment가 뷰와 컨트롤러의 역할을 한다고 생각하지만, Activity/Fragment는 뷰에 강하게
결합되어 있으므로, 별도의 컨트롤러를 만들어 관리를 해줘야 함. (적용 전)
- 모델은 (화면 재구성 문제 대처용) Jetpack viewModel을 사용 (MVVM의 viewModel과 상관없이 사용) (적용 전)
- 뷰영역의 Activity/Fragment에서 생명주기 관련 코드를 Jetpack 생명주기 컴포넌트를 활용 (적용 전)
- 모델은 데이터베이스, 별도의 서비스 영역에서 데이터를 가져올 수 있게 설계 (Repository 패턴) (적용 전)
- 서비스 영역에서 코루틴을 활영한 비동기 처리를 적용하기 (적용 전)
[개인 공부 기록]:https://blog.naver.com/pck4949/222833916898



