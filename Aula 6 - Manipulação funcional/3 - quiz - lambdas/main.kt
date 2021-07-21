fun main(){
    val game = Game()
    println(game.path)
    // [START]
    
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()
    //Game Over: [START, NORTH, SOUTH, EAST, WEST, END]
    
    println(game.path)
    // []
}