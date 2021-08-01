# JAVA

## JDK

> Java Development Kit

- JDK > JRE > API > JVM

- JDK는 컴파일러와 클래스 라이브러리(Class Library)를 포함하는, 자바 플랫폼 사양서의 구현이다.

- JDK는 `JRE`, `Java 컴파일러` 등으로 구성되어 있다.

  - `Java 컴파일러`는 `.java` 파일을 `.class`라는 Java Byte Code로 변환한다.

- **개발자는 JDK가 있어야 Java 프로그램을 개발할 수 있고, 단지 Java 프로그램을 사용하는 사용자라면 JRE만 설치되어 있으면 된다.**

## JRE

> Java Runtime Environment

- JRE는 컴파일된 Java Byte Code를 필요한 라이브러리와 결합한 다음, 이 코드를 실행할 JVM을 시작하는 온디스크 시스템이다.

- JRE에는 `Java Class Libraries`, `Java Class Loader`, `JVM`이 포함된다.

  - `Java Class Loader`은 `.class` 클래스 파일의 위치를 찾아서 JVM 위에 올려놓는다.

- JRE는 Java 프로그램이 거의 모든 운영체제에서 수정 없이 실행될 수 있도록 한다.

  - 한 번 쓰고 모든 곳에서 실행한다(Write Once, Run Anywhere, WORA)

## JVM

> Java Virtual Machine

- JVM은 코드를 실행하고 해당 코드에 대해 런타임 환경을 제공하는 소프트웨어 프로그램에 대한 사양(Specification)이다.

- JVM은 OS가 Java Byte Code를 이해할 수 있도록 OS에 맞게 해석해준다. 이때 `Interpreter`, `JIT(Just-In-Time)` 방식을 사용한다.

  - JIT는 인터프리터의 단점을 보완하기 위해 도입된 컴파일러이다. 인터프리터 방식으로 실행하다가 적절한 시점에서 `Java Byte Code` 전체를 컴파일하여 네이티브 코드로 변경하고, 이후에는 더 이상 인터프리팅 하지 않고 네이티브 코드로 직접 실행하는 방식이다. 네이티브 코드는 캐시에 보관하기 때문에 한 번 컴파일된 코드는 빠르게 수행하게 한다.

- JVM은 GC를 통해 프로그램의 메모리 관리를 자동으로 해준다.
