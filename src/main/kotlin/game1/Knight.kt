package game1

class Knight(name: String) : Unit(name, isFlying = false), Attackable {

    override fun move(point: Pair<Int, Int>) {
        println("$name(가) 말을 타고 [$point]로 이동합니다.")
    }

    override fun attack(target: Unit) {
        if (target.isFlying) {
            println("$name(가) ${target.name}을(를) 공격할 수 없습니다. (공중 유닛)")
        } else {
            println("$name(가) ${target.name}을(를) 창으로 찌릅니다.")
        }
    }
}