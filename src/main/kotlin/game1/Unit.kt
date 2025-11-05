package game1

abstract class Unit(val name: String, val isFlying: Boolean) {
    /**
     * 유닛을 지정된 위치로 이동시킵니다.
     * @param point 이동할 2차원 좌표 (Pair<Int, Int>)
     */
    abstract fun move(point: Pair<Int, Int>)
}