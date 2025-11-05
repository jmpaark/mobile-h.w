package game1

fun main() {
    // 1. 유닛 생성
    val knights = List(16) { i -> Knight("Knight${i + 1}") }
    val archers = List(3) { i -> Archer("Archer${i + 1}") }
    val shuttles = List(4) { i -> Shuttle("Shuttle${i + 1}") }
    val griffins = List(5) { i -> Griffin("Griffin${i + 1}") }

    // 2. 유닛 탑승 (실행 예제 1번째 열과 동일한 순서)
    println("--- 유닛 탑승 ---")
    val k = knights
    val a = archers
    val s = shuttles

    // Shuttle1 탑승 (8기)
    s[0].load(k[0]); s[0].load(a[0]); s[0].load(k[1]); s[0].load(a[1]);
    s[0].load(k[2]); s[0].load(a[2]); s[0].load(k[3]); s[0].load(k[4]);

    // Shuttle2 탑승 (8기)
    s[1].load(k[5]); s[1].load(k[6]); s[1].load(k[7]); s[1].load(k[8]);
    s[1].load(k[9]); s[1].load(k[10]); s[1].load(k[11]); s[1].load(k[12]);

    // Shuttle3 탑승 (3기)
    s[2].load(k[13]); s[2].load(k[14]); s[2].load(k[15]);

    // Shuttle4는 비어있음

    println("\n--- 유닛 이동 ---")
    // 3. 유닛 이동 (실행 예제 2번째 열 상단)
    val destination = Pair(10, 10)

    // 모든 셔틀과 그리핀 이동
    val allFlyers = shuttles + griffins
    for (unit in allFlyers) {
        unit.move(destination)
    }

    println("\n--- 유닛 하차 ---")
    // 4. 유닛 하차 (실행 예제 2번째 열 하단)
    for (shuttle in shuttles) {
        shuttle.unload() // 승객이 있는 S1, S2, S3만 출력됨
    }

    println("\n--- 유닛 전투 ---")
    // 5. 유닛 전투 (실행 예제 3번째 열)

    // 전투 시나리오에 필요한 유닛 선택
    val k1 = knights[0]
    val k2 = knights[1]
    val a1 = archers[0]
    val g1 = griffins[0]
    val g2 = griffins[1]
    val s1 = shuttles[0]

    // Knight1의 공격
    k1.attack(k2)     // K1 -> K2 (지상)
    k1.attack(g1)     // K1 -> G1 (공중)
    k1.attack(s1)     // K1 -> S1 (공중)

    // Archer1의 공격
    a1.attack(k1)     // A1 -> K1 (지상)
    a1.attack(g1)     // A1 -> G1 (공중)
    a1.attack(s1)     // A1 -> S1 (공중)

    // Griffin1의 공격
    g1.attack(k1)     // G1 -> K1 (지상)
    g1.attack(a1)     // G1 -> A1 (지상)
    g1.attack(g2)     // G1 -> G2 (공중)
    g1.attack(s1)     // G1 -> S1 (공중)
}