package game1

class Archer(name: String) : Unit(name, isFlying = false), Attackable {

    override fun move(point: Pair<Int, Int>) {
        println("$name(가) 걸어서 [$point]로 이동합니다.")
    }

    override fun attack(target: Unit) {
        // 궁수는 지상, 공중 유닛 모두 공격 가능
        println("$name(가) ${target.name}을(를) 화살로 공격합니다.")
    }
}