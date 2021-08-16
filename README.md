# 볼링 게임 점수판

### 기능 목록 

- [ ] 플레이어 이름을 입력 받는다. Player
  - [ ] 플레이어의 이름은 3 글자의 영문이여야 한다. 
- [ ] 0 - 10 까지 랜덤한 숫자를 생성한다. RandomBall.generate()
- [ ] 숫자를 입력받아 상태를 판단한다. Pins
- [ ] 1 ~ 9 프레임 게임을 진행하는 객체 NorMalFrame
    - 첫번째 값이 10 이면 한번, 아니라면 2번까지 굴릴 수 있다.
- [ ] 10 프레임 게임을 진행하는 객체 FinalFrame
    - 첫번째 값이 10 이거나 두번째에 스페어 처리하면 3번째 볼을 굴릴 수 있다.
- [ ] 1 ~ 10 프레임까지의 공통 객체 Frame
  - [ ] 프레임이 끝났는지 여부를 판단한다. 
  - [ ] 공을 굴리고 점수를 저장한다.

### 기능 요구 사항 
- 최종 목표는 볼링 점수를 계산하는 프로그램을 구현한다. 1단계 목표는 점수 계산을 제외한 볼링 게임 점수판을 구현하는 것이다.
- 각 프레임이 스트라이크이면 "X", 스페어이면 "9 | /", 미스이면 "8 | 1", 과 같이 출력하도록 구현한다.
  - 스트라이크(strike) : 프레임의 첫번째 투구에서 모든 핀(10개)을 쓰러트린 상태
  - 스페어(spare) : 프레임의 두번재 투구에서 모든 핀(10개)을 쓰러트린 상태
  - 미스(miss) : 프레임의 두번재 투구에서도 모든 핀이 쓰러지지 않은 상태
  - 거터(gutter) : 핀을 하나도 쓰러트리지 못한 상태. 거터는 "-"로 표시
- 10 프레임은 스트라이크이거나 스페어이면 한 번을 더 투구할 수 있다.

## 진행 방법
* 볼링 게임 점수판 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)