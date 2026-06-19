class Hero {
    // These are automatically private, but Groovy creates public getters/setters!
    String name
    int powerLevel
}

// We can use the auto-generated Map constructor
def myHero = new Hero(name: "Infernus", powerLevel: 9000)

println "${myHero.name} has a power level of ${myHero.powerLevel}"