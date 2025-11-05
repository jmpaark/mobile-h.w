package game1

class Griffin(name: String) : Unit(name, isFlying = true), Attackable {

    override fun move(point: Pair<Int, Int>) {
        println("$(가) 날아서 [$point]로 이동합니다.")
    }

    override fun attack(target: Unit) {
        if (target.isFlying) {
            println("$name(가) ${target.name}을(를) 공격할 수 없습니다. (공중 유닛)")
        } else {
            println("$name(가) ${target.name}에게 번개를 내리칩니다.")
        }
    }
}