//задача 1
/*fun showGameLogo()
{
    println("=== EPIC QUEST ===")
}*/
// задача 2
/*fun showEnemy(name: String, level: Int)
{
    println("Враг: $name (Уровень: $level)")
}*/
//задача 3
/*fun spawnEnemy(name: String, health: Int = 100, isBoss: Boolean = false) {
    println("Враг: $name (Здоровье: $health HP${if (isBoss) " | БОСС!" else ""}")
}*/
//задача 4
/*fun spawnEnemy(name: String, health: Int = 100, isBoss: Boolean = false) {
    println("Враг: $name (Здоровье: $health HP${if (isBoss) " | БОСС!" else ""}")
}*/
//задача 5
/*fun  calculateXP(level: Int): Int
{
    return level * 1000
}*/
//задача 6
/*fun checkInventory(item: String): Boolean
{
    val invent = listOf("Меч","Щит","Хахатушка")
    return item in invent
}*/
//задача 7
/*fun castSpell()
{
    println("Каст случайного заклинания!")
}
fun castSpell(spell: String)
{
    println("Каст заклинания $spell!")
}
fun castSpell(spell: String, power: Int)
{
    println("Каст $spell с силой $power!")
}*/
//задача 8
/*fun createWeapon(name: String)
{
    println("Оружие: $name")
}
fun createWeapon(name: String, damage: Int)
{
    println("Оружие: $name (Урон:$damage)")
}
fun createWeapon(damage: Int, isMagic: Boolean)
{
    println("${if (isMagic)"Магическое" else "Обычное"} оружие (Урон: $damage)")
}*/

fun heal()
{
    println("ваше хп = 100")
}
fun heal(amount: Int)
{
    println("ваше хп = ${amount + 100}")
}
fun heal(amount: Int, isPotion: Boolean)
{
    if (isPotion)
    {
        println( "Выпито зелье (+$amount HP)")
    }
    else
    {
        println("Заклинание лечения (+$amount HP)")
    }
}
