package game1

class Shuttle(name: String) : Unit(name, isFlying = true) {

    private val passengers = mutableListOf<Unit>()
    private val maxCapacity = 8

    override fun move(point: Pair<Int, Int>) {
        println("$(가) 날아서 [$point]로 이동합니다.")
    }

    /**
     * 유닛을 수송선에 태웁니다.
     * @param unit 탑승할 유닛
     */
    fun load(unit: Unit) {
        if (passengers.size < maxCapacity) {
            passengers.add(unit)
            println("$name{unit.name}이(가) $ 탑승합니다.")
        } else {
            println("$(가) 꽉 찼습니다. ${unit.name}이(가) 탑승할 수 없습니다.")
        }
    }

    /**
     * 수송선에 탑승한 모든 유닛을 내리게 합니다.
     */
    fun unload() {
        // 승객이 있을 때만 하차 메시지 출력
        if (passengers.isNotEmpty()) {
            println("$(가) 모든 승객을 내립니다:")
            for (unit in passengers) {
                println("${unit.name}이(가) 내립니다.")
            }
            passengers.clear()
        }
    }
}