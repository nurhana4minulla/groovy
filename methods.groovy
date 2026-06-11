// Method with a default parameter
def greetPlayer(name, level = 1) {
    "Welcome $name! You are level $level." // Note: No 'return' keyword needed
}

println greetPlayer("Nur")       // Output: Welcome Addie! You are level 1.
println greetPlayer("Adi", 5)  // Output: Welcome Yamato! You are level 5.