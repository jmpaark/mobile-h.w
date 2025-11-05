package game1

interface Attackable {
    /**
     * 대상 유닛을 공격합니다.
     * @param target 공격할 대상 Unit
     */
    fun attack(target: Unit)
}