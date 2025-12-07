
fun main() {
    greetPlayer()
    greetPlayer()

    showChatMessage(text = "Привет, рыцарь!")
    showChatMessage(text = "Враг приближается!")

    showPlayerStats(name = "Aragon", health = 100)
    showPlayerStats(name = "Legolas", health = 85)

    createCharacter(name = "Арагорн", level = 10, classType = "Рыцарь")
    createCharacter(name = "Легопас", level = 5)
    createCharacter(name = "Гэндальф")

    createItem(name = "Меч", price = 50)
    createItem(price = 200, name = "Зелье")
    createItem(name = "Посох", isMagic = true, price = 150)

    val sword = mutableListOf("Меч")
    upgradeWeapon(weapon = sword)
    println(sword)

    val damage = calculateDamage(baseDamage = 50, multiplier = 1.5)
    println("Нанесён урон: $damage HP")

    showWarning("Низкий уровень здоровья!")

    println(isPlayerAlive(health = 10))
    println(isPlayerAlive(health = 0))

    val a = sum(a = 1, b = 2)
    val b = sum(a = 1.5, b = 2.5)
    val c = sum(a = 1, b = 2, c = 3)
    val d = sum(a = 2, b = 1.5)
    val e = sum(a = 1.5, b = 2)
    attack()
    attack1(enemy = "Гоблин")
    attack2(enemy = "Дракон", damage = 50)

    attack3(target = "Орк")
    attack4(targetId = 1001)

    usePotion(name = "Лечебное", power = 50)
    usePotion(power = 30, name = "Магическое")

    greet("Игрок")
    val sum = fun(x: Int, y: Int): Int = x + y
    println(sum(10,15))
    println(
        fun(a: Int, b: Int): Int {
            return a+b
        }
            (10,15))

    val hello = { println("hello Kotlin") }
    hello()
    hello()
    val hello1: ()->Unit = {println("hello Kotlin")}
    attack("Гоблин")
    println("Урон: ${calculateDamage(10, 1.5)}")
    val numbers = listOf(1, 2, 3)
    val doubled = numbers.map { it * 2 }
    println(doubled)
    val numbers1 = listOf(1, 2, 3, 4, 34, 56, 67, 89, 10, 23)
    val doubled1 = numbers1.map { it % 2 == 0 }
    println(doubled1)
    val numbers2 = listOf(1, 2, 3, 4, 34, 56, 67, 89, 10, 23)
    val doubled2 = numbers2.filter { it % 2 == 0 }
    println(doubled2)
    applyEffect { it + 20 }
    applyEffect { it - 50 }
    onEvent(eventType = "Дождь") {
        println("Игрок получает эффект 'Мокрый'")
    }

    val kills = createCounter()
    println(kills())
    println(kills())
}
fun greetPlayer(){
    println("добро пожаловать в игру!")
}
fun showChatMessage(text: String) {
    println(text)
}
fun showPlayerStats(name: String, health: Int) {
    println("Игрок: $name | Здоровье: $health HP")
}
fun createCharacter(name: String, level: Int = 1, classType: String = "Новичок") {
    println("Имя: $name | Уровень: $level | Класс: $classType")
}
fun createItem(name: String, price: Int, isMagic: Boolean = false) {
    println("Предмет: $name | Цена: $price${if (isMagic) " (магический)" else ""}")
}
fun upgradeWeapon(weapon: MutableList<String>) {
    weapon.add("Улучшение +1")
}
fun calculateDamage(baseDamage: Int, multiplier: Double): Int {
    return (baseDamage * multiplier).toInt()
}
fun showWarning(message: String): Unit {
    println("ВНИМАНИЕ: $message")
}
fun isPlayerAlive(health: Int): Boolean = health > 0
fun sum(a: Int, b: Int): Int {
    return a + b
}
fun sum(a: Double, b: Double): Double {
    return a + b
}
fun sum(a: Int, b: Int, c: Int): Int {
    return a + b + c
}
fun sum(a: Int, b: Double): Double {
    return a + b
}
fun sum(a: Double, b: Int): Double {
    return a + b
}
fun attack() {
    println("Атака по воздуху!")
}
fun attack1(enemy: String) {
    println("Атакован $enemy!")
}
fun attack2(enemy: String, damage: Int) {
    println("Атакован $enemy с уроном $damage HP!")
}
fun attack3(target: String) {
    println("Атакован $target!")
}
fun attack4(targetId: Int) {
    println("Атакован враг с ID $targetId!")
}
fun usePotion(name: String, power: Int) {
    println("Использовано $name (+$power HP)")
}
fun usePotion1(power: Int, name: String) {
    println("Использовано $name (+$power MP)")
}
val greet = fun(name: String) {
    println("Привет, $name!")
}
val attack = { enemy: String -> println("Атакован $enemy!") }
val calculateDamage = { base: Int, multiplier: Double -> (base * multiplier).toInt() }
val sum1 = fun(x: Int, y: Int): Int {
    return x + y
}
val sum2 = fun(x: Int, y: Int): Int = x + y
val sum3 = { x: Int, y: Int -> x + y }
val sum4: (Int, Int) -> Int = { x, y -> x + y }

fun applyEffect(effect: (Int) -> Int) {
    val health = 100
    println("Новое здоровье: ${effect(health)}!")
}
fun onEvent(eventType: String, action: (String) -> Unit) {
    println("Событие: $eventType")
    action(eventType)
}
fun createCounter(): () -> Int {
    var count = 0
    return { ++count }
}
