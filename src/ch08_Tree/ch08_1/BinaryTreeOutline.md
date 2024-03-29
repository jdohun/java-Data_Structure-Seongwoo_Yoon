## 트리의 개요

### 트리(Tree)의 접근

- 트리는 계층적 관계(Hierarchical Relationship)을 표현하는 자료구조이다.
- 트리는 데이터의 저장과 삭제가 아닌 `표현`에 초점이 맞춰져있다.
    - `트리의 구조로 이루어진 무엇인가를 표현하기에 적절하게 정의되었는가?`에 집중해야한다.
        - `데이터의 저장, 감색 및 삭제가 용이하게 정의되었는가` X

### 트리가 표현할 수 있는 것들

- 컴퓨터의 디렉터리 구조
- 집안의 족보
- 기업 및 정부의 조직도
- `의사 결정 트리(decision tree)`
- #### 공통점: `가지를 늘려가며 뻗어나간다.`

### 트리 관련 용어의 소개

- A
    - B
        - E
        - F
    - C
    - D
      <br><br>
- 노드: node
  <br>트리의 구성요소에 해당하는 A, B, C, D, E, F와 같은 요소
  <br><br>
- 간선: edge
  <br>노드와 노드를 연결하는 연결선
  <br><br>
- 루트 노드: root node
  <br>트리 구조에서 최상위에 존재하는 A와 같은 노드
  <br><br>
- 단말 노드: terminal node
  <br>아래로 또 다른 노드가 연결되어 있지 않은 노드
  <br>나무의 구조상 잎에 해당하여 `잎사귀 노드(leaf node)`라고도 불린다.
  <br><br>
- 내부 노드: internal node
  <br>단말 노드를 제외한 모든 노드(root 포함)
  <br>단말 노드가 아니라 하여 `비단말 노드(nonterminal node)`라고도 불린다.
  <br><br>
- 노드 간에는 부모(parent), 자식(child), 형제(sibling)의 관계가 성립된다.
    - 추가로 조상(Ancestor), 후손(Descendant)의 관계도 존재한다.
      <br><br>
    - 트리 구조상 위에 있을 수록 촌수가 높다.
        - 노드 A는 B, C, D의 부모 노드(parent node)이다.
        - 노드 B, C, D는 A의 자식 노드(child node)이다.
        - 노드 B, C, D는 부모 노드가 같으므로, 서로가 서로에게 형제 노드(sibling node)이다.
        - 노드 B는 노드 A의 자식 노드인 동시에 노드 E, F의 부모 노드이다.
        - 노드 A와 B 는 노드 E, F의 조상 노드(Ancestor node)이다.
        - 반대로 노드 B, C, D, E, F는 모두 노드 A의 후손 노드(Descendant node)이다.

### 이진 트리(Binary Tree)와 서브 트리(Sub Tree)

- A
    - B
        - D
            - I
            - J
        - E
            - K
    - C
        - F
        - G
        - H
          <br><br>

#### 이진 트리의 필수 조건

- 루트 노드를 중심으로 두 개의 서브 트리로 나뉘어진다.
- 나뉘어진 두 서브 트리도 모두 이진 트리이어야 한다.
    - 노드가 위치할 수 있는 곳에 노드가 존재하지 않는다면, 공집합(empty set) 노드가 존재하는 것으로 간주한다.
        - 공집합 노드도 이진 트리의 판단에 있어서 노드로 인정한다.

#### 포화 이진 트리(Full Binary Tree)와 완전 이진 트리(Complete Binary Tree)

- A <- 레벨 0
    - B <- 레벨 1
        - D <- 레벨 2
            - F <- 레벨 3
            - G
        - E
            - H
    - C
      <br>

|------높이-------|

- 높이의 값 == 말단 노드의 레벨
- 높이의 정의 != 말단 노드의 레벨
  <br><br>

#### 포화 이진 트리 && 완전 이진 트리

- A
    - B
        - D
        - E
    - C
        - F
        - G
          <br><br>

#### 그냥 이진 트리

- A
    - B
        - D
    - C
        - E
        - F
          <br>