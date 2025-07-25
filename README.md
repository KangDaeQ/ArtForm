# 아트퐁 (Art-Form)

## 팀명: 삼시두끼

### 팀원 : 강대규, 김휘동, 박준현, 정찬우, 서현석, 임정인

### Front-End (FE)

- 서현석
- 임정인
- 정찬우

### Back-End (BE)

- 김휘동
- 박준현
- 강대규

### AI

- 강대규

### Infrastructure (Infra)

- 김휘동

---

## 프로젝트 소개

**아트퐁 (Art-Form)** 은 AI 기반 화풍 변환 기술을 활용하여 사용자가 원하는 예술 스타일로 이미지를 변환할 수 있는 서비스입니다. 사용자가 자신의 그림을 업로드하면 AI가 개별적인 화풍을 학습하고, 이를 바탕으로 사진이나 특정 객체를 선택적으로 변환하여 예술적인 작품을 손쉽게 제작할 수 있도록 도와줍니다.

---

## 프로젝트 구조

```bash
.
├── frontend  # 프론트엔드 프로젝트 폴더
│   ├── src
│   ├── public
│   ├── package.json
│   └── ...
├── backend   # 백엔드 프로젝트 폴더
│   ├── src
│   ├── config
│   ├── package.json
│   └── ...
├── docs      # 문서 및 자료
├── README.md # 프로젝트 설명 파일
└── .gitignore

```

---

## Git Commit Message Convention

커밋 메시지는 아래 규칙을 따릅니다:

- `[FE] feat: 로그인 기능 구현`
- 커밋 유형은 영어 소문자로 작성
- 커밋 메시지는 한글로 작성
- 지라(JIRA) 연동 X

| 커밋 유형 | 의미 |
| --- | --- |
| `feat:` | 새로운 기능 추가 |
| `fix:` | 버그 수정 |
| `docs:` | 문서 수정 |
| `style:` | 코드 formatting, 세미콜론 누락, 코드 자체의 변경이 없는 경우 |
| `refactor:` | 코드 리팩토링 |
| `test:` | 테스트 코드, 리팩토링 테스트 코드 추가 |
| `chore:` | 패키지 매니저 수정, 그 외 기타 수정 (예: .gitignore) |
| `design:` | CSS 등 사용자 UI 디자인 변경 |
| `comment:` | 필요한 주석 추가 및 변경 |
| `rename:` | 파일 또는 폴더 명 수정 또는 이동 |
| `remove:` | 파일 삭제 |
| `!BREAKING CHANGE` | 커다란 API 변경 |
| `!HOTFIX` | 치명적인 버그 수정 |
| `merge` | 브랜치 병합 |

---

## Git Branch 전략

- **master**
    - 최종
    - **FE/develop**
        - fe/feature/{기능}
        EX ) fe/feature/login
        - fe/fix/[오류 수정]
        - fe/test/jenkins-pipeline [ 테스트 환경 ]
    - **BE/develop**
        - be/feature/[기능]
        - EX ) be/feature/[로그인]
        - be/fix/[오류 수정]
        - be/test/jenkins-pipeline [ 테스트 환경 ]

---

## 서비스 대상자

**아트퐁 (Art-Form)** 은 미술 전문가뿐만 아니라 **그림을 잘 그리지 못하는 사람도 쉽게 사용할 수 있는 서비스**입니다.

- **미술을 배우고 싶지만 어려움을 느끼는 초보자**
    - 기본적인 밑그림 제공 및 테두리 가이드 기능으로 그림 연습을 쉽게 할 수 있습니다.
- **자신만의 예술 스타일을 만들고 싶은 사용자**
    - AI가 사용자의 그림을 학습하여 개성 있는 화풍을 자동으로 적용해 줍니다.
- **창작 활동을 간편하게 즐기고 싶은 일반 사용자**
    - 복잡한 편집 없이 원하는 이미지를 간편하게 변환할 수 있어, 누구나 예술적인 결과물을 만들 수 있습니다.

**전문가가 아니어도 쉽게 사용할 수 있도록 직관적인 인터페이스와 AI 기반 자동화 기능을 제공**하여, 미술을 좋아하는 모든 사람이 부담 없이 창작을 즐길 수 있도록 도와줍니다.

## 서비스 설명 / 주요 기능

- **사용자가 원하는 화풍으로 바꿔주는 서비스**
- 사용자가 약 10장의 자신만의 그림을 업로드하여 AI가 개인의 화풍을 학습하고, 이를 바탕으로 사진 촬영 시 전체 이미지 또는 특정 객체(예: 인물)만 선택적으로 학습된 화풍으로 변환해주는 서비스입니다. 누구나 손쉽게 자신만의 예술적 스타일을 반영한 사진을 제작할 수 있습니다.

### **[ 화풍 반영 사진 변환 서비스 ]**

1. 사용자가 약 10장의 화풍 학습을 위한 이미지 업로드 기능 (자신만의 예술적 화풍 제공)
2. AI 기반 Transfer Learning 및 LoRA를 활용한 맞춤형 화풍 학습 기능 (업로드된 사진을 통해 개별 화풍 모델 생성)
3. 사용자당 화풍 모델 저장 기능 (개인화된 학습 결과물을 선택적으로 보관)
4. 저장된 화풍 모델을 다른 사용자도 활용할 수 있으며, 인기 모델 랭킹 기능 제공 (커뮤니티 기반 추천 및 공유)
5. 사진 촬영 시 전체 이미지 또는 특정 대상(예: 인물) 선택적 화풍 변환 기능
6. 완성된 예술 사진 결과물 다운로드

### **프로젝트의 특장점(기능 관점)**

- 사용자 맞춤형 스타일 전이로 개성 있는 결과물 제작
- 인터랙티브 UI를 통한 사용 편의성 강화

### **1. 개인화된 사진 업로드 및 화풍 학습**

- 사용자가 약 10장의 개인화된 사진을 업로드하여, AI가 개별적인 예술 화풍을 학습할 수 있는 데이터를 제공
- Transfer Learning 및 LoRA 기법을 활용하여 소량의 데이터로도 맞춤형 화풍 모델을 효과적으로 생성

### **2. 화풍 모델 저장 및 공유**

- 화풍 모델을 저장하여 개인의 학습 결과물을 선택적으로 보관
- 저장된 화풍 모델은 커뮤니티 내에서 다른 사용자들도 활용할 수 있으며, 인기 모델 랭킹 기능을 통해 추천받은 모델을 쉽게 확인 가능

### **3. 선택적 스타일 변환 및 결과물 다운로드**

- 사진 촬영 시 전체 이미지 또는 특정 대상(예: 인물)에 대해 선택적으로 스타일 변환을 적용 가능
- 완성된 예술 사진 결과물은 이미지 저장 기능을 통해 다운로드 가능
- 본인이 그린 밑그림을 선택한 화풍으로 만들어주는 기능

### **4. 마음에 드는 그림 연습하기**

- 사용자가 연습하고 싶은 그림을 업로드하면, 그림 연습을 돕는 **가이드 기능**을 제공
    - **테두리 가이드** – 원본 이미지의 외곽선(테두리)만 추출하여 제공
    - **밑그림 제공** – 명암을 단순화한 밑그림을 생성하여 따라 그릴 수 있도록 지원
    - **연습 모드** – 사용자가 직접 그림을 그리면서 비교할 수 있는 인터페이스 제공
    - 키워드로 입력해도 밑그림 나오게 한 후 화풍 반영

## **프로젝트의 차별점/독창성 (기술 관점) / AI 기술**

### **사용자 제공 데이터를 기반으로 개별화된 화풍 학습**

- 사용자가 올린 그림을 바탕으로 **Transfer Learning**을 통해 미세 조정)
- LoRA (Low-Rank Adaptation)를 사용해 특정 스타일만 빠르게 학습

### **객체 선택 변환 (배경 vs 인물 구분)**

- **YOLO / SAM (Segment Anything Model)**: 이미지에서 인물 & 배경 분리
- **OpenCV + Mask R-CNN**: 특정 객체만 스타일 적용

**이미지 증강 기법 추가하기**

### **추가 추천 기술**

- Neural Style Transfer와 세분화(Semantic Segmentation) 기법을 결합한 알고리즘 적용
- 전이 학습(Fine-tuning) 기법을 활용해 소량의 데이터로 빠른 모델 업데이트 가능

## **프론트/모바일 프레임워크**

- Flutter
- Android Studio

## **백엔드 프레임워크**

- FastAPI
- Spring Boot
- Java 17

## **주요 기술 스택**

- **프론트엔드**: Flutter, React
- **백엔드**: FastAPI, Spring Boot
- **AI 모델링**: Python, PyTorch/TensorFlow, OpenCV
- **데이터베이스**: MySQL, Redis
- **배포 및 인프라**: Docker, Jenkins, Nginx, AWS

---
