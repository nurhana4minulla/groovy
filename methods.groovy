// Method with a default parameter
def greetPlayer(name, level = 1) {
    "Welcome $name! You are level $level." 
}

println greetPlayer("Nur")       // Output: Welcome Nur! You are level 1.
println greetPlayer("Adi", 5)  // Output: Welcome Adi! You are level 5.