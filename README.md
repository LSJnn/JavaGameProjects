
Trainging vs SUite man 게임 :
  등장인물들의 스토리 전개. 
  - 제 3자의 입장에서 보는 재미 기대
  - 비주얼 노벨 장르
  - 필요 :
    1. 대사 및 등장인물을 담을 DB 구축 및 연결
    2. dialouge 층 클릭 시 다음 열로 넘어가도록.
    3. 대화 흐름에 알맞게 장면 변환
    4. 캐릭터 움직임에 자연스러운 애니메이션 연결
    5. 전체적인 레이아웃 구상.

VLog게임 : 
  주인공을 촬영자가 바라보는 시선. 
  - 제 3자의 입장에서 보는 재미 기대
  - 다양한 구도 필요
  - 비주얼 노벨 장르
  - 필요 :
    1. 대사 및 등장인물을 담을 DB 구축 및 연결
    2. dialouge 층 클릭 시 다음 열로 넘어가도록.
    3. 대화 흐름에 알맞게 장면 변환
    4. 캐릭터 움직임에 자연스러운 애니메이션 연결
    5. 전체적인 레이아웃 구상.
  
HERESY 게임 : 
  이단 종교에서 탈출하기 위한 게임.
  - 코로나 신천지 사태로 인해 이단에 대한 큰 부정적 인식 퍼짐.--> 이 사태에 힘입어 빠르게 출시하고자 함.
  - 목록 : 
    1. 글자 한글자 씩 보여주기 . - 타이핑 효과 
      (String 값을 split 으로 저장했으나, 시간차를 주고 프린트하기 실패. 
        - timer/timerTask 활용했으나, 실패. : timer 는 일정 간격으로 반복적 실행하는 기능. 
          ==> 타이핑 기술 구현 시 배열[1]-[.length()]까지 구현한번에 여러번 프린트 됨. )
          
    2. 버튼 누를 시 다음 소스로 넘어가는 기능 
      2/27일 기준으로 구현. But ClickListener 안에 switch-case 로 구현하여 비효율적이라고 생각이 듦. 
        ==> DB 연동하여 구현 시도 하고자 함.
