plugins {
    kotlin("jvm") version "1.9.20"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("game1.MainKt")
}

// 1. Kotlin 컴파일러의 툴체인(JVM 버전)을 17로 지정
kotlin {
    jvmToolchain(17)
}

// 2. Java 컴파일러의 툴체인(JVM 버전)을 17로 지정
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.test {
    useJUnitPlatform()
}

// 3. 컴파일러 설정: 잘못된 인수인 '-encoding'을 제거합니다.
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    compilerOptions {
        // freeCompilerArgs.addAll("-encoding", "UTF-8") // <- 이 줄을 제거했습니다.
    }
}

// build.gradle.kts 파일의 맨 아래, 이전에 추가했던 블록을 찾아 수정합니다.

// 4. 실행 설정: 한글 출력 인코딩을 UTF-8로 강제 지정합니다.
tasks.withType<JavaExec> {
    jvmArgs = listOf(
        "-Dfile.encoding=UTF-8",
        // 이 부분을 추가하여 출력 인코딩도 UTF-8로 지정합니다.
        "-Dstdout.encoding=UTF-8"
    )
}